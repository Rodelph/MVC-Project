ThisBuild / version := "0.1.1"
ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "Assignment 2",
  )

libraryDependencies ++= Seq(
  guice
)