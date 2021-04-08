// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/edwin.tayum/Downloads/play-scala-rest-api-example-master/conf/routes
// @DATE:Thu Apr 08 20:02:14 PST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def negosyoAdvance(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "v1/sap/generate/na")
    }
  
    // @LINE:8
    def enterpriseWallet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "v1/sap/generate/ew")
    }
  
    // @LINE:9
    def pesonet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "v1/sap/generate/pn")
    }
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
