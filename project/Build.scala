import sbt._
import sbt.Keys._
import play.Project._

object ApplicationBuild extends Build {
  val appName = "ebean"
  val appVersion = "0.1.0-SNAPSHOT"
  val appDependencies = Seq(jdbc, filters, javaEbean)
  val main = play.Project(appName, appVersion, appDependencies).settings()
}