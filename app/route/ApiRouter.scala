package route

import api.GameApi
import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, RequestHeader}
import play.api.routing._
import play.api.routing.sird._
import play.api.mvc._

class ApiRouter extends SimpleRouter {

  override def routes: PartialFunction[RequestHeader, Action[AnyContent]] = {
    case GET(p"/game/$correlationId") =>
      Action {
        Results.Ok(Json.toJson(GameApi.instance.scores(correlationId)))
      }
  }
}
