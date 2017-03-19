import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class Example1 extends Actor {
  def receive = {
    case "hello" => println(">> hello")
    case _       => println(">> unhandled msg")
  }
}

object Main extends App {
  val system = ActorSystem("Examle1")
  val helloActor = system.actorOf(Props[Example1], name = "example1")
  helloActor ! "hello"
  helloActor ! "xxx"
}
