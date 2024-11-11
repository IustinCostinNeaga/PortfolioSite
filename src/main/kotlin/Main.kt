import io.vertx.core.Vertx
import it.portfolio.starter.MainVerticle
import java.time.ZoneId
import java.util.*

fun main(args: Array<String>) {
  TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("UTC")))

  Vertx.vertx().deployVerticle(MainVerticle())
    .onFailure { println(it.printStackTrace()) }
}
