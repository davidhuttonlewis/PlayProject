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

  def boardGames = TODO

  def cardGames = TODO

  def rpgs = TODO

  def minatures = TODO

  def accessorries = TODO

  def basket = TODO





}