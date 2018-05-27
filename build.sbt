name := "game-server-war"

version := "0.1"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.6"

libraryDependencies += "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.13"
libraryDependencies += "org.codehaus.jackson" % "jackson-core-asl" % "1.9.13"
libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.4"

libraryDependencies += guice

resolvers += "Play2war plugins release" at "http://repository-play-war.forge.cloudbees.com/release/"
