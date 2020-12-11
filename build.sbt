import sbt.project

name := "scala-at-light-speed"

version := "0.1"

scalaVersion := "2.12.9"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.0.1",
  "org.apache.spark" %% "spark-sql" % "3.0.1",
  "io.delta" %% "delta-core" % "0.7.0"
)