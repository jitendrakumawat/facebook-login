
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/si2chip/angularjs/facebook/project/conf/routes
// @DATE:Sat Nov 26 13:58:49 IST 2016


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
