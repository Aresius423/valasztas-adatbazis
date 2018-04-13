name := "election_analysis"

version := "3.2"

scalaVersion := "2.12.3"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-Ywarn-dead-code",
  "-Xfatal-warnings"
)

val slickVersion = "3.2.3"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick"           % slickVersion,
  "com.typesafe.slick" %% "slick-codegen"   % slickVersion,
  "com.h2database"      % "h2"              % "1.4.197",
  "ch.qos.logback"      % "logback-classic" % "1.2.3"
)

//sourceGenerators in Compile += slick.taskValue // Automatic code generation on build

lazy val slick = taskKey[Seq[File]]("Generate Tables.scala")
slick := {
  val dir = (sourceManaged in Compile) value
  val outputDir = dir / "../../../../src/main/scala/"
  val url = "jdbc:h2:mem:test;INIT=runscript from 'schema.sql'" // connection info
  val jdbcDriver = "org.h2.Driver"
  val slickDriver = "slick.jdbc.H2Profile"
  val pkg = "schema"

  val cp = (dependencyClasspath in Compile) value
  
  runner.value.run("slick.codegen.SourceCodeGenerator",
    cp.files,
    Array(slickDriver, jdbcDriver, url, outputDir.getPath, pkg),
    streams.value.log).failed foreach (sys error _.getMessage)

  val file = outputDir / pkg / "Tables.scala"

  Seq(file)
}