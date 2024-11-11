@file:Suppress("ktlint")
package gg.jte.generated.ondemand
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JtehomePageGenerated {
companion object {
	@JvmField val JTE_NAME = "homePage.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?) {
		jteOutput.writeContent("Ciao mondo\n")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
}
