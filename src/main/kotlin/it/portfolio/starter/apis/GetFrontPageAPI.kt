package it.portfolio.starter.apis

import gg.jte.TemplateEngine
import gg.jte.output.StringOutput
import io.vertx.core.Handler
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext

class GetFrontPageAPI(
  router: Router,
  private val templateEngine: TemplateEngine
) : Handler<RoutingContext> {

  init {
    router.get("/home-page")
      .handler(this)
  }

  override fun handle(context: RoutingContext) {
    val output = StringOutput()
    templateEngine.render("homePage.kte", emptyMap(), output)
    context.response().setStatusCode(200).end(output.toString())
  }


}
