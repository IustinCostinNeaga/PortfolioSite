@file:Suppress("ktlint")
package gg.jte.generated.ondemand
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JtehomePageGenerated {
companion object {
	@JvmField val JTE_NAME = "homePage.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(30,30,30,30,30,30,30,30,30,30,30,30,30,30,30)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?) {
		jteOutput.writeContent("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n  <meta charset=\"UTF-8\">\n  <title>OKYC BackOffice</title>\n  <script src=\"https://unpkg.com/htmx.org@1.9.12\"\n          integrity=\"sha384-ujb1lZYygJmzgSwoxRggbCHcjc0rB2XoQrxeTUQyRjrOnlCoYta87iKBWq3EsdM2\"\n          crossorigin=\"anonymous\"></script>\n  <script src=\"https://unpkg.com/htmx.org@1.9.12/dist/ext/json-enc.js\"></script>\n  <script src=\"https://unpkg.com/htmx.org@1.9.12/dist/ext/sse.js\"></script>\n\n  <script src=\"https://cdn.tailwindcss.com\"></script>\n\n  <script defer src=\"https://cdn.jsdelivr.net/npm/alpinejs@3.x.x/dist/cdn.min.js\"></script>\n</head>\n\n<body>\n<div id=\"page\" class =\"w-screen h-screen flex\"\n     hx-post=\"http://localhost:8080/dev/operator/api/login\"\n     hx-vals='{\"username\": \"valerio\", \"password\": \"pass\"}'\n     hx-ext=\"json-enc\" hx-target=\"#login\" hx-trigger=\"load\" hx-swap=\"outerHTML\">\n\n  <div class=\"h-full w-[80px] bg-[#041C54]\"></div>\n  <div class=\"h-full w-[400px] bg-[#192D5C]\"></div>\n  <div class=\"h-full flex-1 bg-[#1C3471]\"></div>\n\n</div>\n</body>\n\n</html>\n")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
}
