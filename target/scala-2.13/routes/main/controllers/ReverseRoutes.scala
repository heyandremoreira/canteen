// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:63
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:46
  class ReverseCanteenController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def theleakycauldron(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "theleakycauldron")
    }
  
    // @LINE:47
    def thelastdrop(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "thelastdrop")
    }
  
    // @LINE:48
    def arconia(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "arconia")
    }
  
    // @LINE:49
    def waverlysubstation(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "waverlysubstation")
    }
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def recoverpassword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recoverpassword")
    }
  
    // @LINE:22
    def help(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "help")
    }
  
    // @LINE:16
    def signup(): Call = {
    
      () match {
      
        // @LINE:16
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "signup")
      
      }
    
    }
  
    // @LINE:14
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:20
    def termsofuse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "termsofuse")
    }
  
    // @LINE:9
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:24
    def calendar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calendar")
    }
  
    // @LINE:8
    def landing(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:21
    def privacypolicy(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "privacypolicy")
    }
  
    // @LINE:10
    def login(): Call = {
    
      () match {
      
        // @LINE:10
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "login")
      
      }
    
    }
  
  }

  // @LINE:27
  class ReverseAdministrator(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addUser")
    }
  
    // @LINE:32
    def denyUser(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "denyUser" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:31
    def removeUser(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "removeUser" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:27
    def administrator(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "administrator")
    }
  
    // @LINE:28
    def authapproval(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "authapproval")
    }
  
    // @LINE:29
    def userslist(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userslist")
    }
  
  }

  // @LINE:35
  class ReverseManager(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def manage_waverlysubstation(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_waverly")
    }
  
    // @LINE:38
    def managetickets(): Call = {
    
      () match {
      
        // @LINE:38
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "managetickets")
      
      }
    
    }
  
    // @LINE:40
    def manage_thelastdrop(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_thelastdrop")
    }
  
    // @LINE:42
    def manage_theleakycauldron(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_theleakycauldron")
    }
  
    // @LINE:37
    def managemenus(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "managemenus")
    }
  
    // @LINE:41
    def manage_arconia(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_arconia")
    }
  
    // @LINE:36
    def createcanteen(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createcanteen")
    }
  
    // @LINE:35
    def manager(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager")
    }
  
  }

  // @LINE:52
  class ReverseStudent(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def tickets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tickets")
    }
  
    // @LINE:53
    def wallet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wallet")
    }
  
  }


}
