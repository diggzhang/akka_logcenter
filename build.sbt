name := "akka_logcenter"

version := "0.1"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"   % "10.1.1",
  "com.typesafe.akka" %% "akka-stream" % "2.5.11",
  "ch.megard" %% "akka-http-cors" % "0.3.0",
  "com.typesafe.play" %% "play-json" % "2.6.9"
)
