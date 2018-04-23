// Import the Slick interface for H2:
import java.io.{File, PrintWriter}

import slick.jdbc.H2Profile.api._
import helpers.SqlHelpers
import helpers.SqlHelperImplicits._

import scala.util.{Failure, Success}
import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import schema.Tables._
import queries._

object Main extends App {
  implicit val db = Database.forConfig("election_analysis")
  val importSchemaFuture = db.execFile("schema.sql")
	
  val importFuture = importSchemaFuture.flatMap(_ => db.execFile(SqlHelpers.sqlFiles))
  Await.result(importFuture, 180.seconds)
  
  importSchemaFuture.onComplete {
    case Success(i) => {
      importFuture.onComplete {
        case Success(i) => println("Database import successful")
        case Failure(f) => println("Database import unsuccessful")
      }
    }

    case Failure(f) => println("Schema import unsuccessful")
  }

  ListSzav.run

  //println(Await.result(db.run(TableQuery[Verzio].result), 2.seconds))
  
  println("Hello world!")
}
