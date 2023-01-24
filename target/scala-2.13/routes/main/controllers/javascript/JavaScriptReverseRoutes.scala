// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {

  // @LINE:69
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:53
  class ReverseCanteenController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def canteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CanteenController.canteen",
      """
        function(id0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "canteen/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
          }
        
        }
      """
    )
  
    // @LINE:55
    def buy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CanteenController.buy",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "canteen" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseMainController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def recoverpassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.recoverpassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recoverpassword"})
        }
      """
    )
  
    // @LINE:21
    def help: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.help",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "help"})
        }
      """
    )
  
    // @LINE:15
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:19
    def termsofuse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.termsofuse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "termsofuse"})
        }
      """
    )
  
    // @LINE:9
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:8
    def landing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.landing",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:20
    def privacypolicy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.privacypolicy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "privacypolicy"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseAdministrator(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def approveUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.approveUser",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "approveUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:29
    def denyUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.denyUser",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "denyUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:31
    def managecanteens: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.managecanteens",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managecanteens"})
        }
      """
    )
  
    // @LINE:28
    def removeUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.removeUser",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "removeUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:24
    def administrator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.administrator",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "administrator"})
        }
      """
    )
  
    // @LINE:25
    def authapproval: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.authapproval",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authapproval"})
        }
      """
    )
  
    // @LINE:26
    def userslist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.userslist",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userslist"})
        }
      """
    )
  
    // @LINE:30
    def createcanteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.createcanteen",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createcanteen"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:11
    def signupProcess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.signupProcess",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:12
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:13
    def loginProcess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.loginProcess",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseManager(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def manage_tickets_arc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_tickets_arc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_tickets_arc"})
        }
      """
    )
  
    // @LINE:49
    def manage_menus_wss: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_menus_wss",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_menus_wss"})
        }
      """
    )
  
    // @LINE:36
    def manage_menus_arc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_menus_arc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_menus_arc"})
        }
      """
    )
  
    // @LINE:42
    def manage_tickets_tld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_tickets_tld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_tickets_tld"})
        }
      """
    )
  
    // @LINE:40
    def manager_tld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manager_tld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager_tld"})
        }
      """
    )
  
    // @LINE:46
    def manage_tickets_tlc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_tickets_tlc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_tickets_tlc"})
        }
      """
    )
  
    // @LINE:48
    def manager_wss: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manager_wss",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager_wss"})
        }
      """
    )
  
    // @LINE:37
    def createMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.createMenu",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_menus_arc"})
        }
      """
    )
  
    // @LINE:50
    def manage_tickets_wss: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_tickets_wss",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_tickets_wss"})
        }
      """
    )
  
    // @LINE:44
    def manager_tlc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manager_tlc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager_tlc"})
        }
      """
    )
  
    // @LINE:41
    def manage_menus_tld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_menus_tld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_menus_tld"})
        }
      """
    )
  
    // @LINE:35
    def manager_arc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manager_arc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager_arc"})
        }
      """
    )
  
    // @LINE:45
    def manage_menus_tlc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_menus_tlc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_menus_tlc"})
        }
      """
    )
  
  }

  // @LINE:58
  class ReverseStudent(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def tickets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Student.tickets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tickets"})
        }
      """
    )
  
    // @LINE:59
    def wallet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Student.wallet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wallet"})
        }
      """
    )
  
  }


}
