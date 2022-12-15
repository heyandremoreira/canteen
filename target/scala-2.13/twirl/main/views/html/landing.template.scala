
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

object landing extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <title>Cantini</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.at("stylesheets/landing.css")),format.raw/*11.82*/(""""/>
    </head>

    <body style="background: black">
        <header class="header-menu">
            <nav class="navbar navbar-expand-lg bg-black">
                """),format.raw/*17.85*/("""
            """),format.raw/*18.13*/("""<div class="container-fluid">
                <a style="padding-left: 80px" class="navbar-brand" href="/">
                    <img src=""""),_display_(/*20.32*/routes/*20.38*/.Assets.at("images/logo.png")),format.raw/*20.67*/("""" class="img-fluid" alt="logo" width="200px">
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
                            <img src=""""),_display_(/*40.40*/routes/*40.46*/.Assets.at("images/white_settings.png")),format.raw/*40.85*/("""" class="img-fluid" alt="logo" width="30px">
                        </a>
                    </ul>
                </div>
            </div>
            </nav>
        </header>


        <main>
            """),format.raw/*50.50*/("""
            """),format.raw/*51.56*/("""
        """),format.raw/*52.9*/("""<section class="home d-flex align-items-center h-100" id="home">
            <div class="container">
                <div class="row d-flex align-items-center">
                    <div class="col-xl-4">
                        <h1 class="text-white">THE BEST FOOD <br> FOR YOU!</h1>
                        <p class="text-white pb-3">We have several canteens that are <br>
                            <strong> accessible to everyone. </strong>
                            <br> Explore our canteens and check out their menus.
                        </p>
                        <div style="padding-left: 40px">
                            <button class="btn btn-sm btn-small ms-lg-4 px-4" href="#login">Login</button>
                            <button class="btn btn-sm btn-small ms-lg-4 px-4" href="#signup">SignUp</button>
                        </div>
                    </div>
                    <div class="landing-img col-xl-8 d-flex justify-content-end">
                        <img src=""""),_display_(/*67.36*/routes/*67.42*/.Assets.at("images/landing.png")),format.raw/*67.74*/("""" class="img-fluid" alt="landing">
                    </div>
                </div>
            </div>
        </section>
        </main>


        <footer class="footer" id="footer">
            <div class="container">
                """),format.raw/*84.25*/("""
                """),format.raw/*85.17*/("""<div class="row">
                    <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                        """),format.raw/*87.50*/("""
                    """),format.raw/*88.21*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
                    </div>
                </div>
            </div>
        </footer>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
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
                  SOURCE: app/views/landing.scala.html
                  HASH: 3c763cb8e2010556aa690751cf5788205aacc87b
                  MATRIX: 991->0|1647->631|1662->637|1720->674|1920->914|1962->928|2129->1068|2144->1074|2194->1103|3598->2480|3613->2486|3673->2525|3919->2780|3961->2837|3998->2847|5043->3865|5058->3871|5111->3903|5386->4649|5432->4667|5603->4835|5653->4857
                  LINES: 32->1|42->11|42->11|42->11|48->17|49->18|51->20|51->20|51->20|71->40|71->40|71->40|81->50|82->51|83->52|98->67|98->67|98->67|108->84|109->85|111->87|112->88
                  -- GENERATED --
              */
          