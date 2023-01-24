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
  MainController_0: controllers.MainController,
  // @LINE:10
  AuthController_5: controllers.AuthController,
  // @LINE:24
  Administrator_2: controllers.Administrator,
  // @LINE:35
  Manager_3: controllers.Manager,
  // @LINE:53
  CanteenController_1: controllers.CanteenController,
  // @LINE:58
  Student_4: controllers.Student,
  // @LINE:69
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    MainController_0: controllers.MainController,
    // @LINE:10
    AuthController_5: controllers.AuthController,
    // @LINE:24
    Administrator_2: controllers.Administrator,
    // @LINE:35
    Manager_3: controllers.Manager,
    // @LINE:53
    CanteenController_1: controllers.CanteenController,
    // @LINE:58
    Student_4: controllers.Student,
    // @LINE:69
    Assets_6: controllers.Assets
  ) = this(errorHandler, MainController_0, AuthController_5, Administrator_2, Manager_3, CanteenController_1, Student_4, Assets_6, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MainController_0, AuthController_5, Administrator_2, Manager_3, CanteenController_1, Student_4, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.MainController.landing(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.MainController.home(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.AuthController.signup(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.AuthController.signupProcess(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthController.login(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthController.loginProcess(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.MainController.profile(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recoverpassword""", """controllers.MainController.recoverpassword(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """termsofuse""", """controllers.MainController.termsofuse(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """privacypolicy""", """controllers.MainController.privacypolicy(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """help""", """controllers.MainController.help(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """administrator""", """controllers.Administrator.administrator(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authapproval""", """controllers.Administrator.authapproval(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userslist""", """controllers.Administrator.userslist(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """approveUser""", """controllers.Administrator.approveUser(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeUser""", """controllers.Administrator.removeUser(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """denyUser""", """controllers.Administrator.denyUser(request:Request, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createcanteen""", """controllers.Administrator.createcanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managecanteens""", """controllers.Administrator.managecanteens(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager_arc""", """controllers.Manager.manager_arc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_menus_arc""", """controllers.Manager.manage_menus_arc(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_menus_arc""", """controllers.Manager.createMenu(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_tickets_arc""", """controllers.Manager.manage_tickets_arc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager_tld""", """controllers.Manager.manager_tld(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_menus_tld""", """controllers.Manager.manage_menus_tld(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_tickets_tld""", """controllers.Manager.manage_tickets_tld(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager_tlc""", """controllers.Manager.manager_tlc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_menus_tlc""", """controllers.Manager.manage_menus_tlc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_tickets_tlc""", """controllers.Manager.manage_tickets_tlc(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager_wss""", """controllers.Manager.manager_wss(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_menus_wss""", """controllers.Manager.manage_menus_wss(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_tickets_wss""", """controllers.Manager.manage_tickets_wss(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """canteen/""" + "$" + """id<[^/]+>""", """controllers.CanteenController.canteen(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """canteen/""" + "$" + """id<[^/]+>""", """controllers.CanteenController.canteen(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """canteen""", """controllers.CanteenController.buy(request:Request, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tickets""", """controllers.Student.tickets(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wallet""", """controllers.Student.wallet(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_MainController_landing0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_MainController_landing0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MainController_0.landing(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "landing",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""",
      """ GERAL""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_MainController_home1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_MainController_home1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MainController_0.home(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "home",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """home""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AuthController_signup2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_AuthController_signup2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      AuthController_5.signup(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "signup",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AuthController_signupProcess3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_AuthController_signupProcess3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      AuthController_5.signupProcess(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "signupProcess",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AuthController_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_login4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      AuthController_5.login(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "login",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_AuthController_loginProcess5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_loginProcess5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      AuthController_5.loginProcess(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "loginProcess",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_MainController_profile6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_MainController_profile6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MainController_0.profile(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "profile",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """profile""",
      """POST    /logout                                 controllers.AuthController.logout(request: Request)""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_MainController_recoverpassword7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recoverpassword")))
  )
  private[this] lazy val controllers_MainController_recoverpassword7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MainController_0.recoverpassword(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "recoverpassword",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """recoverpassword""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_MainController_termsofuse8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("termsofuse")))
  )
  private[this] lazy val controllers_MainController_termsofuse8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MainController_0.termsofuse(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "termsofuse",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """termsofuse""",
      """ SETTINGS""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_MainController_privacypolicy9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("privacypolicy")))
  )
  private[this] lazy val controllers_MainController_privacypolicy9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MainController_0.privacypolicy(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "privacypolicy",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """privacypolicy""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_MainController_help10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("help")))
  )
  private[this] lazy val controllers_MainController_help10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MainController_0.help(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "help",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """help""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Administrator_administrator11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("administrator")))
  )
  private[this] lazy val controllers_Administrator_administrator11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_2.administrator(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:25
  private[this] lazy val controllers_Administrator_authapproval12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authapproval")))
  )
  private[this] lazy val controllers_Administrator_authapproval12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_2.authapproval(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:26
  private[this] lazy val controllers_Administrator_userslist13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userslist")))
  )
  private[this] lazy val controllers_Administrator_userslist13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_2.userslist(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:27
  private[this] lazy val controllers_Administrator_approveUser14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("approveUser")))
  )
  private[this] lazy val controllers_Administrator_approveUser14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_2.approveUser(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
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

  // @LINE:28
  private[this] lazy val controllers_Administrator_removeUser15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeUser")))
  )
  private[this] lazy val controllers_Administrator_removeUser15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_2.removeUser(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
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

  // @LINE:29
  private[this] lazy val controllers_Administrator_denyUser16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("denyUser")))
  )
  private[this] lazy val controllers_Administrator_denyUser16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_2.denyUser(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
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

  // @LINE:30
  private[this] lazy val controllers_Administrator_createcanteen17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createcanteen")))
  )
  private[this] lazy val controllers_Administrator_createcanteen17_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_2.createcanteen(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:31
  private[this] lazy val controllers_Administrator_managecanteens18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managecanteens")))
  )
  private[this] lazy val controllers_Administrator_managecanteens18_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_2.managecanteens(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:35
  private[this] lazy val controllers_Manager_manager_arc19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager_arc")))
  )
  private[this] lazy val controllers_Manager_manager_arc19_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manager_arc(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:36
  private[this] lazy val controllers_Manager_manage_menus_arc20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_menus_arc")))
  )
  private[this] lazy val controllers_Manager_manage_menus_arc20_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manage_menus_arc(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:37
  private[this] lazy val controllers_Manager_createMenu21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_menus_arc")))
  )
  private[this] lazy val controllers_Manager_createMenu21_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.createMenu(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "createMenu",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """manage_menus_arc""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Manager_manage_tickets_arc22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_tickets_arc")))
  )
  private[this] lazy val controllers_Manager_manage_tickets_arc22_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manage_tickets_arc(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_tickets_arc",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_tickets_arc""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Manager_manager_tld23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager_tld")))
  )
  private[this] lazy val controllers_Manager_manager_tld23_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manager_tld(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manager_tld",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manager_tld""",
      """ THE LAST DROP""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Manager_manage_menus_tld24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_menus_tld")))
  )
  private[this] lazy val controllers_Manager_manage_menus_tld24_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manage_menus_tld(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:42
  private[this] lazy val controllers_Manager_manage_tickets_tld25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_tickets_tld")))
  )
  private[this] lazy val controllers_Manager_manage_tickets_tld25_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manage_tickets_tld(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:44
  private[this] lazy val controllers_Manager_manager_tlc26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager_tlc")))
  )
  private[this] lazy val controllers_Manager_manager_tlc26_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manager_tlc(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:45
  private[this] lazy val controllers_Manager_manage_menus_tlc27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_menus_tlc")))
  )
  private[this] lazy val controllers_Manager_manage_menus_tlc27_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manage_menus_tlc(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:46
  private[this] lazy val controllers_Manager_manage_tickets_tlc28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_tickets_tlc")))
  )
  private[this] lazy val controllers_Manager_manage_tickets_tlc28_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manage_tickets_tlc(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:48
  private[this] lazy val controllers_Manager_manager_wss29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager_wss")))
  )
  private[this] lazy val controllers_Manager_manager_wss29_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manager_wss(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:49
  private[this] lazy val controllers_Manager_manage_menus_wss30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_menus_wss")))
  )
  private[this] lazy val controllers_Manager_manage_menus_wss30_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manage_menus_wss(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:50
  private[this] lazy val controllers_Manager_manage_tickets_wss31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_tickets_wss")))
  )
  private[this] lazy val controllers_Manager_manage_tickets_wss31_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_3.manage_tickets_wss(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:53
  private[this] lazy val controllers_CanteenController_canteen32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("canteen/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CanteenController_canteen32_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CanteenController_1.canteen(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
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

  // @LINE:54
  private[this] lazy val controllers_CanteenController_canteen33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("canteen/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CanteenController_canteen33_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CanteenController_1.canteen(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CanteenController",
      "canteen",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "POST",
      this.prefix + """canteen/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_CanteenController_buy34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("canteen")))
  )
  private[this] lazy val controllers_CanteenController_buy34_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CanteenController_1.buy(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CanteenController",
      "buy",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "POST",
      this.prefix + """canteen""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Student_tickets35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tickets")))
  )
  private[this] lazy val controllers_Student_tickets35_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Student_4.tickets(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:59
  private[this] lazy val controllers_Student_wallet36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wallet")))
  )
  private[this] lazy val controllers_Student_wallet36_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Student_4.wallet(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:69
  private[this] lazy val controllers_Assets_at37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at37_invoker = createInvoker(
    Assets_6.at(fakeValue[String], fakeValue[String]),
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
    case controllers_MainController_landing0_route(params@_) =>
      call { 
        controllers_MainController_landing0_invoker.call(
          req => MainController_0.landing(req))
      }
  
    // @LINE:9
    case controllers_MainController_home1_route(params@_) =>
      call { 
        controllers_MainController_home1_invoker.call(
          req => MainController_0.home(req))
      }
  
    // @LINE:10
    case controllers_AuthController_signup2_route(params@_) =>
      call { 
        controllers_AuthController_signup2_invoker.call(
          req => AuthController_5.signup(req))
      }
  
    // @LINE:11
    case controllers_AuthController_signupProcess3_route(params@_) =>
      call { 
        controllers_AuthController_signupProcess3_invoker.call(
          req => AuthController_5.signupProcess(req))
      }
  
    // @LINE:12
    case controllers_AuthController_login4_route(params@_) =>
      call { 
        controllers_AuthController_login4_invoker.call(
          req => AuthController_5.login(req))
      }
  
    // @LINE:13
    case controllers_AuthController_loginProcess5_route(params@_) =>
      call { 
        controllers_AuthController_loginProcess5_invoker.call(
          req => AuthController_5.loginProcess(req))
      }
  
    // @LINE:15
    case controllers_MainController_profile6_route(params@_) =>
      call { 
        controllers_MainController_profile6_invoker.call(
          req => MainController_0.profile(req))
      }
  
    // @LINE:16
    case controllers_MainController_recoverpassword7_route(params@_) =>
      call { 
        controllers_MainController_recoverpassword7_invoker.call(
          req => MainController_0.recoverpassword(req))
      }
  
    // @LINE:19
    case controllers_MainController_termsofuse8_route(params@_) =>
      call { 
        controllers_MainController_termsofuse8_invoker.call(
          req => MainController_0.termsofuse(req))
      }
  
    // @LINE:20
    case controllers_MainController_privacypolicy9_route(params@_) =>
      call { 
        controllers_MainController_privacypolicy9_invoker.call(
          req => MainController_0.privacypolicy(req))
      }
  
    // @LINE:21
    case controllers_MainController_help10_route(params@_) =>
      call { 
        controllers_MainController_help10_invoker.call(
          req => MainController_0.help(req))
      }
  
    // @LINE:24
    case controllers_Administrator_administrator11_route(params@_) =>
      call { 
        controllers_Administrator_administrator11_invoker.call(
          req => Administrator_2.administrator(req))
      }
  
    // @LINE:25
    case controllers_Administrator_authapproval12_route(params@_) =>
      call { 
        controllers_Administrator_authapproval12_invoker.call(
          req => Administrator_2.authapproval(req))
      }
  
    // @LINE:26
    case controllers_Administrator_userslist13_route(params@_) =>
      call { 
        controllers_Administrator_userslist13_invoker.call(
          req => Administrator_2.userslist(req))
      }
  
    // @LINE:27
    case controllers_Administrator_approveUser14_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Administrator_approveUser14_invoker.call(
          req => Administrator_2.approveUser(req, id))
      }
  
    // @LINE:28
    case controllers_Administrator_removeUser15_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Administrator_removeUser15_invoker.call(
          req => Administrator_2.removeUser(req, id))
      }
  
    // @LINE:29
    case controllers_Administrator_denyUser16_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Administrator_denyUser16_invoker.call(
          req => Administrator_2.denyUser(req, id))
      }
  
    // @LINE:30
    case controllers_Administrator_createcanteen17_route(params@_) =>
      call { 
        controllers_Administrator_createcanteen17_invoker.call(
          req => Administrator_2.createcanteen(req))
      }
  
    // @LINE:31
    case controllers_Administrator_managecanteens18_route(params@_) =>
      call { 
        controllers_Administrator_managecanteens18_invoker.call(
          req => Administrator_2.managecanteens(req))
      }
  
    // @LINE:35
    case controllers_Manager_manager_arc19_route(params@_) =>
      call { 
        controllers_Manager_manager_arc19_invoker.call(
          req => Manager_3.manager_arc(req))
      }
  
    // @LINE:36
    case controllers_Manager_manage_menus_arc20_route(params@_) =>
      call { 
        controllers_Manager_manage_menus_arc20_invoker.call(
          req => Manager_3.manage_menus_arc(req))
      }
  
    // @LINE:37
    case controllers_Manager_createMenu21_route(params@_) =>
      call { 
        controllers_Manager_createMenu21_invoker.call(
          req => Manager_3.createMenu(req))
      }
  
    // @LINE:38
    case controllers_Manager_manage_tickets_arc22_route(params@_) =>
      call { 
        controllers_Manager_manage_tickets_arc22_invoker.call(
          req => Manager_3.manage_tickets_arc(req))
      }
  
    // @LINE:40
    case controllers_Manager_manager_tld23_route(params@_) =>
      call { 
        controllers_Manager_manager_tld23_invoker.call(
          req => Manager_3.manager_tld(req))
      }
  
    // @LINE:41
    case controllers_Manager_manage_menus_tld24_route(params@_) =>
      call { 
        controllers_Manager_manage_menus_tld24_invoker.call(
          req => Manager_3.manage_menus_tld(req))
      }
  
    // @LINE:42
    case controllers_Manager_manage_tickets_tld25_route(params@_) =>
      call { 
        controllers_Manager_manage_tickets_tld25_invoker.call(
          req => Manager_3.manage_tickets_tld(req))
      }
  
    // @LINE:44
    case controllers_Manager_manager_tlc26_route(params@_) =>
      call { 
        controllers_Manager_manager_tlc26_invoker.call(
          req => Manager_3.manager_tlc(req))
      }
  
    // @LINE:45
    case controllers_Manager_manage_menus_tlc27_route(params@_) =>
      call { 
        controllers_Manager_manage_menus_tlc27_invoker.call(
          req => Manager_3.manage_menus_tlc(req))
      }
  
    // @LINE:46
    case controllers_Manager_manage_tickets_tlc28_route(params@_) =>
      call { 
        controllers_Manager_manage_tickets_tlc28_invoker.call(
          req => Manager_3.manage_tickets_tlc(req))
      }
  
    // @LINE:48
    case controllers_Manager_manager_wss29_route(params@_) =>
      call { 
        controllers_Manager_manager_wss29_invoker.call(
          req => Manager_3.manager_wss(req))
      }
  
    // @LINE:49
    case controllers_Manager_manage_menus_wss30_route(params@_) =>
      call { 
        controllers_Manager_manage_menus_wss30_invoker.call(
          req => Manager_3.manage_menus_wss(req))
      }
  
    // @LINE:50
    case controllers_Manager_manage_tickets_wss31_route(params@_) =>
      call { 
        controllers_Manager_manage_tickets_wss31_invoker.call(
          req => Manager_3.manage_tickets_wss(req))
      }
  
    // @LINE:53
    case controllers_CanteenController_canteen32_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CanteenController_canteen32_invoker.call(
          req => CanteenController_1.canteen(req, id))
      }
  
    // @LINE:54
    case controllers_CanteenController_canteen33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CanteenController_canteen33_invoker.call(
          req => CanteenController_1.canteen(req, id))
      }
  
    // @LINE:55
    case controllers_CanteenController_buy34_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CanteenController_buy34_invoker.call(
          req => CanteenController_1.buy(req, id))
      }
  
    // @LINE:58
    case controllers_Student_tickets35_route(params@_) =>
      call { 
        controllers_Student_tickets35_invoker.call(
          req => Student_4.tickets(req))
      }
  
    // @LINE:59
    case controllers_Student_wallet36_route(params@_) =>
      call { 
        controllers_Student_wallet36_invoker.call(
          req => Student_4.wallet(req))
      }
  
    // @LINE:69
    case controllers_Assets_at37_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at37_invoker.call(Assets_6.at(path, file))
      }
  }
}
