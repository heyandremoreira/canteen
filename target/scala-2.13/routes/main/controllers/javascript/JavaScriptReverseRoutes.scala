// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {

  // @LINE:53
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseCanteenController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def theleakycauldron: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CanteenController.theleakycauldron",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "theleakycauldron"})
        }
      """
    )
  
    // @LINE:43
    def thelastdrop: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CanteenController.thelastdrop",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "thelastdrop"})
        }
      """
    )
  
    // @LINE:44
    def arconia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CanteenController.arconia",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "arconia"})
        }
      """
    )
  
    // @LINE:45
    def waverlysubstation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CanteenController.waverlysubstation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "waverlysubstation"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def recoverpassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.recoverpassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recoverpassword"})
        }
      """
    )
  
    // @LINE:16
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:14
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:19
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
  
    // @LINE:22
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
  
    // @LINE:20
    def privacypolicy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.privacypolicy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "privacypolicy"})
        }
      """
    )
  
    // @LINE:10
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseAdministrator(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addItem"})
        }
      """
    )
  
    // @LINE:29
    def removeUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.removeUser",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "removeItem" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:25
    def administrator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.administrator",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "administrator"})
        }
      """
    )
  
    // @LINE:26
    def authapproval: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.authapproval",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authapproval"})
        }
      """
    )
  
    // @LINE:27
    def userslist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.userslist",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userslist"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseManager(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def manage_waverlysubstation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_waverlysubstation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_waverly"})
        }
      """
    )
  
    // @LINE:39
    def managetickets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.managetickets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managetickets"})
        }
      """
    )
  
    // @LINE:34
    def manage_thelastdrop: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_thelastdrop",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_thelastdrop"})
        }
      """
    )
  
    // @LINE:36
    def manage_theleakycauldron: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_theleakycauldron",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_theleakycauldron"})
        }
      """
    )
  
    // @LINE:38
    def managemenus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.managemenus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managemenus"})
        }
      """
    )
  
    // @LINE:35
    def manage_arconia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_arconia",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_arconia"})
        }
      """
    )
  
    // @LINE:33
    def createcanteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.createcanteen",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createcanteen"})
        }
      """
    )
  
    // @LINE:32
    def manager: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manager",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager"})
        }
      """
    )
  
  }

  // @LINE:48
  class ReverseStudent(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def tickets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Student.tickets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tickets"})
        }
      """
    )
  
    // @LINE:49
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
