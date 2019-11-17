scalaVersion := "2.12.8"

lazy val root = (project in file("."))
  .settings(
    name := "functional-programming-principles-in-scala",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % Test,
      "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
    )
  )
