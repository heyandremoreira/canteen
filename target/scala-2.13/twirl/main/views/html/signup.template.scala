
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <navbar>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cantini | SignUp</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.at("stylesheets/landing.css")),format.raw/*11.82*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("stylesheets/login_signup.css")),format.raw/*12.87*/(""""/>
    </navbar>

    <header class="header-menu">
        <nav class="navbar navbar-expand-lg bg-black">
            """),format.raw/*17.81*/("""
        """),format.raw/*18.9*/("""<div class="container-fluid">
            <a style="padding-left: 80px" class="navbar-brand" href="/">
                <img src=""""),_display_(/*20.28*/routes/*20.34*/.Assets.at("images/logo.png")),format.raw/*20.63*/("""" class="img-fluid" alt="logo" width="200px">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span style="color: white" class="navbar-toggler-icon"></span>
            </button>
            <div style="padding-right: 80px" class="collapse navbar-collapse align-items-center justify-content-center" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link text-white px-3" aria-current="page" href="#home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-white px-3" href="#tickets">Tickets</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-white px-3" href="#wallet">Wallet</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-white" href="#profile">Profile</a>
                    </li>
                    <a style="padding-left: 20px" class="navbar-brand">
                        <img src=""""),_display_(/*40.36*/routes/*40.42*/.Assets.at("images/white_settings.png")),format.raw/*40.81*/("""" class="img-fluid" alt="logo" width="30px">
                    </a>
                </ul>
            </div>
        </div>
        </nav>
    </header>


    <body style="background: black">
        <form method="post" action="signupProcess">
            <div class="main-login">
                <div class=" text-white left-login">
                    <img src=""""),_display_(/*53.32*/routes/*53.38*/.Assets.at("images/signup.png")),format.raw/*53.69*/("""" class="img-fluid" alt="login" width="500px">
                </div>
                <div class="right-login">
                    <div class="text-white card-login">
                        <h2 class="pb-3">SignUp</h2>
                        <div class="form-control-sm text-white textfield pb-3">
                            <input type="text" name="username" placeholder="Username">
                        </div>
                        <div class="form-control-sm text-white textfield pb-3">
                            <input type="email" name="email" placeholder="E-mail">
                        </div>
                        <div class="form-control-sm text-white textfield pb-5">
                            <input type="password" name="password" placeholder="Password">
                        </div>
                        <div class="form-control-sm textfield pb-4">
                            <button class="btn-login">Register</button>
                        </div>

                        <p style="font-size: 12px" class="text-center text-muted pb-4">By signing up, you agree to our
                            <a class="text-white" style="text-decoration: none;
                                font-size: 12px" href="#termsofuse">Terms Of Use</a>
                            <br> and
                            <a class="text-white" style="text-decoration: none;
                                font-size: 12px" href="#privacypolicy">Privacy Policy</a>
                        </p>

                        <p style="font-size: 15px" class="text-center text-muted mt-0 mb-0">Already have an account?
                            <a href="/login" class="fw-bold text-white">Login</a> </p>
                    </div>
                </div>
            </div>
        </form>
    </body>


    <footer class="footer" id="footer">
        <div class="container pb-2">
            <div class="row">
                <div class="text-white col-xl-4 d-flex mx-auto justify-content-center">
                    <a style="text-decoration: none;
                        font-size: 12px" class="text-white px-4" href="#termsofuse">Terms Of Use</a>
                    <a style="text-decoration: none;
                        font-size: 12px" class="text-white px-4" href="#privacypolicy">Privacy Policy</a>
                </div>
            </div>
            <div class="row">
                <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                    """),format.raw/*100.46*/("""
                """),format.raw/*101.17*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
                </div>
            </div>
        </div>
    </footer>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/signup.scala.html
                  HASH: c2a7d0fc0ca62225a572bd786b28a70fa238ffd4
                  MATRIX: 990->0|1657->642|1672->648|1730->685|1800->728|1815->734|1878->776|2030->968|2067->978|2226->1110|2241->1116|2291->1145|3615->2442|3630->2448|3690->2487|4097->2867|4112->2873|4164->2904|6747->5483|6794->5501
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|48->17|49->18|51->20|51->20|51->20|71->40|71->40|71->40|84->53|84->53|84->53|131->100|132->101
                  -- GENERATED --
              */
          