package helpers

import scala.io.Source
import slick.jdbc.H2Profile.api._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Try,Success,Failure}
import java.io.File

object SqlHelpers{
	def sqlFiles:Seq[String] = {
		val sqls = new java.io.File("./sql").listFiles.filter(_.getName.endsWith(".sql"))
		sqls.map(file => "sql/" + file.getName).reverse
	}

}

object SqlHelperImplicits{
	implicit class SqlFromFile(db:Database){
		def execFile(path:Seq[String]):Future[Any] = {
			val futures = path.map(file => {
				Try(Source.fromFile(file)("UTF-8")) match {
					case Success(src) => {
						val cmd:String = src.getLines.mkString("\r\n")
						db.run(sql"#$cmd".as[Int]) //not safe for user input
					}
					case Failure(f) => {
						println("fuck")
						Future.failed(f)
					}
				}
			})
			
			Future.sequence(futures)
		}
		
		def execFile(path:String):Future[Any] = execFile(Seq(path))
	}
}