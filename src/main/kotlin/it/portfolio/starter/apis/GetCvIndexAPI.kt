package it.portfolio.starter.apis

import gg.jte.TemplateEngine
import gg.jte.output.StringOutput
import io.vertx.core.Handler
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext

class GetCvIndexAPI(
  router: Router,
  private val templateEngine: TemplateEngine
) : Handler<RoutingContext> {

  init {
    router.get("/cv/index")
      .handler(this)
  }

  override fun handle(context: RoutingContext) {
    val output = StringOutput()
    templateEngine.render("indexes/cv.kte", emptyMap(), output)
    context.response().setStatusCode(200).end(output.toString())
  }
}
