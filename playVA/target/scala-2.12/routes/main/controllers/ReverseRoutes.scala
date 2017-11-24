
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/web/copy/playVA/playVA/conf/routes
// @DATE:Fri Nov 24 17:15:23 IRKT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:20
  class ReverseAuth(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:23
    def auth(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:20
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:22
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def delete(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "feature/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:11
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feature/new")
    }
  
    // @LINE:15
    def edit(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feature/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:16
    def update(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "feature/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:8
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feature")
    }
  
    // @LINE:12
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "feature")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
