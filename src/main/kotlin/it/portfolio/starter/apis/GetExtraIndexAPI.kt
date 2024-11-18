package it.portfolio.starter.apis

import gg.jte.TemplateEngine
import io.vertx.core.Handler
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext

class GetExtraIndexAPI(
  router: Router,
  private val templateEngine: TemplateEngine
) : Handler<RoutingContext> {

  init {
    router.get("/")
      .handler(this)
  }

  override fun handle(p0: RoutingContext?) {
    TODO("Not yet implemented")
  }
}
