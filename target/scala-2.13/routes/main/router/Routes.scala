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
  HomeController_5: controllers.HomeController,
  // @LINE:27
  Administrator_1: controllers.Administrator,
  // @LINE:38
  Manager_2: controllers.Manager,
  // @LINE:59
  CanteenController_0: controllers.CanteenController,
  // @LINE:63
  Student_3: controllers.Student,
  // @LINE:74
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_5: controllers.HomeController,
    // @LINE:27
    Administrator_1: controllers.Administrator,
    // @LINE:38
    Manager_2: controllers.Manager,
    // @LINE:59
    CanteenController_0: controllers.CanteenController,
    // @LINE:63
    Student_3: controllers.Student,
    // @LINE:74
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_5, Administrator_1, Manager_2, CanteenController_0, Student_3, Assets_4, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, Administrator_1, Manager_2, CanteenController_0, Student_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.landing(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.home(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recoverpassword""", """controllers.HomeController.recoverpassword(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """termsofuse""", """controllers.HomeController.termsofuse(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """privacypolicy""", """controllers.HomeController.privacypolicy(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """help""", """controllers.HomeController.help(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calendar""", """controllers.HomeController.calendar(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """administrator""", """controllers.Administrator.administrator(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authapproval""", """controllers.Administrator.authapproval(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userslist""", """controllers.Administrator.userslist(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """approveUser""", """controllers.Administrator.approveUser(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeUser""", """controllers.Administrator.removeUser(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """denyUser""", """controllers.Administrator.denyUser(request:Request, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createcanteen""", """controllers.Administrator.createcanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managecanteens""", """controllers.Administrator.managecanteens(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager_arc""", """controllers.Manager.manager_arc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_arc""", """controllers.Manager.manage_arc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_menus_arc""", """controllers.Manager.manage_menus_arc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager_tld""", """controllers.Manager.manager_tld(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_tld""", """controllers.Manager.manage_tld(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_menus_tld""", """controllers.Manager.manage_menus_tld(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_tickets_tld""", """controllers.Manager.manage_tickets_tld(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager_tlc""", """controllers.Manager.manager_tlc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_tlc""", """controllers.Manager.manage_tlc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_menus_tlc""", """controllers.Manager.manage_menus_tlc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_tickets_tlc""", """controllers.Manager.manage_tickets_tlc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager_wss""", """controllers.Manager.manager_wss(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_wss""", """controllers.Manager.manage_wss(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_menus_wss""", """controllers.Manager.manage_menus_wss(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_tickets_wss""", """controllers.Manager.manage_tickets_wss(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """canteen/""" + "$" + """id<[^/]+>""", """controllers.CanteenController.canteen(request:Request, id:Long)"""),
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
      HomeController_5.landing(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "landing",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""",
      """ GERAL""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_home1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_home1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.home(fakeValue[play.mvc.Http.Request]),
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
  private[this] lazy val controllers_HomeController_signup2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.signup(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:16
  private[this] lazy val controllers_HomeController_profile3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.profile(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """profile""",
      """POST    /signupProcess                          controllers.HomeController.signupProcess(request: Request)
GET     /login                                  controllers.LoginController.login(request: Request)
POST    /login                                  controllers.LoginController.handleLogin()
POST    /signinProcess                          controllers.HomeController.signinProcess(request: Request)
POST    /logout                                 controllers.Application.logout()""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_recoverpassword4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recoverpassword")))
  )
  private[this] lazy val controllers_HomeController_recoverpassword4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.recoverpassword(fakeValue[play.mvc.Http.Request]),
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
  private[this] lazy val controllers_HomeController_termsofuse5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("termsofuse")))
  )
  private[this] lazy val controllers_HomeController_termsofuse5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.termsofuse(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "termsofuse",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """termsofuse""",
      """ SETTINGS""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_privacypolicy6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("privacypolicy")))
  )
  private[this] lazy val controllers_HomeController_privacypolicy6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.privacypolicy(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:22
  private[this] lazy val controllers_HomeController_help7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("help")))
  )
  private[this] lazy val controllers_HomeController_help7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.help(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "help",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """help""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_calendar8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calendar")))
  )
  private[this] lazy val controllers_HomeController_calendar8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.calendar(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:27
  private[this] lazy val controllers_Administrator_administrator9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("administrator")))
  )
  private[this] lazy val controllers_Administrator_administrator9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_1.administrator(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "administrator",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """administrator""",
      """ ADMINISTRATION""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Administrator_authapproval10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authapproval")))
  )
  private[this] lazy val controllers_Administrator_authapproval10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_1.authapproval(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:29
  private[this] lazy val controllers_Administrator_userslist11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userslist")))
  )
  private[this] lazy val controllers_Administrator_userslist11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_1.userslist(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:30
  private[this] lazy val controllers_Administrator_approveUser12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("approveUser")))
  )
  private[this] lazy val controllers_Administrator_approveUser12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_1.approveUser(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "approveUser",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "POST",
      this.prefix + """approveUser""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Administrator_removeUser13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeUser")))
  )
  private[this] lazy val controllers_Administrator_removeUser13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_1.removeUser(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "removeUser",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "POST",
      this.prefix + """removeUser""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Administrator_denyUser14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("denyUser")))
  )
  private[this] lazy val controllers_Administrator_denyUser14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_1.denyUser(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "denyUser",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "POST",
      this.prefix + """denyUser""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Administrator_createcanteen15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createcanteen")))
  )
  private[this] lazy val controllers_Administrator_createcanteen15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_1.createcanteen(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "createcanteen",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """createcanteen""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Administrator_managecanteens16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managecanteens")))
  )
  private[this] lazy val controllers_Administrator_managecanteens16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_1.managecanteens(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "managecanteens",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """managecanteens""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Manager_manager_arc17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager_arc")))
  )
  private[this] lazy val controllers_Manager_manager_arc17_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manager_arc(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manager_arc",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manager_arc""",
      """ MANAGEMENT
 ARCONIA""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Manager_manage_arc18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_arc")))
  )
  private[this] lazy val controllers_Manager_manage_arc18_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_arc(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_arc",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_arc""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Manager_manage_menus_arc19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_menus_arc")))
  )
  private[this] lazy val controllers_Manager_manage_menus_arc19_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_menus_arc(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_menus_arc",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_menus_arc""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Manager_manager_tld20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager_tld")))
  )
  private[this] lazy val controllers_Manager_manager_tld20_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manager_tld(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manager_tld",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manager_tld""",
      """GET     /manage_tickets_arc                     controllers.Manager.manage_tickets_arc(request: Request)
 THE LAST DROP""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Manager_manage_tld21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_tld")))
  )
  private[this] lazy val controllers_Manager_manage_tld21_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_tld(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_tld",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_tld""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Manager_manage_menus_tld22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_menus_tld")))
  )
  private[this] lazy val controllers_Manager_manage_menus_tld22_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_menus_tld(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_menus_tld",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_menus_tld""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Manager_manage_tickets_tld23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_tickets_tld")))
  )
  private[this] lazy val controllers_Manager_manage_tickets_tld23_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_tickets_tld(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_tickets_tld",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_tickets_tld""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Manager_manager_tlc24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager_tlc")))
  )
  private[this] lazy val controllers_Manager_manager_tlc24_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manager_tlc(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manager_tlc",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manager_tlc""",
      """ THE LEAKY CAULDRON""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Manager_manage_tlc25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_tlc")))
  )
  private[this] lazy val controllers_Manager_manage_tlc25_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_tlc(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_tlc",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_tlc""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Manager_manage_menus_tlc26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_menus_tlc")))
  )
  private[this] lazy val controllers_Manager_manage_menus_tlc26_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_menus_tlc(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_menus_tlc",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_menus_tlc""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Manager_manage_tickets_tlc27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_tickets_tlc")))
  )
  private[this] lazy val controllers_Manager_manage_tickets_tlc27_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_tickets_tlc(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_tickets_tlc",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_tickets_tlc""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Manager_manager_wss28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager_wss")))
  )
  private[this] lazy val controllers_Manager_manager_wss28_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manager_wss(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manager_wss",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manager_wss""",
      """ WAVERLY SUB STATION""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Manager_manage_wss29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_wss")))
  )
  private[this] lazy val controllers_Manager_manage_wss29_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_wss(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_wss",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_wss""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Manager_manage_menus_wss30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_menus_wss")))
  )
  private[this] lazy val controllers_Manager_manage_menus_wss30_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_menus_wss(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_menus_wss",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_menus_wss""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Manager_manage_tickets_wss31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_tickets_wss")))
  )
  private[this] lazy val controllers_Manager_manage_tickets_wss31_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_tickets_wss(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_tickets_wss",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_tickets_wss""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_CanteenController_canteen32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("canteen/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CanteenController_canteen32_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CanteenController_0.canteen(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CanteenController",
      "canteen",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "GET",
      this.prefix + """canteen/""" + "$" + """id<[^/]+>""",
      """ CANTEENS""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Student_tickets33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tickets")))
  )
  private[this] lazy val controllers_Student_tickets33_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Student_3.tickets(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Student",
      "tickets",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """tickets""",
      """ STUDENT""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Student_wallet34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wallet")))
  )
  private[this] lazy val controllers_Student_wallet34_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Student_3.wallet(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:74
  private[this] lazy val controllers_Assets_at35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at35_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
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
          req => HomeController_5.landing(req))
      }
  
    // @LINE:9
    case controllers_HomeController_home1_route(params@_) =>
      call { 
        controllers_HomeController_home1_invoker.call(
          req => HomeController_5.home(req))
      }
  
    // @LINE:10
    case controllers_HomeController_signup2_route(params@_) =>
      call { 
        controllers_HomeController_signup2_invoker.call(
          req => HomeController_5.signup(req))
      }
  
    // @LINE:16
    case controllers_HomeController_profile3_route(params@_) =>
      call { 
        controllers_HomeController_profile3_invoker.call(
          req => HomeController_5.profile(req))
      }
  
    // @LINE:17
    case controllers_HomeController_recoverpassword4_route(params@_) =>
      call { 
        controllers_HomeController_recoverpassword4_invoker.call(
          req => HomeController_5.recoverpassword(req))
      }
  
    // @LINE:20
    case controllers_HomeController_termsofuse5_route(params@_) =>
      call { 
        controllers_HomeController_termsofuse5_invoker.call(
          req => HomeController_5.termsofuse(req))
      }
  
    // @LINE:21
    case controllers_HomeController_privacypolicy6_route(params@_) =>
      call { 
        controllers_HomeController_privacypolicy6_invoker.call(
          req => HomeController_5.privacypolicy(req))
      }
  
    // @LINE:22
    case controllers_HomeController_help7_route(params@_) =>
      call { 
        controllers_HomeController_help7_invoker.call(
          req => HomeController_5.help(req))
      }
  
    // @LINE:24
    case controllers_HomeController_calendar8_route(params@_) =>
      call { 
        controllers_HomeController_calendar8_invoker.call(
          req => HomeController_5.calendar(req))
      }
  
    // @LINE:27
    case controllers_Administrator_administrator9_route(params@_) =>
      call { 
        controllers_Administrator_administrator9_invoker.call(
          req => Administrator_1.administrator(req))
      }
  
    // @LINE:28
    case controllers_Administrator_authapproval10_route(params@_) =>
      call { 
        controllers_Administrator_authapproval10_invoker.call(
          req => Administrator_1.authapproval(req))
      }
  
    // @LINE:29
    case controllers_Administrator_userslist11_route(params@_) =>
      call { 
        controllers_Administrator_userslist11_invoker.call(
          req => Administrator_1.userslist(req))
      }
  
    // @LINE:30
    case controllers_Administrator_approveUser12_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Administrator_approveUser12_invoker.call(
          req => Administrator_1.approveUser(req, id))
      }
  
    // @LINE:31
    case controllers_Administrator_removeUser13_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Administrator_removeUser13_invoker.call(
          req => Administrator_1.removeUser(req, id))
      }
  
    // @LINE:32
    case controllers_Administrator_denyUser14_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Administrator_denyUser14_invoker.call(
          req => Administrator_1.denyUser(req, id))
      }
  
    // @LINE:33
    case controllers_Administrator_createcanteen15_route(params@_) =>
      call { 
        controllers_Administrator_createcanteen15_invoker.call(
          req => Administrator_1.createcanteen(req))
      }
  
    // @LINE:34
    case controllers_Administrator_managecanteens16_route(params@_) =>
      call { 
        controllers_Administrator_managecanteens16_invoker.call(
          req => Administrator_1.managecanteens(req))
      }
  
    // @LINE:38
    case controllers_Manager_manager_arc17_route(params@_) =>
      call { 
        controllers_Manager_manager_arc17_invoker.call(
          req => Manager_2.manager_arc(req))
      }
  
    // @LINE:39
    case controllers_Manager_manage_arc18_route(params@_) =>
      call { 
        controllers_Manager_manage_arc18_invoker.call(
          req => Manager_2.manage_arc(req))
      }
  
    // @LINE:40
    case controllers_Manager_manage_menus_arc19_route(params@_) =>
      call { 
        controllers_Manager_manage_menus_arc19_invoker.call(
          req => Manager_2.manage_menus_arc(req))
      }
  
    // @LINE:43
    case controllers_Manager_manager_tld20_route(params@_) =>
      call { 
        controllers_Manager_manager_tld20_invoker.call(
          req => Manager_2.manager_tld(req))
      }
  
    // @LINE:44
    case controllers_Manager_manage_tld21_route(params@_) =>
      call { 
        controllers_Manager_manage_tld21_invoker.call(
          req => Manager_2.manage_tld(req))
      }
  
    // @LINE:45
    case controllers_Manager_manage_menus_tld22_route(params@_) =>
      call { 
        controllers_Manager_manage_menus_tld22_invoker.call(
          req => Manager_2.manage_menus_tld(req))
      }
  
    // @LINE:46
    case controllers_Manager_manage_tickets_tld23_route(params@_) =>
      call { 
        controllers_Manager_manage_tickets_tld23_invoker.call(
          req => Manager_2.manage_tickets_tld(req))
      }
  
    // @LINE:48
    case controllers_Manager_manager_tlc24_route(params@_) =>
      call { 
        controllers_Manager_manager_tlc24_invoker.call(
          req => Manager_2.manager_tlc(req))
      }
  
    // @LINE:49
    case controllers_Manager_manage_tlc25_route(params@_) =>
      call { 
        controllers_Manager_manage_tlc25_invoker.call(
          req => Manager_2.manage_tlc(req))
      }
  
    // @LINE:50
    case controllers_Manager_manage_menus_tlc26_route(params@_) =>
      call { 
        controllers_Manager_manage_menus_tlc26_invoker.call(
          req => Manager_2.manage_menus_tlc(req))
      }
  
    // @LINE:51
    case controllers_Manager_manage_tickets_tlc27_route(params@_) =>
      call { 
        controllers_Manager_manage_tickets_tlc27_invoker.call(
          req => Manager_2.manage_tickets_tlc(req))
      }
  
    // @LINE:53
    case controllers_Manager_manager_wss28_route(params@_) =>
      call { 
        controllers_Manager_manager_wss28_invoker.call(
          req => Manager_2.manager_wss(req))
      }
  
    // @LINE:54
    case controllers_Manager_manage_wss29_route(params@_) =>
      call { 
        controllers_Manager_manage_wss29_invoker.call(
          req => Manager_2.manage_wss(req))
      }
  
    // @LINE:55
    case controllers_Manager_manage_menus_wss30_route(params@_) =>
      call { 
        controllers_Manager_manage_menus_wss30_invoker.call(
          req => Manager_2.manage_menus_wss(req))
      }
  
    // @LINE:56
    case controllers_Manager_manage_tickets_wss31_route(params@_) =>
      call { 
        controllers_Manager_manage_tickets_wss31_invoker.call(
          req => Manager_2.manage_tickets_wss(req))
      }
  
    // @LINE:59
    case controllers_CanteenController_canteen32_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CanteenController_canteen32_invoker.call(
          req => CanteenController_0.canteen(req, id))
      }
  
    // @LINE:63
    case controllers_Student_tickets33_route(params@_) =>
      call { 
        controllers_Student_tickets33_invoker.call(
          req => Student_3.tickets(req))
      }
  
    // @LINE:64
    case controllers_Student_wallet34_route(params@_) =>
      call { 
        controllers_Student_wallet34_invoker.call(
          req => Student_3.wallet(req))
      }
  
    // @LINE:74
    case controllers_Assets_at35_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at35_invoker.call(Assets_4.at(path, file))
      }
  }
}
