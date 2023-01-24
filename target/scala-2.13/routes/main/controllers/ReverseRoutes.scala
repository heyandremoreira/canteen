// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:68
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:52
  class ReverseCanteenController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def canteen(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:52
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "canteen/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
      
      }
    
    }
  
    // @LINE:54
    def buy(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "canteen" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
  }

  // @LINE:8
  class ReverseMainController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def recoverpassword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recoverpassword")
    }
  
    // @LINE:21
    def help(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "help")
    }
  
    // @LINE:15
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:19
    def termsofuse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "termsofuse")
    }
  
    // @LINE:9
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:8
    def landing(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:20
    def privacypolicy(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "privacypolicy")
    }
  
  }

  // @LINE:24
  class ReverseAdministrator(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def approveUser(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "approveUser" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:29
    def denyUser(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "denyUser" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:31
    def managecanteens(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "managecanteens")
    }
  
    // @LINE:28
    def removeUser(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "removeUser" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
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
  
    // @LINE:30
    def createcanteen(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createcanteen")
    }
  
  }

  // @LINE:10
  class ReverseAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:11
    def signupProcess(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:12
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:13
    def loginProcess(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:35
  class ReverseManager(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def manage_tickets_arc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_tickets_arc")
    }
  
    // @LINE:48
    def manage_menus_wss(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_menus_wss")
    }
  
    // @LINE:36
    def manage_menus_arc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_menus_arc")
    }
  
    // @LINE:41
    def manage_tickets_tld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_tickets_tld")
    }
  
    // @LINE:39
    def manager_tld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager_tld")
    }
  
    // @LINE:45
    def manage_tickets_tlc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_tickets_tlc")
    }
  
    // @LINE:47
    def manager_wss(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager_wss")
    }
  
    // @LINE:49
    def manage_tickets_wss(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_tickets_wss")
    }
  
    // @LINE:43
    def manager_tlc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager_tlc")
    }
  
    // @LINE:40
    def manage_menus_tld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_menus_tld")
    }
  
    // @LINE:35
    def manager_arc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager_arc")
    }
  
    // @LINE:44
    def manage_menus_tlc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage_menus_tlc")
    }
  
  }

  // @LINE:57
  class ReverseStudent(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def tickets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tickets")
    }
  
    // @LINE:58
    def wallet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wallet")
    }
  
  }


}
