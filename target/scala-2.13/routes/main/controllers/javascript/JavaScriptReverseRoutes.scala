// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {

  // @LINE:74
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:59
  class ReverseCanteenController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def canteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CanteenController.canteen",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "canteen/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def recoverpassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.recoverpassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recoverpassword"})
        }
      """
    )
  
    // @LINE:22
    def help: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.help",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "help"})
        }
      """
    )
  
    // @LINE:10
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:16
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:20
    def termsofuse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.termsofuse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "termsofuse"})
        }
      """
    )
  
    // @LINE:9
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:24
    def calendar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.calendar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendar"})
        }
      """
    )
  
    // @LINE:8
    def landing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.landing",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:21
    def privacypolicy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.privacypolicy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "privacypolicy"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseAdministrator(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def approveUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.approveUser",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "approveUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:32
    def denyUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.denyUser",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "denyUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:34
    def managecanteens: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.managecanteens",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managecanteens"})
        }
      """
    )
  
    // @LINE:31
    def removeUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.removeUser",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "removeUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:27
    def administrator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.administrator",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "administrator"})
        }
      """
    )
  
    // @LINE:28
    def authapproval: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.authapproval",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authapproval"})
        }
      """
    )
  
    // @LINE:29
    def userslist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.userslist",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userslist"})
        }
      """
    )
  
    // @LINE:33
    def createcanteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.createcanteen",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createcanteen"})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseManager(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def manage_tld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_tld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_tld"})
        }
      """
    )
  
    // @LINE:55
    def manage_menus_wss: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_menus_wss",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_menus_wss"})
        }
      """
    )
  
    // @LINE:40
    def manage_menus_arc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_menus_arc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_menus_arc"})
        }
      """
    )
  
    // @LINE:46
    def manage_tickets_tld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_tickets_tld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_tickets_tld"})
        }
      """
    )
  
    // @LINE:39
    def manage_arc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_arc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_arc"})
        }
      """
    )
  
    // @LINE:43
    def manager_tld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manager_tld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager_tld"})
        }
      """
    )
  
    // @LINE:51
    def manage_tickets_tlc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_tickets_tlc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_tickets_tlc"})
        }
      """
    )
  
    // @LINE:54
    def manage_wss: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_wss",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_wss"})
        }
      """
    )
  
    // @LINE:53
    def manager_wss: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manager_wss",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager_wss"})
        }
      """
    )
  
    // @LINE:49
    def manage_tlc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_tlc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_tlc"})
        }
      """
    )
  
    // @LINE:56
    def manage_tickets_wss: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_tickets_wss",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_tickets_wss"})
        }
      """
    )
  
    // @LINE:48
    def manager_tlc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manager_tlc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager_tlc"})
        }
      """
    )
  
    // @LINE:45
    def manage_menus_tld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_menus_tld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_menus_tld"})
        }
      """
    )
  
    // @LINE:38
    def manager_arc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manager_arc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager_arc"})
        }
      """
    )
  
    // @LINE:50
    def manage_menus_tlc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_menus_tlc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_menus_tlc"})
        }
      """
    )
  
  }

  // @LINE:63
  class ReverseStudent(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def tickets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Student.tickets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tickets"})
        }
      """
    )
  
    // @LINE:64
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
