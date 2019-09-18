import Dependencies._

scalaVersion := "2.13.0"

lazy val root = (project in file("."))
  .settings(
    name := "functional-programming-principles-in-scala",
    libraryDependencies += scalaTest % Test,
  )
