package helpers

import java.io.File
import scala.io.Source
import slick.jdbc.H2Profile.api._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object SqlHelperImplicits{
	implicit class SqlFromFile(db:Database){
		def execFile(path:Seq[String]):Future[Any] = {
			val futures = path.map(file => {
				val source = Source.fromFile(file)("UTF-8")
				val cmd:String = source.getLines.mkString
				db.run(sql"#$cmd".as[Int]) //not safe for user input
			})
			
			Future.sequence(futures)
		}
	}
}