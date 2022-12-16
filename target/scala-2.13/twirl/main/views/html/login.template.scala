
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
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cantini | Login</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.at("stylesheets/landing.css")),format.raw/*11.82*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("stylesheets/styles.css")),format.raw/*12.81*/(""""/>
    </head>

    <header class="header-menu">
        <nav class="navbar navbar-dark navbar-expand-lg bg-black">
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
                        <a class="nav-link px-3" aria-current="page" href="#home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link px-3" href="#tickets">Tickets</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link px-3" href="#wallet">Wallet</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#profile">Profile</a>
                    </li>
                    <div class="dropdown">
                        <button class="btn dropdown-toggle" type="button" id="dropdownMenu2"
                        data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <img src=""""),_display_(/*42.40*/routes/*42.46*/.Assets.at("images/white_settings.png")),format.raw/*42.85*/("""" class="img-fluid" alt="settings" width="30px">
                        </button>
                        <div class="dropdown-menu dropdown-menu-lg-end bg-dark" aria-labelledby="dropdownMenu2">
                            <a class="dropdown-item" href="#">Language</a>
                            <a class="dropdown-item" href="#">Dark Mode</a>
                            <a class="dropdown-item" href="#">Help</a>
                            <a class="dropdown-item" href="#">Terms of Use</a>
                            <a class="dropdown-item" href="#">Privacy Policy</a>
                        </div>
                    </div>
                    <script>
                            const dropdownElementList = document.querySelectorAll('.dropdown-toggle')
                            const dropdownList = [...dropdownElementList].map(dropdownToggleEl => new bootstrap.Dropdown(dropdownToggleEl))
                    </script>
                </ul>
            </div>
        </div>
        </nav>
    </header>


    <body style="background: black">
        <form method="post" action="signupProcess">
            <div class="row principal-container">
                <div class="col-7 d-none d-md-block text-center">
                    <img src=""""),_display_(/*67.32*/routes/*67.38*/.Assets.at("images/login2.png")),format.raw/*67.69*/("""" class="img-fluid" alt="login" width="500px">
                </div>
                <div class="col-sm-12 col-md-4 justify-content-center">
                    <div class="card-container text-white justify-content-start">
                        <h2 class="pb-3">Login</h2>
                        <div class="form-control-sm textfield pb-3">
                            <input type="text" name="username" placeholder="Username">
                        </div>
                        <div class="form-control-sm textfield pb-5">
                            <input type="password" name="password" placeholder="Password">
                        </div>
                        <div class="form-control-sm textfield pb-3">
                            <button class="btn-form">Sign In</button>
                        </div>

                        <a style="font-size: 12px" class="text-center text-muted pb-5" href="#">Forgot your password?</a>

                        <p style="font-size: 15px" class="text-center text-muted mt-0 mb-0">Don't have an account?
                            <a href="/login" class="fw-bold text-white">Sign up</a> </p>
                    </div>
                </div>
            </div>
        </form>
    </body>


    <footer class="footer" id="footer">
        <div class="container">
            <div class="row">
                <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                    """),format.raw/*97.46*/("""
                """),format.raw/*98.17*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
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
                  HASH: 0783130673f69007a854c0b1ab33c51e53a38d82
                  MATRIX: 989->0|1653->639|1668->645|1726->682|1796->725|1811->731|1868->767|2030->969|2067->979|2226->1111|2241->1117|2291->1146|3735->2563|3750->2569|3810->2608|5122->3893|5137->3899|5189->3930|6715->5453|6761->5471
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|48->17|49->18|51->20|51->20|51->20|73->42|73->42|73->42|98->67|98->67|98->67|128->97|129->98
                  -- GENERATED --
              */
          