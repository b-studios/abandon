import sbt._
import Keys._

object Dependencies {
  // Versions
  val scalatestVersion = "3.0.7"
  val scallopVersion = "3.2.0"
  val scalaMockVersion = "3.6.0"
  val configVersion = "1.3.4"
  val scalaXMLVersion = "1.2.0"
  val scalaParserCombinatorsVersion = "1.1.2"
  val scalaFXVersion = "8.0.181-R13"
  val dirSuiteVersion = "0.6.0"

  // Libraries
  val scalatest = "org.scalatest" %% "scalatest" % scalatestVersion
  val scalamock = "org.scalamock" %% "scalamock-scalatest-support" % scalaMockVersion
  val scallop = "org.rogach" %% "scallop" % scallopVersion
  val config = "com.typesafe" % "config" % configVersion
  val scalaXML = "org.scala-lang.modules" %% "scala-xml" % scalaXMLVersion
  val scalaParserCombinators = "org.scala-lang.modules" %% "scala-parser-combinators" % scalaParserCombinatorsVersion
  val scalaFX = "org.scalafx" %% "scalafx" % scalaFXVersion
  val dirSuite =  "fi.sn127" %% "utils-testing" % dirSuiteVersion
}
