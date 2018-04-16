// Import the Slick interface for H2:
import slick.jdbc.H2Profile.api._
import scala.concurrent.ExecutionContext.Implicits.global
import helpers.SqlHelperImplicits._

import schema.Tables._

object Main extends App {
  val db = Database.forConfig("election_analysis")
  val files = Seq(
	"schema.sql"
  )
  
  db.execFile(files)
  
  println("Hello world!")
}
