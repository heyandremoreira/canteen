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

  
    // @LINE:23
    def wallet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.wallet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wallet"})
        }
      """
    )
  
    // @LINE:19
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
  
    // @LINE:21
    def tickets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tickets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tickets"})
        }
      """
    )
  
    // @LINE:20
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
  
    // @LINE:18
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
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
  
    // @LINE:22
    def userslist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.userslist",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userslist"})
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

  // @LINE:29
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
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
