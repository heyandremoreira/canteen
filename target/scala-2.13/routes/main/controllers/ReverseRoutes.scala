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

  
    // @LINE:25
    def wallet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wallet")
    }
  
    // @LINE:21
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
  
    // @LINE:23
    def tickets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tickets")
    }
  
    // @LINE:22
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
  
    // @LINE:20
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:26
    def termsofuse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "termsofuse")
    }
  
    // @LINE:10
    def westycanteen(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "westycanteen")
    }
  
    // @LINE:13
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:28
    def calendar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calendar")
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
  
    // @LINE:24
    def userslist(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userslist")
    }
  
    // @LINE:19
    def createcanteen(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createcanteen")
    }
  
    // @LINE:18
    def manager(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager")
    }
  
    // @LINE:27
    def privacypolicy(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "privacypolicy")
    }
  
    // @LINE:14
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
