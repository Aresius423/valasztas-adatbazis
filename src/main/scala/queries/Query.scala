package queries

import slick.jdbc.H2Profile.api._

trait Query {
  def run(implicit db:Database):Unit
}