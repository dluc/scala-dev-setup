val akkaStreamVersion = "2.4.11"
val json4sVersion = "3.4.1"
val azureEventHubSDKVersion = "0.8.2"
val azureStorageSDKVersion = "4.4.0"
val datastaxDriverVersion = "3.0.2"
val iothubreactVersion = "0.7.0"

interp.load.ivy("com.lihaoyi"             %% "ammonite-shell"       % ammonite.Constants.version)
interp.load.ivy("com.microsoft.azure.iot" %% "iothub-react"         % iothubreactVersion)
interp.load.ivy("com.microsoft.azure"     % "azure-eventhubs"       % azureEventHubSDKVersion)
interp.load.ivy("com.microsoft.azure"     % "azure-storage"         % azureStorageSDKVersion)
interp.load.ivy("com.typesafe.akka"       %% "akka-stream"          % akkaStreamVersion)
interp.load.ivy("org.json4s"              %% "json4s-native"        % json4sVersion)
interp.load.ivy("org.json4s"              %% "json4s-jackson"       % json4sVersion)
interp.load.ivy("com.datastax.cassandra"  % "cassandra-driver-core" % datastaxDriverVersion)

@
val shellSession = ammonite.shell.ShellSession()
import shellSession._
import ammonite.shell.PPrints._
import ammonite.ops._
import ammonite.shell._


// Scala
// import scala.language.{implicitConversions, postfixOps}

// json4s
// import org.json4s.native.JsonMethods._
// import org.json4s.jackson.JsonMethods._
// import org.json4s.JsonAST._
// import org.json4s.JsonDSL._

// Akka
// import akka.actor.{ActorRef, ActorSystem, Props}
// import akka.stream.{ActorMaterializer, ActorMaterializerSettings, Supervision}
// import akka.stream.scaladsl.Sink

// Toketi iothub-react
// import com.microsoft.azure.iot.iothubreact.scaladsl._
// import com.microsoft.azure.iot.iothubreact._

// Azure
// import com.microsoft.azure.storage.blob._
// import com.microsoft.azure.storage._

// Cassandra
// import com.datastax.driver.core._



// Start Ammonite
ammonite.shell.Configure(repl, wd)

repl.colors().prompt() = fansi.Color.Green