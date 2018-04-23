package queries

import slick.jdbc.H2Profile.api._
import schema.Tables._

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import java.io._

object ListSzav extends Query {
  def run(implicit db: Database):Unit = {
    val affiliation = for {
      jelolt <- Ejelolt
      part <- Jlcs if jelolt.jlcs === part.jlcs
    } yield (jelolt, part)

    val telepAdat = for {
      szavf <- Szavf
      terulet <- Terulet if terulet.maz === szavf.maz
      telep <- Telep if (telep.maz === terulet.maz && telep.taz === szavf.taz)
    } yield (szavf, terulet, telep)

    val szavazatok = telepAdat join Szavt on { case ((szavf, terulet, telep), szavt) => szavf.jfid === szavt.jfid }

    val listasSzavazatok = szavazatok join Tlista on { case (((szavf, terulet, telep), szavt), tlista) => szavt.jlid === tlista.tlid }
    val egyeniSzavazatok = szavazatok join affiliation on { case (((szavf, terulet, telep), szavt), (jelolt, part)) => szavt.jlid === jelolt.eid }

    val listaResult = listasSzavazatok.map { case (((szavf, terulet, telep), szavt), tlista) => (
      terulet.mnev,
      telep.tnev,
      szavf.sorsz.get,
      tlista.tlid,
      tlista.tnev,
      szavt.szav
    )
    }

    val egyeniResult = egyeniSzavazatok.map { case (((szavf, terulet, telep), szavt), (jelolt, part)) => (
      terulet.mnev,
      telep.tnev,
      szavf.sorsz.get,
      jelolt.dr.getOrElse(""),
      jelolt.nev,
      jelolt.unev1,
      jelolt.unev2.getOrElse(""),
      part.nevt,
      szavt.szav
    )
    }

    val lw = new BufferedWriter(new FileWriter(new File("results/lista.csv")))

    val listaFuture = db.run(listaResult.result)

    lw.write(Await.result(listaFuture, Duration.Inf).map { case (s1, s2, s3, s4, s5, i1) => {s"$s1, $s2, $s3, $s5 ($s4), $i1"}}.mkString("\n"))
    lw.flush()
    lw.close()

    val ew = new BufferedWriter(new FileWriter(new File("results/egyeni.csv")))

    val egyeniFuture = db.run(egyeniResult.result)

    ew.write(Await.result(egyeniFuture, Duration.Inf).map { case (mnev, tnev, sorsz, dr, nev, unev1, unev2, nevt, szav) => s"$mnev, $tnev, $sorsz, $dr $nev $unev1 $unev2, $nevt, $szav" }.mkString("\n"))
    ew.flush()
    ew.close()
  }
}
