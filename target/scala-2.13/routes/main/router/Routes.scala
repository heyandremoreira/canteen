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
  // @LINE:8
  HomeController_4: controllers.HomeController,
  // @LINE:22
  Administrator_0: controllers.Administrator,
  // @LINE:29
  Manager_1: controllers.Manager,
  // @LINE:39
  Student_2: controllers.Student,
  // @LINE:44
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_4: controllers.HomeController,
    // @LINE:22
    Administrator_0: controllers.Administrator,
    // @LINE:29
    Manager_1: controllers.Manager,
    // @LINE:39
    Student_2: controllers.Student,
    // @LINE:44
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_4, Administrator_0, Manager_1, Student_2, Assets_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, Administrator_0, Manager_1, Student_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.landing(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.home(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recoverpassword""", """controllers.HomeController.recoverpassword(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """termsofuse""", """controllers.HomeController.termsofuse(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """privacypolicy""", """controllers.HomeController.privacypolicy(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calendar""", """controllers.HomeController.calendar(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """administrator""", """controllers.Administrator.administrator(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authapproval""", """controllers.Administrator.authapproval(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userslist""", """controllers.Administrator.userslist(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addItem""", """controllers.Administrator.addUser(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeItem""", """controllers.Administrator.removeUser(request:Request, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager""", """controllers.Manager.manager(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createcanteen""", """controllers.Manager.createcanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managemenus""", """controllers.Manager.managemenus(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managetickets""", """controllers.Manager.managetickets(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """northycanteen""", """controllers.Manager.northycanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """westycanteen""", """controllers.Manager.westycanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eastycanteen""", """controllers.Manager.eastycanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """southycanteen""", """controllers.Manager.southycanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tickets""", """controllers.Student.tickets(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wallet""", """controllers.Student.wallet(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_HomeController_landing0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_landing0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.landing(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "landing",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""",
      """GERAL""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_home1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_home1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.home(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:10
  private[this] lazy val controllers_HomeController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.login(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:14
  private[this] lazy val controllers_HomeController_profile3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.profile(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """profile""",
      """POST    /login                      controllers.Application.authenticate()
GET     /login                      controllers.Application.login()
GET     /logout                     controllers.Application.logout()""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_recoverpassword4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recoverpassword")))
  )
  private[this] lazy val controllers_HomeController_recoverpassword4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.recoverpassword(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:16
  private[this] lazy val controllers_HomeController_signup5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.signup(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_termsofuse6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("termsofuse")))
  )
  private[this] lazy val controllers_HomeController_termsofuse6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.termsofuse(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "termsofuse",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """termsofuse""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_privacypolicy7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("privacypolicy")))
  )
  private[this] lazy val controllers_HomeController_privacypolicy7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.privacypolicy(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "privacypolicy",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """privacypolicy""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_calendar8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calendar")))
  )
  private[this] lazy val controllers_HomeController_calendar8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_4.calendar(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:22
  private[this] lazy val controllers_Administrator_administrator9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("administrator")))
  )
  private[this] lazy val controllers_Administrator_administrator9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_0.administrator(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "administrator",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """administrator""",
      """ ADMINISTRATOR""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Administrator_authapproval10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authapproval")))
  )
  private[this] lazy val controllers_Administrator_authapproval10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_0.authapproval(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "authapproval",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """authapproval""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Administrator_userslist11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userslist")))
  )
  private[this] lazy val controllers_Administrator_userslist11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_0.userslist(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "userslist",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """userslist""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Administrator_addUser12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addItem")))
  )
  private[this] lazy val controllers_Administrator_addUser12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_0.addUser(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "addUser",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """addItem""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Administrator_removeUser13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeItem")))
  )
  private[this] lazy val controllers_Administrator_removeUser13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_0.removeUser(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "removeUser",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "POST",
      this.prefix + """removeItem""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Manager_manager14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager")))
  )
  private[this] lazy val controllers_Manager_manager14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_1.manager(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manager",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manager""",
      """ MANAGER""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Manager_createcanteen15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createcanteen")))
  )
  private[this] lazy val controllers_Manager_createcanteen15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_1.createcanteen(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "createcanteen",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """createcanteen""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Manager_managemenus16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managemenus")))
  )
  private[this] lazy val controllers_Manager_managemenus16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_1.managemenus(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "managemenus",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """managemenus""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Manager_managetickets17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managetickets")))
  )
  private[this] lazy val controllers_Manager_managetickets17_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_1.managetickets(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "managetickets",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """managetickets""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Manager_northycanteen18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("northycanteen")))
  )
  private[this] lazy val controllers_Manager_northycanteen18_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_1.northycanteen(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "northycanteen",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """northycanteen""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Manager_westycanteen19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("westycanteen")))
  )
  private[this] lazy val controllers_Manager_westycanteen19_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_1.westycanteen(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "westycanteen",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """westycanteen""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Manager_eastycanteen20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eastycanteen")))
  )
  private[this] lazy val controllers_Manager_eastycanteen20_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_1.eastycanteen(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "eastycanteen",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """eastycanteen""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Manager_southycanteen21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("southycanteen")))
  )
  private[this] lazy val controllers_Manager_southycanteen21_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_1.southycanteen(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "southycanteen",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """southycanteen""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Student_tickets22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tickets")))
  )
  private[this] lazy val controllers_Student_tickets22_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Student_2.tickets(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Student",
      "tickets",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """tickets""",
      """STUDENT""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Student_wallet23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wallet")))
  )
  private[this] lazy val controllers_Student_wallet23_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Student_2.wallet(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Student",
      "wallet",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """wallet""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Assets_at24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at24_invoker = createInvoker(
    Assets_3.at(fakeValue[String], fakeValue[String]),
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
  
    // @LINE:8
    case controllers_HomeController_landing0_route(params@_) =>
      call { 
        controllers_HomeController_landing0_invoker.call(
          req => HomeController_4.landing(req))
      }
  
    // @LINE:9
    case controllers_HomeController_home1_route(params@_) =>
      call { 
        controllers_HomeController_home1_invoker.call(
          req => HomeController_4.home(req))
      }
  
    // @LINE:10
    case controllers_HomeController_login2_route(params@_) =>
      call { 
        controllers_HomeController_login2_invoker.call(
          req => HomeController_4.login(req))
      }
  
    // @LINE:14
    case controllers_HomeController_profile3_route(params@_) =>
      call { 
        controllers_HomeController_profile3_invoker.call(
          req => HomeController_4.profile(req))
      }
  
    // @LINE:15
    case controllers_HomeController_recoverpassword4_route(params@_) =>
      call { 
        controllers_HomeController_recoverpassword4_invoker.call(
          req => HomeController_4.recoverpassword(req))
      }
  
    // @LINE:16
    case controllers_HomeController_signup5_route(params@_) =>
      call { 
        controllers_HomeController_signup5_invoker.call(
          req => HomeController_4.signup(req))
      }
  
    // @LINE:17
    case controllers_HomeController_termsofuse6_route(params@_) =>
      call { 
        controllers_HomeController_termsofuse6_invoker.call(
          req => HomeController_4.termsofuse(req))
      }
  
    // @LINE:18
    case controllers_HomeController_privacypolicy7_route(params@_) =>
      call { 
        controllers_HomeController_privacypolicy7_invoker.call(
          req => HomeController_4.privacypolicy(req))
      }
  
    // @LINE:19
    case controllers_HomeController_calendar8_route(params@_) =>
      call { 
        controllers_HomeController_calendar8_invoker.call(
          req => HomeController_4.calendar(req))
      }
  
    // @LINE:22
    case controllers_Administrator_administrator9_route(params@_) =>
      call { 
        controllers_Administrator_administrator9_invoker.call(
          req => Administrator_0.administrator(req))
      }
  
    // @LINE:23
    case controllers_Administrator_authapproval10_route(params@_) =>
      call { 
        controllers_Administrator_authapproval10_invoker.call(
          req => Administrator_0.authapproval(req))
      }
  
    // @LINE:24
    case controllers_Administrator_userslist11_route(params@_) =>
      call { 
        controllers_Administrator_userslist11_invoker.call(
          req => Administrator_0.userslist(req))
      }
  
    // @LINE:25
    case controllers_Administrator_addUser12_route(params@_) =>
      call { 
        controllers_Administrator_addUser12_invoker.call(
          req => Administrator_0.addUser(req))
      }
  
    // @LINE:26
    case controllers_Administrator_removeUser13_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Administrator_removeUser13_invoker.call(
          req => Administrator_0.removeUser(req, id))
      }
  
    // @LINE:29
    case controllers_Manager_manager14_route(params@_) =>
      call { 
        controllers_Manager_manager14_invoker.call(
          req => Manager_1.manager(req))
      }
  
    // @LINE:30
    case controllers_Manager_createcanteen15_route(params@_) =>
      call { 
        controllers_Manager_createcanteen15_invoker.call(
          req => Manager_1.createcanteen(req))
      }
  
    // @LINE:31
    case controllers_Manager_managemenus16_route(params@_) =>
      call { 
        controllers_Manager_managemenus16_invoker.call(
          req => Manager_1.managemenus(req))
      }
  
    // @LINE:32
    case controllers_Manager_managetickets17_route(params@_) =>
      call { 
        controllers_Manager_managetickets17_invoker.call(
          req => Manager_1.managetickets(req))
      }
  
    // @LINE:33
    case controllers_Manager_northycanteen18_route(params@_) =>
      call { 
        controllers_Manager_northycanteen18_invoker.call(
          req => Manager_1.northycanteen(req))
      }
  
    // @LINE:34
    case controllers_Manager_westycanteen19_route(params@_) =>
      call { 
        controllers_Manager_westycanteen19_invoker.call(
          req => Manager_1.westycanteen(req))
      }
  
    // @LINE:35
    case controllers_Manager_eastycanteen20_route(params@_) =>
      call { 
        controllers_Manager_eastycanteen20_invoker.call(
          req => Manager_1.eastycanteen(req))
      }
  
    // @LINE:36
    case controllers_Manager_southycanteen21_route(params@_) =>
      call { 
        controllers_Manager_southycanteen21_invoker.call(
          req => Manager_1.southycanteen(req))
      }
  
    // @LINE:39
    case controllers_Student_tickets22_route(params@_) =>
      call { 
        controllers_Student_tickets22_invoker.call(
          req => Student_2.tickets(req))
      }
  
    // @LINE:40
    case controllers_Student_wallet23_route(params@_) =>
      call { 
        controllers_Student_wallet23_invoker.call(
          req => Student_2.wallet(req))
      }
  
    // @LINE:44
    case controllers_Assets_at24_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at24_invoker.call(Assets_3.at(path, file))
      }
  }
}
