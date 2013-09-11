sbtPlugin := true

name := "junit_xml_listener"

description := "A simple plugin that outputs JUnit-Style XML Files that contain Test results."

//sbtVersion := "0.11.3"

//scalaVersion := "2.9.1"

//sbtVersion := "0.12.0"

//scalaVersion := "2.9.2"

//sbtVersion := "0.12.1"

//scalaVersion := "2.9.2"

//sbtVersion := "0.12.2"

//scalaVersion := "2.9.2"

//looks like that after much trial and error this seems to be the right definition for sbt 0.12.x

//sbtVersion := "0.12"

//scalaVersion := "2.9.2"

sbtVersion := "0.13"

scalaVersion := "2.10.2"



publishMavenStyle := true

organization := "eu.henkelmann"

version := "0.4-SNAPSHOT"

scalacOptions := Seq("-deprecation", "-unchecked")

publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/chenkelmann/junit_xml_listener</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>http://opensource.org/licenses/MIT</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://github.com/chenkelmann/junit_xml_listener.git</url>
    <connection>scm:git:git://github.com/chenkelmann/junit_xml_listener.git</connection>
  </scm>
  <developers>
  <developer>
    <id>chenkelmann</id>
    <name>Christoph Henkelmann</name>
    <url>http://henkelmann.eu/</url>
  </developer>    
  </developers>)


