
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/web/copy/playVA/playVA/conf/routes
// @DATE:Fri Nov 24 17:15:23 IRKT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
