sbtPlugin := true

name := "junit_xml_listener"

organization := "eu.henkelmann"

version := "0.4-SNAPSHOT"

scalacOptions := Seq("-deprecation", "-unchecked")

publishMavenStyle := true

publishTo := Some(Resolver.file("Development Repo", file((Path.userHome / "srv" / "maven").toString)))
