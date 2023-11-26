ThisBuild / version := "0.1.1"
ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "Assignment 2",
    libraryDependencies += "at.favr" % "lib.crypto" % "0.1.0" from file("lib/bcrypt-0.10.2.jar").toURI.toASCIIString
  )

libraryDependencies ++= Seq(
  guice
)

