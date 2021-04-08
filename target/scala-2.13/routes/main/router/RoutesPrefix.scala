// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/edwin.tayum/Downloads/play-scala-rest-api-example-master/conf/routes
// @DATE:Thu Apr 08 20:02:14 PST 2021


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
