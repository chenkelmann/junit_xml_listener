sbtPlugin := true

name := "junit_xml_listener"

description := "A simple plugin that outputs JUnit-Style XML Files that contain Test results."

scalaVersion := "2.9.2"

publishMavenStyle := true

organization := "eu.henkelmann"

resolvers += "Scala Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/" 

resolvers += "Scala" at "https://oss.sonatype.org/content/groups/scala-tools/"

version := "0.4-SNAPSHOT"

crossScalaVersions in ThisBuild := Seq("2.9.1", "2.9.2")

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
  <url>https://github.com/chenkelmann/actuarius</url>
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


