package api

import play.api.libs.json.{Json, OWrites, Reads}

final case class ApiResponse(correlationID: String, scores: List[Map[String, String]])

object ApiResponse {
  implicit val reads: Reads[ApiResponse] = Json.reads[ApiResponse]
  implicit val writes: OWrites[ApiResponse] = Json.writes[ApiResponse]
}

class GameApi {

  def scores(correlationId: String): ApiResponse = {
    val response = ApiResponse(correlationId, List(
      Map("player" -> "upd",
        "score" -> "1000"),

      Map("player" -> "dude",
        "score" -> "999")))

    response
  }

}

object GameApi {
  lazy val instance = new GameApi
}
