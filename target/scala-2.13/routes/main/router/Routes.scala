// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:30
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:30
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.landing(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """administrator""", """controllers.HomeController.administrator(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authapproval""", """controllers.HomeController.authapproval(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """northycanteen""", """controllers.HomeController.northycanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """westycanteen""", """controllers.HomeController.westycanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eastycanteen""", """controllers.HomeController.eastycanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """southycanteen""", """controllers.HomeController.southycanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.home(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managemenus""", """controllers.HomeController.managemenus(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managetickets""", """controllers.HomeController.managetickets(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recoverpassword""", """controllers.HomeController.recoverpassword(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tickets""", """controllers.HomeController.tickets(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userslist""", """controllers.HomeController.userslist(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wallet""", """controllers.HomeController.wallet(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calendar""", """controllers.HomeController.calendar(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_landing0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_landing0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.landing(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "landing",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""",
      """ Default path will just redirect to the computer list""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_administrator1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("administrator")))
  )
  private[this] lazy val controllers_HomeController_administrator1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.administrator(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "administrator",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """administrator""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_authapproval2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authapproval")))
  )
  private[this] lazy val controllers_HomeController_authapproval2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.authapproval(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "authapproval",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """authapproval""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_northycanteen3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("northycanteen")))
  )
  private[this] lazy val controllers_HomeController_northycanteen3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.northycanteen(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "northycanteen",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """northycanteen""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_westycanteen4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("westycanteen")))
  )
  private[this] lazy val controllers_HomeController_westycanteen4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.westycanteen(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "westycanteen",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """westycanteen""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_eastycanteen5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eastycanteen")))
  )
  private[this] lazy val controllers_HomeController_eastycanteen5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.eastycanteen(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "eastycanteen",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """eastycanteen""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_southycanteen6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("southycanteen")))
  )
  private[this] lazy val controllers_HomeController_southycanteen6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.southycanteen(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "southycanteen",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """southycanteen""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_home7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_home7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.home(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "home",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """home""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.login(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_managemenus9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managemenus")))
  )
  private[this] lazy val controllers_HomeController_managemenus9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.managemenus(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "managemenus",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """managemenus""",
      """POST    /login                      controllers.Application.authenticate()""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_managetickets10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managetickets")))
  )
  private[this] lazy val controllers_HomeController_managetickets10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.managetickets(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "managetickets",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """managetickets""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_profile11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.profile(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """profile""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_recoverpassword12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recoverpassword")))
  )
  private[this] lazy val controllers_HomeController_recoverpassword12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.recoverpassword(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "recoverpassword",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """recoverpassword""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_signup13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.signup(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_tickets14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tickets")))
  )
  private[this] lazy val controllers_HomeController_tickets14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.tickets(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tickets",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """tickets""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_userslist15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userslist")))
  )
  private[this] lazy val controllers_HomeController_userslist15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.userslist(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "userslist",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """userslist""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_wallet16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wallet")))
  )
  private[this] lazy val controllers_HomeController_wallet16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.wallet(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "wallet",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """wallet""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_calendar17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calendar")))
  )
  private[this] lazy val controllers_HomeController_calendar17_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.calendar(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "calendar",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """calendar""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_at18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_landing0_route(params@_) =>
      call { 
        controllers_HomeController_landing0_invoker.call(
          req => HomeController_0.landing(req))
      }
  
    // @LINE:7
    case controllers_HomeController_administrator1_route(params@_) =>
      call { 
        controllers_HomeController_administrator1_invoker.call(
          req => HomeController_0.administrator(req))
      }
  
    // @LINE:8
    case controllers_HomeController_authapproval2_route(params@_) =>
      call { 
        controllers_HomeController_authapproval2_invoker.call(
          req => HomeController_0.authapproval(req))
      }
  
    // @LINE:9
    case controllers_HomeController_northycanteen3_route(params@_) =>
      call { 
        controllers_HomeController_northycanteen3_invoker.call(
          req => HomeController_0.northycanteen(req))
      }
  
    // @LINE:10
    case controllers_HomeController_westycanteen4_route(params@_) =>
      call { 
        controllers_HomeController_westycanteen4_invoker.call(
          req => HomeController_0.westycanteen(req))
      }
  
    // @LINE:11
    case controllers_HomeController_eastycanteen5_route(params@_) =>
      call { 
        controllers_HomeController_eastycanteen5_invoker.call(
          req => HomeController_0.eastycanteen(req))
      }
  
    // @LINE:12
    case controllers_HomeController_southycanteen6_route(params@_) =>
      call { 
        controllers_HomeController_southycanteen6_invoker.call(
          req => HomeController_0.southycanteen(req))
      }
  
    // @LINE:13
    case controllers_HomeController_home7_route(params@_) =>
      call { 
        controllers_HomeController_home7_invoker.call(
          req => HomeController_0.home(req))
      }
  
    // @LINE:14
    case controllers_HomeController_login8_route(params@_) =>
      call { 
        controllers_HomeController_login8_invoker.call(
          req => HomeController_0.login(req))
      }
  
    // @LINE:16
    case controllers_HomeController_managemenus9_route(params@_) =>
      call { 
        controllers_HomeController_managemenus9_invoker.call(
          req => HomeController_0.managemenus(req))
      }
  
    // @LINE:17
    case controllers_HomeController_managetickets10_route(params@_) =>
      call { 
        controllers_HomeController_managetickets10_invoker.call(
          req => HomeController_0.managetickets(req))
      }
  
    // @LINE:18
    case controllers_HomeController_profile11_route(params@_) =>
      call { 
        controllers_HomeController_profile11_invoker.call(
          req => HomeController_0.profile(req))
      }
  
    // @LINE:19
    case controllers_HomeController_recoverpassword12_route(params@_) =>
      call { 
        controllers_HomeController_recoverpassword12_invoker.call(
          req => HomeController_0.recoverpassword(req))
      }
  
    // @LINE:20
    case controllers_HomeController_signup13_route(params@_) =>
      call { 
        controllers_HomeController_signup13_invoker.call(
          req => HomeController_0.signup(req))
      }
  
    // @LINE:21
    case controllers_HomeController_tickets14_route(params@_) =>
      call { 
        controllers_HomeController_tickets14_invoker.call(
          req => HomeController_0.tickets(req))
      }
  
    // @LINE:22
    case controllers_HomeController_userslist15_route(params@_) =>
      call { 
        controllers_HomeController_userslist15_invoker.call(
          req => HomeController_0.userslist(req))
      }
  
    // @LINE:23
    case controllers_HomeController_wallet16_route(params@_) =>
      call { 
        controllers_HomeController_wallet16_invoker.call(
          req => HomeController_0.wallet(req))
      }
  
    // @LINE:24
    case controllers_HomeController_calendar17_route(params@_) =>
      call { 
        controllers_HomeController_calendar17_invoker.call(
          req => HomeController_0.calendar(req))
      }
  
    // @LINE:30
    case controllers_Assets_at18_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at18_invoker.call(Assets_1.at(path, file))
      }
  }
}
