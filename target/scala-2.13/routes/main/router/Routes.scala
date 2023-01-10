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
  // @LINE:35
  Manager_2: controllers.Manager,
  // @LINE:46
  CanteenController_0: controllers.CanteenController,
  // @LINE:52
  Student_3: controllers.Student,
  // @LINE:63
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_5: controllers.HomeController,
    // @LINE:27
    Administrator_1: controllers.Administrator,
    // @LINE:35
    Manager_2: controllers.Manager,
    // @LINE:46
    CanteenController_0: controllers.CanteenController,
    // @LINE:52
    Student_3: controllers.Student,
    // @LINE:63
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signinProcess""", """controllers.HomeController.login(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recoverpassword""", """controllers.HomeController.recoverpassword(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signupProcess""", """controllers.HomeController.signup(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """termsofuse""", """controllers.HomeController.termsofuse(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """privacypolicy""", """controllers.HomeController.privacypolicy(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """help""", """controllers.HomeController.help(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calendar""", """controllers.HomeController.calendar(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """administrator""", """controllers.Administrator.administrator(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authapproval""", """controllers.Administrator.authapproval(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userslist""", """controllers.Administrator.userslist(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.Administrator.addUser(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeUser""", """controllers.Administrator.removeUser(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """denyUser""", """controllers.Administrator.denyUser(request:Request, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager""", """controllers.Manager.manager(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createcanteen""", """controllers.Manager.createcanteen(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managemenus""", """controllers.Manager.managemenus(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managetickets""", """controllers.Manager.managetickets(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managecanteens""", """controllers.Manager.managetickets(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_thelastdrop""", """controllers.Manager.manage_thelastdrop(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_arconia""", """controllers.Manager.manage_arconia(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_theleakycauldron""", """controllers.Manager.manage_theleakycauldron(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage_waverly""", """controllers.Manager.manage_waverlysubstation(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """theleakycauldron""", """controllers.CanteenController.theleakycauldron(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """thelastdrop""", """controllers.CanteenController.thelastdrop(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """arconia""", """controllers.CanteenController.arconia(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """waverlysubstation""", """controllers.CanteenController.waverlysubstation(request:Request)"""),
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
  private[this] lazy val controllers_HomeController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.login(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:11
  private[this] lazy val controllers_HomeController_login3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signinProcess")))
  )
  private[this] lazy val controllers_HomeController_login3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.login(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """signinProcess""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_profile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.profile(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """profile""",
      """POST    /login                      controllers.Application.authenticate(username, password)
GET     /logout                     controllers.Application.logout()""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_recoverpassword5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recoverpassword")))
  )
  private[this] lazy val controllers_HomeController_recoverpassword5_invoker = createInvoker(
    
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

  // @LINE:16
  private[this] lazy val controllers_HomeController_signup6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup6_invoker = createInvoker(
    
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_signup7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signupProcess")))
  )
  private[this] lazy val controllers_HomeController_signup7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.signup(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """signupProcess""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_termsofuse8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("termsofuse")))
  )
  private[this] lazy val controllers_HomeController_termsofuse8_invoker = createInvoker(
    
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
  private[this] lazy val controllers_HomeController_privacypolicy9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("privacypolicy")))
  )
  private[this] lazy val controllers_HomeController_privacypolicy9_invoker = createInvoker(
    
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
  private[this] lazy val controllers_HomeController_help10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("help")))
  )
  private[this] lazy val controllers_HomeController_help10_invoker = createInvoker(
    
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
  private[this] lazy val controllers_HomeController_calendar11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calendar")))
  )
  private[this] lazy val controllers_HomeController_calendar11_invoker = createInvoker(
    
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
  private[this] lazy val controllers_Administrator_administrator12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("administrator")))
  )
  private[this] lazy val controllers_Administrator_administrator12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_1.administrator(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:28
  private[this] lazy val controllers_Administrator_authapproval13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authapproval")))
  )
  private[this] lazy val controllers_Administrator_authapproval13_invoker = createInvoker(
    
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
  private[this] lazy val controllers_Administrator_userslist14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userslist")))
  )
  private[this] lazy val controllers_Administrator_userslist14_invoker = createInvoker(
    
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
  private[this] lazy val controllers_Administrator_addUser15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_Administrator_addUser15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Administrator_1.addUser(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administrator",
      "addUser",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """addUser""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Administrator_removeUser16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeUser")))
  )
  private[this] lazy val controllers_Administrator_removeUser16_invoker = createInvoker(
    
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
  private[this] lazy val controllers_Administrator_denyUser17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("denyUser")))
  )
  private[this] lazy val controllers_Administrator_denyUser17_invoker = createInvoker(
    
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

  // @LINE:35
  private[this] lazy val controllers_Manager_manager18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager")))
  )
  private[this] lazy val controllers_Manager_manager18_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manager(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:36
  private[this] lazy val controllers_Manager_createcanteen19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createcanteen")))
  )
  private[this] lazy val controllers_Manager_createcanteen19_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.createcanteen(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:37
  private[this] lazy val controllers_Manager_managemenus20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managemenus")))
  )
  private[this] lazy val controllers_Manager_managemenus20_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.managemenus(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:38
  private[this] lazy val controllers_Manager_managetickets21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managetickets")))
  )
  private[this] lazy val controllers_Manager_managetickets21_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.managetickets(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:39
  private[this] lazy val controllers_Manager_managetickets22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managecanteens")))
  )
  private[this] lazy val controllers_Manager_managetickets22_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.managetickets(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "managetickets",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """managecanteens""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Manager_manage_thelastdrop23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_thelastdrop")))
  )
  private[this] lazy val controllers_Manager_manage_thelastdrop23_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_thelastdrop(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_thelastdrop",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_thelastdrop""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Manager_manage_arconia24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_arconia")))
  )
  private[this] lazy val controllers_Manager_manage_arconia24_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_arconia(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_arconia",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_arconia""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Manager_manage_theleakycauldron25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_theleakycauldron")))
  )
  private[this] lazy val controllers_Manager_manage_theleakycauldron25_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_theleakycauldron(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_theleakycauldron",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_theleakycauldron""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Manager_manage_waverlysubstation26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage_waverly")))
  )
  private[this] lazy val controllers_Manager_manage_waverlysubstation26_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Manager_2.manage_waverlysubstation(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "manage_waverlysubstation",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """manage_waverly""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_CanteenController_theleakycauldron27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("theleakycauldron")))
  )
  private[this] lazy val controllers_CanteenController_theleakycauldron27_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CanteenController_0.theleakycauldron(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CanteenController",
      "theleakycauldron",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """theleakycauldron""",
      """ CANTEENS""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_CanteenController_thelastdrop28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("thelastdrop")))
  )
  private[this] lazy val controllers_CanteenController_thelastdrop28_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CanteenController_0.thelastdrop(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CanteenController",
      "thelastdrop",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """thelastdrop""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_CanteenController_arconia29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("arconia")))
  )
  private[this] lazy val controllers_CanteenController_arconia29_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CanteenController_0.arconia(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CanteenController",
      "arconia",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """arconia""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_CanteenController_waverlysubstation30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("waverlysubstation")))
  )
  private[this] lazy val controllers_CanteenController_waverlysubstation30_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CanteenController_0.waverlysubstation(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CanteenController",
      "waverlysubstation",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """waverlysubstation""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Student_tickets31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tickets")))
  )
  private[this] lazy val controllers_Student_tickets31_invoker = createInvoker(
    
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

  // @LINE:53
  private[this] lazy val controllers_Student_wallet32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wallet")))
  )
  private[this] lazy val controllers_Student_wallet32_invoker = createInvoker(
    
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

  // @LINE:63
  private[this] lazy val controllers_Assets_at33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at33_invoker = createInvoker(
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
    case controllers_HomeController_login2_route(params@_) =>
      call { 
        controllers_HomeController_login2_invoker.call(
          req => HomeController_5.login(req))
      }
  
    // @LINE:11
    case controllers_HomeController_login3_route(params@_) =>
      call { 
        controllers_HomeController_login3_invoker.call(
          req => HomeController_5.login(req))
      }
  
    // @LINE:14
    case controllers_HomeController_profile4_route(params@_) =>
      call { 
        controllers_HomeController_profile4_invoker.call(
          req => HomeController_5.profile(req))
      }
  
    // @LINE:15
    case controllers_HomeController_recoverpassword5_route(params@_) =>
      call { 
        controllers_HomeController_recoverpassword5_invoker.call(
          req => HomeController_5.recoverpassword(req))
      }
  
    // @LINE:16
    case controllers_HomeController_signup6_route(params@_) =>
      call { 
        controllers_HomeController_signup6_invoker.call(
          req => HomeController_5.signup(req))
      }
  
    // @LINE:17
    case controllers_HomeController_signup7_route(params@_) =>
      call { 
        controllers_HomeController_signup7_invoker.call(
          req => HomeController_5.signup(req))
      }
  
    // @LINE:20
    case controllers_HomeController_termsofuse8_route(params@_) =>
      call { 
        controllers_HomeController_termsofuse8_invoker.call(
          req => HomeController_5.termsofuse(req))
      }
  
    // @LINE:21
    case controllers_HomeController_privacypolicy9_route(params@_) =>
      call { 
        controllers_HomeController_privacypolicy9_invoker.call(
          req => HomeController_5.privacypolicy(req))
      }
  
    // @LINE:22
    case controllers_HomeController_help10_route(params@_) =>
      call { 
        controllers_HomeController_help10_invoker.call(
          req => HomeController_5.help(req))
      }
  
    // @LINE:24
    case controllers_HomeController_calendar11_route(params@_) =>
      call { 
        controllers_HomeController_calendar11_invoker.call(
          req => HomeController_5.calendar(req))
      }
  
    // @LINE:27
    case controllers_Administrator_administrator12_route(params@_) =>
      call { 
        controllers_Administrator_administrator12_invoker.call(
          req => Administrator_1.administrator(req))
      }
  
    // @LINE:28
    case controllers_Administrator_authapproval13_route(params@_) =>
      call { 
        controllers_Administrator_authapproval13_invoker.call(
          req => Administrator_1.authapproval(req))
      }
  
    // @LINE:29
    case controllers_Administrator_userslist14_route(params@_) =>
      call { 
        controllers_Administrator_userslist14_invoker.call(
          req => Administrator_1.userslist(req))
      }
  
    // @LINE:30
    case controllers_Administrator_addUser15_route(params@_) =>
      call { 
        controllers_Administrator_addUser15_invoker.call(
          req => Administrator_1.addUser(req))
      }
  
    // @LINE:31
    case controllers_Administrator_removeUser16_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Administrator_removeUser16_invoker.call(
          req => Administrator_1.removeUser(req, id))
      }
  
    // @LINE:32
    case controllers_Administrator_denyUser17_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Administrator_denyUser17_invoker.call(
          req => Administrator_1.denyUser(req, id))
      }
  
    // @LINE:35
    case controllers_Manager_manager18_route(params@_) =>
      call { 
        controllers_Manager_manager18_invoker.call(
          req => Manager_2.manager(req))
      }
  
    // @LINE:36
    case controllers_Manager_createcanteen19_route(params@_) =>
      call { 
        controllers_Manager_createcanteen19_invoker.call(
          req => Manager_2.createcanteen(req))
      }
  
    // @LINE:37
    case controllers_Manager_managemenus20_route(params@_) =>
      call { 
        controllers_Manager_managemenus20_invoker.call(
          req => Manager_2.managemenus(req))
      }
  
    // @LINE:38
    case controllers_Manager_managetickets21_route(params@_) =>
      call { 
        controllers_Manager_managetickets21_invoker.call(
          req => Manager_2.managetickets(req))
      }
  
    // @LINE:39
    case controllers_Manager_managetickets22_route(params@_) =>
      call { 
        controllers_Manager_managetickets22_invoker.call(
          req => Manager_2.managetickets(req))
      }
  
    // @LINE:40
    case controllers_Manager_manage_thelastdrop23_route(params@_) =>
      call { 
        controllers_Manager_manage_thelastdrop23_invoker.call(
          req => Manager_2.manage_thelastdrop(req))
      }
  
    // @LINE:41
    case controllers_Manager_manage_arconia24_route(params@_) =>
      call { 
        controllers_Manager_manage_arconia24_invoker.call(
          req => Manager_2.manage_arconia(req))
      }
  
    // @LINE:42
    case controllers_Manager_manage_theleakycauldron25_route(params@_) =>
      call { 
        controllers_Manager_manage_theleakycauldron25_invoker.call(
          req => Manager_2.manage_theleakycauldron(req))
      }
  
    // @LINE:43
    case controllers_Manager_manage_waverlysubstation26_route(params@_) =>
      call { 
        controllers_Manager_manage_waverlysubstation26_invoker.call(
          req => Manager_2.manage_waverlysubstation(req))
      }
  
    // @LINE:46
    case controllers_CanteenController_theleakycauldron27_route(params@_) =>
      call { 
        controllers_CanteenController_theleakycauldron27_invoker.call(
          req => CanteenController_0.theleakycauldron(req))
      }
  
    // @LINE:47
    case controllers_CanteenController_thelastdrop28_route(params@_) =>
      call { 
        controllers_CanteenController_thelastdrop28_invoker.call(
          req => CanteenController_0.thelastdrop(req))
      }
  
    // @LINE:48
    case controllers_CanteenController_arconia29_route(params@_) =>
      call { 
        controllers_CanteenController_arconia29_invoker.call(
          req => CanteenController_0.arconia(req))
      }
  
    // @LINE:49
    case controllers_CanteenController_waverlysubstation30_route(params@_) =>
      call { 
        controllers_CanteenController_waverlysubstation30_invoker.call(
          req => CanteenController_0.waverlysubstation(req))
      }
  
    // @LINE:52
    case controllers_Student_tickets31_route(params@_) =>
      call { 
        controllers_Student_tickets31_invoker.call(
          req => Student_3.tickets(req))
      }
  
    // @LINE:53
    case controllers_Student_wallet32_route(params@_) =>
      call { 
        controllers_Student_wallet32_invoker.call(
          req => Student_3.wallet(req))
      }
  
    // @LINE:63
    case controllers_Assets_at33_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at33_invoker.call(Assets_4.at(path, file))
      }
  }
}
