package controllers

import akka.util.ByteString
import play.api.http.HttpEntity
import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def home = Action {
    Ok("Hello World!")
  }

  def displayName(name: String) = Action {implicit request:
  Request[AnyContent] =>
    Ok(s"Hello $name")
  }

  def indexPage = Action { implicit request:
  Request[AnyContent] =>
    Result(
      header = ResponseHeader(200, Map.empty),
      body = HttpEntity.Strict(ByteString("Hello World!"),
        Some("text/plain"))
    )
  }

  def redirectPage = Action { implicit request: Request[AnyContent] => Redirect("https://tappedout.net")}

}