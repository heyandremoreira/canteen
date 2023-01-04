// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:52
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:41
  class ReverseCanteenController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def theleakycauldron(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "theleakycauldron")
    }
  
    // @LINE:42
    def thelastdrop(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "thelastdrop")
    }
  
    // @LINE:43
    def arconia(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "arconia")
    }
  
    // @LINE:44
    def waverlysubstation(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "waverlysubstation")
    }
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def recoverpassword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recoverpassword")
    }
  
    // @LINE:15
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:13
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:18
    def termsofuse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "termsofuse")
    }
  
    // @LINE:9
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:21
    def calendar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calendar")
    }
  
    // @LINE:8
    def landing(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:19
    def privacypolicy(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "privacypolicy")
    }
  
    // @LINE:10
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:24
  class ReverseAdministrator(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addItem")
    }
  
    // @LINE:28
    def removeUser(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "removeItem" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:24
    def administrator(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "administrator")
    }
  
    // @LINE:25
    def authapproval(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "authapproval")
    }
  
    // @LINE:26
    def userslist(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userslist")
    }
  
  }

  // @LINE:31
  class ReverseManager(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def manage_waverlysubstation(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_waverly")
    }
  
    // @LINE:38
    def managetickets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "managetickets")
    }
  
    // @LINE:33
    def manage_thelastdrop(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_thelastdrop")
    }
  
    // @LINE:35
    def manage_theleakycauldron(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_theleakycauldron")
    }
  
    // @LINE:37
    def managemenus(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "managemenus")
    }
  
    // @LINE:34
    def manage_arconia(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_arconia")
    }
  
    // @LINE:32
    def createcanteen(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createcanteen")
    }
  
    // @LINE:31
    def manager(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager")
    }
  
  }

  // @LINE:47
  class ReverseStudent(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def tickets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tickets")
    }
  
    // @LINE:48
    def wallet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wallet")
    }
  
  }


}
