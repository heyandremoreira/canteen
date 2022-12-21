// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def wallet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wallet")
    }
  
    // @LINE:19
    def recoverpassword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recoverpassword")
    }
  
    // @LINE:9
    def northycanteen(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "northycanteen")
    }
  
    // @LINE:12
    def southycanteen(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "southycanteen")
    }
  
    // @LINE:21
    def tickets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tickets")
    }
  
    // @LINE:20
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:11
    def eastycanteen(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "eastycanteen")
    }
  
    // @LINE:17
    def managetickets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "managetickets")
    }
  
    // @LINE:18
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:10
    def westycanteen(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "westycanteen")
    }
  
    // @LINE:13
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:16
    def managemenus(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "managemenus")
    }
  
    // @LINE:7
    def administrator(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "administrator")
    }
  
    // @LINE:6
    def landing(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def authapproval(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "authapproval")
    }
  
    // @LINE:22
    def userslist(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userslist")
    }
  
    // @LINE:14
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:29
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
