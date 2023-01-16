// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:74
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:59
  class ReverseCanteenController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def canteen(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "canteen/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def recoverpassword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recoverpassword")
    }
  
    // @LINE:22
    def help(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "help")
    }
  
    // @LINE:10
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:16
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
  
  }

  // @LINE:27
  class ReverseAdministrator(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def approveUser(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "approveUser" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:32
    def denyUser(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "denyUser" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:34
    def managecanteens(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "managecanteens")
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
  
    // @LINE:33
    def createcanteen(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createcanteen")
    }
  
  }

  // @LINE:38
  class ReverseManager(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def manage_tld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_tld")
    }
  
    // @LINE:55
    def manage_menus_wss(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_menus_wss")
    }
  
    // @LINE:40
    def manage_menus_arc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_menus_arc")
    }
  
    // @LINE:46
    def manage_tickets_tld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_tickets_tld")
    }
  
    // @LINE:39
    def manage_arc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_arc")
    }
  
    // @LINE:43
    def manager_tld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager_tld")
    }
  
    // @LINE:51
    def manage_tickets_tlc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_tickets_tlc")
    }
  
    // @LINE:54
    def manage_wss(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_wss")
    }
  
    // @LINE:53
    def manager_wss(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager_wss")
    }
  
    // @LINE:49
    def manage_tlc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_tlc")
    }
  
    // @LINE:56
    def manage_tickets_wss(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_tickets_wss")
    }
  
    // @LINE:48
    def manager_tlc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager_tlc")
    }
  
    // @LINE:45
    def manage_menus_tld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_menus_tld")
    }
  
    // @LINE:38
    def manager_arc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager_arc")
    }
  
    // @LINE:50
    def manage_menus_tlc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_menus_tlc")
    }
  
  }

  // @LINE:63
  class ReverseStudent(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def tickets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tickets")
    }
  
    // @LINE:64
    def wallet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wallet")
    }
  
  }


}
