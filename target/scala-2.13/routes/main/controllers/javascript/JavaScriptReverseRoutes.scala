// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def wallet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.wallet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wallet"})
        }
      """
    )
  
    // @LINE:21
    def recoverpassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.recoverpassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recoverpassword"})
        }
      """
    )
  
    // @LINE:9
    def northycanteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.northycanteen",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "northycanteen"})
        }
      """
    )
  
    // @LINE:12
    def southycanteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.southycanteen",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "southycanteen"})
        }
      """
    )
  
    // @LINE:23
    def tickets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tickets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tickets"})
        }
      """
    )
  
    // @LINE:22
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:11
    def eastycanteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.eastycanteen",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eastycanteen"})
        }
      """
    )
  
    // @LINE:17
    def managetickets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.managetickets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managetickets"})
        }
      """
    )
  
    // @LINE:20
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:26
    def termsofuse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.termsofuse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "termsofuse"})
        }
      """
    )
  
    // @LINE:10
    def westycanteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.westycanteen",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "westycanteen"})
        }
      """
    )
  
    // @LINE:13
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:28
    def calendar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.calendar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendar"})
        }
      """
    )
  
    // @LINE:16
    def managemenus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.managemenus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managemenus"})
        }
      """
    )
  
    // @LINE:7
    def administrator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.administrator",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "administrator"})
        }
      """
    )
  
    // @LINE:6
    def landing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.landing",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def authapproval: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.authapproval",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authapproval"})
        }
      """
    )
  
    // @LINE:24
    def userslist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.userslist",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userslist"})
        }
      """
    )
  
    // @LINE:19
    def createcanteen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createcanteen",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createcanteen"})
        }
      """
    )
  
    // @LINE:18
    def manager: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.manager",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager"})
        }
      """
    )
  
    // @LINE:27
    def privacypolicy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.privacypolicy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "privacypolicy"})
        }
      """
    )
  
    // @LINE:14
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
