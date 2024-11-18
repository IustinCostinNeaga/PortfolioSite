@file:Suppress("ktlint")
package gg.jte.generated.ondemand.indexes
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JtecvGenerated {
companion object {
	@JvmField val JTE_NAME = "indexes/cv.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(13,13,13,13,13,13,13,13,13,13,14,14,17,17,17,17,21,21,21,23,23,26,26,26,26,26,26,26)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?) {
		jteOutput.writeContent("<div class=\"flex flex-col px-2 py-4 text-white\" x-data=\"{show_index: true}\">\n  <div class=\"flex gap-1 hover:cursor-pointer\" @click=\"show_index = !show_index\">\n    <svg x-show=\"!show_index\" xmlns=\"http://www.w3.org/2000/svg\" height=\"24px\" viewBox=\"0 -960 960 960\" width=\"24px\"\n         fill=\"#FFFFFF\">\n      <path d=\"M504-480 320-664l56-56 240 240-240 240-56-56 184-184Z\"/>\n    </svg>\n    <svg x-show=\"show_index\" xmlns=\"http://www.w3.org/2000/svg\" height=\"24px\" viewBox=\"0 -960 960 960\" width=\"24px\"\n         fill=\"#FFFFFF\">\n      <path d=\"M480-344 240-584l56-56 184 184 184-184 56 56-240 240Z\"/>\n    </svg>\n    <h4 class=\"font-semibold\">Iustin Neaga's CV</h4>\n  </div>\n  <div x-show=\"show_index\" class=\"flex flex-col gap-2 px-8 py-2\">\n    ")
		val indexAsList = listOf("profilo", "educazione", "esperienza", "skills", "linguaggi")
		jteOutput.writeContent("\n    ")
		for (index in indexAsList) {
			jteOutput.writeContent("\n      <div class=\"hover:cursor-pointer\">\n        <h5 class=\"flex flex-col items-center, capitalize\"\n            hx-get=\"http://localhost:8080/cv/")
			jteOutput.setContext("h5", "hx-get")
			jteOutput.writeUserContent(index)
			jteOutput.setContext("h5", null)
			jteOutput.writeContent("\"\n            hx-swap=\"innerHTML\"\n            hx-target=\"#index\"\n            hx-push-url=\"true\"\n        >")
			jteOutput.setContext("h5", null)
			jteOutput.writeUserContent(index)
			jteOutput.writeContent("</h5>\n      </div>\n    ")
		}
		jteOutput.writeContent("\n  </div>\n</div>\n")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
}
