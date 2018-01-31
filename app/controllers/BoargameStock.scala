package controllers

import models.stockItem
import play.api.mvc.{Action, AnyContent, Controller, Request}
import views.html.helper.form
class BoargameStock extends Controller{


  val games = List(
    stockItem("Gloomhaven","Gloomhaven.jpg", "Gloomhaven","Gloomhaven is a game of Euro-inspired tactical combat in a persistent world of shifting motives", 140.00,List("All","Co-op","Campiagn")),
    stockItem("Buffy-the-Vampire-Slayer" ,"buffy.png", "Buffy the Vampire Slayer", "In Buffy the Vampire Slayer: The Board Game, you help Buffy and her friends defend the town of Sunnydale from an onslaught of vampires and demons",40.00,List("All","Co-op")),
    stockItem("Cyclades","Cyclades.jpg", "Cyclades","players must buy the favor of the gods", 45.00,List("All","War")),
    stockItem("Onitama","Onitama.png", "Onitama","Onitama is a brilliant little abstract strategy game with a random starting set-up and a set number of actions that really test players abillity to think ahead ", 28.00,List("All","2Player")),
    stockItem("Twilight-Imperium","TwilightImperium.jpg", "Twilight Imperium","Twilight Imperium (Fourth Edition) is a game of galactic conquest in which three to six players take on the role of one of seventeen factions vying for galactic domination", 135.00,List("All","War"))
  )

  def boardgamePage(cat : String) = Action {
    Ok(views.html.itemPage(games,cat))
  }

  def itemDetails(name: String) = Action {

    Ok(views.html.itemDetails(name,games))

  }

  def itemSearch = Action {implicit request:Request[AnyContent] =>

    val search = request.body.asFormUrlEncoded.get("searchInput").head



    Ok(views.html.itemSearch(games.filter(stockItem => stockItem.name.contains(search))))

  }


}
