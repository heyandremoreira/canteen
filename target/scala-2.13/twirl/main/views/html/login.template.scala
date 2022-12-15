
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <title>Cantini | Login</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.at("stylesheets/landing.css")),format.raw/*11.82*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("stylesheets/styles.css")),format.raw/*12.81*/(""""/>
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
                    <a style="padding-left:20px" class="navbar-brand">
                        <img src=""""),_display_(/*40.36*/routes/*40.42*/.Assets.at("images/white_settings.png")),format.raw/*40.81*/("""" class="img-fluid" alt="logo" width="30px">
                    </a>
                </ul>
            </div>
        </div>
        </nav>
    </header>


    <body style="background: black">
        <form method="post" action="loginProcess">
            <div class="main-container">
                <div class=" text-white left-container">
                    <img src=""""),_display_(/*53.32*/routes/*53.38*/.Assets.at("images/login.png")),format.raw/*53.68*/("""" class="img-fluid" alt="login" width="500px">
                </div>
                <div class="right-container">
                    <div class="text-white card-container">
                        <h2 class="pb-3">Login</h2>
                        <div class="form-control-sm text-white textfield pb-3">
                            <input type="text" name="username" placeholder="Username">
                        </div>
                        <div class="form-control-sm text-white textfield pb-5">
                            <input type="password" name="password" placeholder="Password">
                        </div>
                        <div class="form-control-sm textfield pb-3">
                            <button class="btn-form">Login</button>
                        </div>

                        <a style="font-size: 12px" class="text-center text-muted" href="#">Forgot your password?</a>

                        <p style="font-size: 15px" class="text-center text-muted pt-4">Don't have an account?
                            <a href="/signup" class="fw-bold text-white">Sign up</a>
                        </p>
                    </div>
                </div>
            </div>
        </form>
    </body>


    <footer class="footer" id="footer">
        <div class="container">
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
                    """),format.raw/*92.46*/("""
                """),format.raw/*93.17*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
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
                  SOURCE: app/views/login.scala.html
                  HASH: bb68dc3a357ee065965464d4c392866b83b1534e
                  MATRIX: 989->0|1655->641|1670->647|1728->684|1798->727|1813->733|1870->769|2022->961|2059->971|2218->1103|2233->1109|2283->1138|3606->2434|3621->2440|3681->2479|4095->2866|4110->2872|4161->2902|6156->4894|6202->4912
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|48->17|49->18|51->20|51->20|51->20|71->40|71->40|71->40|84->53|84->53|84->53|123->92|124->93
                  -- GENERATED --
              */
          