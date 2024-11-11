package it.portfolio.starter

import gg.jte.ContentType
import gg.jte.TemplateEngine
import gg.jte.resolve.DirectoryCodeResolver
import gg.jte.runtime.Template
import io.vertx.core.AbstractVerticle
import io.vertx.core.Promise
import io.vertx.ext.web.Router
import it.portfolio.starter.apis.GetFrontPageAPI
import java.nio.file.Path

class MainVerticle : AbstractVerticle() {

  override fun start(startPromise: Promise<Void>) {
    val router = Router.router(vertx)
    val codeResolver = DirectoryCodeResolver(Path.of("src/main/resources/kte"))
    val templateEngine = TemplateEngine.create(codeResolver, ContentType.Html)

    GetFrontPageAPI(router, templateEngine)

    vertx
      .createHttpServer()
      .requestHandler(router)
      .listen(8080).onComplete { http ->
        if (http.succeeded()) {
          startPromise.complete()
          println("HTTP server started on port 8080")
        } else {
          startPromise.fail(http.cause());
        }
      }
  }
}
