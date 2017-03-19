name := "Example#1"

version := "1.0"

libraryDependencies ++= {
val akkaVersion = "2.4.12"
	Seq (
		"com.typesafe.akka" %% "akka-actor" % akkaVersion
	)
}

