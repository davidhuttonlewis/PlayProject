package controllers

import models.stockItem
import play.api.mvc.{Action, Controller}
class BoargameStock extends Controller{


  val games = List(
    stockItem("Gloomhaven","Gloomhaven.jpg", "Gloomhaven","Gloomhaven is a game of Euro-inspired tactical combat in a persistent world of shifting motives", 140.00),
    stockItem("Buffy-the-Vampire-Slayer" ,"buffy.png", "Buffy the Vampire Slayer", "In Buffy the Vampire Slayer: The Board Game, you help Buffy and her friends defend the town of Sunnydale from an onslaught of vampires and demons",40.00))

  def boardgamePage = Action {
    Ok(views.html.itemPage(games))
  }

  def itemDetails(name: String) = Action {

    Ok(views.html.itemDetails(name,games))

  }

}
