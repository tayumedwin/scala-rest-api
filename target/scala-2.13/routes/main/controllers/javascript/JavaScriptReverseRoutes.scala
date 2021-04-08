// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/edwin.tayum/Downloads/play-scala-rest-api-example-master/conf/routes
// @DATE:Thu Apr 08 20:02:14 PST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def negosyoAdvance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.negosyoAdvance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/sap/generate/na"})
        }
      """
    )
  
    // @LINE:8
    def enterpriseWallet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.enterpriseWallet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/sap/generate/ew"})
        }
      """
    )
  
    // @LINE:9
    def pesonet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.pesonet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/sap/generate/pn"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
