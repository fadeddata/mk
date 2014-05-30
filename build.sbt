name := "mage-knight"

version := "0.1"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.0.0"
)

initialCommands in console := "import mageknight._, scenarios._, gamestate._"
