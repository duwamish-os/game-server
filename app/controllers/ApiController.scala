package controllers

import play.api.libs.json.{Json, OWrites, Reads}
import play.api.mvc._

final case class ApiResponse(correlationID: String, scores: List[Map[String, String]])

object ApiResponse {
  implicit val reads: Reads[ApiResponse] = Json.reads[ApiResponse]
  implicit val writes: OWrites[ApiResponse] = Json.writes[ApiResponse]
}

class ApiController extends Controller {

  import ApiResponse._

  def game(correlationId: String) = Action {

    val response = ApiResponse(correlationId, List(
      Map("player" -> "upd",
        "score" -> "1000"),

      Map("player" -> "dude",
        "score" -> "999")))

    Ok(Json.toJson(response))
  }

}

object ApiController {
  lazy val instance = new ApiController
}
