package controllers

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper
import play.api.mvc._

class GameAnalyticsController extends Controller {

  private val objectMapper = (new ObjectMapper() with ScalaObjectMapper).registerModule(DefaultScalaModule)

  def index = Action {
    val user = Map("username" -> "updupd")
    val posts = List(
      Map("player" -> "upd",
        "score" -> "1000"
      ),
      Map("player" -> "dude",
        "score" -> "999"
      )
    )

    Ok(objectMapper.writeValueAsString(posts))
  }

}
