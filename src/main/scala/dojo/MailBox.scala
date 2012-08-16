package dojo

class MailBox {

  def handleMsg(msg: PingPongMessage) = msg match{
    case Ping => Pong
    case Pong => Ping
    case _ => None
  }

  def receive(msg: Any) = msg match {
    case pingPong:PingPongMessage => handleMsg(pingPong)
    case "stop" => "stopped"
    case "go" => throw new MatchError("I don't like to go")
    case ("echo", text) => text
    case _ => None
  }

}
