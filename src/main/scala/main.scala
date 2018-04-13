// Import the Slick interface for H2:
import slick.jdbc.H2Profile.api._
import scala.concurrent.ExecutionContext.Implicits.global

import schema.Tables._

object Main extends App {
  val db = Database.forConfig("election_analysis")
  
  println("Hello world!")
}
