package route

import controllers.ApiController
import play.api.mvc.{Action, AnyContent, RequestHeader}
import play.api.routing._
import play.api.routing.sird._

class ApiRouter extends SimpleRouter {

  override def routes: PartialFunction[RequestHeader, Action[AnyContent]] = {
    case GET(p"/game/$correlationId") => ApiController.instance.game(correlationId)
  }
}
