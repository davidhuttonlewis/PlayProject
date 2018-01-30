package controllers

import akka.util.ByteString
import play.api.http.HttpEntity
import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def contactUS = Action {
    Ok(views.html.contactUs())
  }

}