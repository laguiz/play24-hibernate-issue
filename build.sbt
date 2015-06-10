import play.sbt.PlayImport._

name := """play24-hibernate-issue"""

version := "1.0-SNAPSHOT"

lazy val `java-mapping` = Project("java-mapping", file("."))
  .enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc
  , evolutions
  , javaJpa
  , "org.hibernate" % "hibernate-entitymanager" % "4.3.9.Final"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
