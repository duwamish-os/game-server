package controllers

import play.api.libs.json.Json
import play.api.mvc._

class ApiController extends Controller {

  def game = Action {

    val posts = List(
      Map("player" -> "upd",
        "score" -> "1000"),

      Map("player" -> "dude",
        "score" -> "999"))

    Ok(Json.toJson(posts))
  }

}

object ApiController {
  lazy val instance = new ApiController
}
