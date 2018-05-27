package route

import com.google.inject.Inject
import controllers.GameAnalyticsController
import play.api.routing._
import play.api.routing.sird._

class ApiRouter @Inject()(controller: GameAnalyticsController) extends SimpleRouter {

  override def routes = {
    case GET(p"/game/$correlationId") => controller.index
  }
}
