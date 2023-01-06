// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {

  // @LINE:57
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:46
  class ReverseCanteenController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def theleakycauldron: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CanteenController.theleakycauldron",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "theleakycauldron"})
        }
      """
    )
  
    // @LINE:47
    def thelastdrop: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CanteenController.thelastdrop",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "thelastdrop"})
        }
      """
    )
  
    // @LINE:48
    def arconia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CanteenController.arconia",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "arconia"})
        }
      """
    )
  
    // @LINE:49
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
  
    // @LINE:22
    def help: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.help",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "help"})
        }
      """
    )
  
    // @LINE:16
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
          }
        
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
  
    // @LINE:10
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
          }
        
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
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administrator.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser"})
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
  
  }

  // @LINE:35
  class ReverseManager(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def manage_waverlysubstation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_waverlysubstation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_waverly"})
        }
      """
    )
  
    // @LINE:38
    def managetickets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.managetickets",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managetickets"})
          }
        
        }
      """
    )
  
    // @LINE:40
    def manage_thelastdrop: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_thelastdrop",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_thelastdrop"})
        }
      """
    )
  
    // @LINE:42
    def manage_theleakycauldron: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_theleakycauldron",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_theleakycauldron"})
        }
      """
    )
  
    // @LINE:37
    def managemenus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.managemenus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managemenus"})
        }
      """
    )
  
    // @LINE:41
    def manage_arconia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manage_arconia",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage_arconia"})
        }
      """
    )
  
    // @LINE:36
    def createcanteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.createcanteen",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createcanteen"})
        }
      """
    )
  
    // @LINE:35
    def manager: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Manager.manager",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager"})
        }
      """
    )
  
  }

  // @LINE:52
  class ReverseStudent(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def tickets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Student.tickets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tickets"})
        }
      """
    )
  
    // @LINE:53
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
