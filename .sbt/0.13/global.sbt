// Scala version used by SBT, many plugins won't work with 2.11
//scalaVersion := "2.11.8"

resolvers += "bintray-sbt-plugins"    at "http://dl.bintray.com/sbt/sbt-plugin-releases"
resolvers += "softprops-maven"        at "http://dl.bintray.com/content/softprops/maven"
resolvers += "Toketi Snapshots"       at "https://dl.bintray.com/microsoftazuretoketi/toketi-repo"
resolvers += "JCenter"                at "http://jcenter.bintray.com"
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/releases"
resolvers += "sonatype-releases"      at "https://oss.sonatype.org/content/repositories/releases/"
resolvers += "Typesafe Releases"      at "http://repo.typesafe.com/typesafe/releases"
resolvers += "artifactory"            at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"


// to use Ammonite in sbt test:console
libraryDependencies += "com.lihaoyi" % "ammonite" % "0.7.4" % "test" cross CrossVersion.full

initialCommands in (Test, console) := """ammonite.Main().run()"""