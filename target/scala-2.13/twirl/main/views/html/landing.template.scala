
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
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("stylesheets/styles.css")),format.raw/*12.81*/(""""/>

    </head>

    <body style="background: black">
        <header class="header-menu">
            <nav class="navbar navbar-dark navbar-expand-lg bg-black">
                """),format.raw/*19.85*/("""
            """),format.raw/*20.13*/("""<div class="container-fluid">
                <a style="padding-left: 80px" class="navbar-brand" href="/">
                    <img src=""""),_display_(/*22.32*/routes/*22.38*/.Assets.at("images/logo.png")),format.raw/*22.67*/("""" class="img-fluid" alt="logo" width="200px">
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

                        """),format.raw/*59.32*/("""


                        """),format.raw/*62.25*/("""<div class="dropdown">
                            <button class="btn dropdown-toggle" type="button" id="dropdownMenu2"
                            data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img src=""""),_display_(/*65.44*/routes/*65.50*/.Assets.at("images/white_settings.png")),format.raw/*65.89*/("""" class="img-fluid" alt="settings" width="30px">
                            </button>
                            <div class="dropdown-menu dropdown-menu-lg-end text-center p-2 bg-dark" aria-labelledby="dropdownMenu2">
                                <a class="dropdown-item" href="#lang">Language</a>
                                <a class="dropdown-item" href="#colormode">Dark Mode</a>
                                <a class="dropdown-item" href="#help">Help</a>
                                <a class="dropdown-item" href="#terms">Terms of Use</a>
                                <a class="dropdown-item" href="#privacy">Privacy Policy</a>
                                <p></p>
                                <a class="btn btn-logout" href="#logout">Log out</a>
                            </div>
                        </div>
                        <script>
                            const dropdownElementList = document.querySelectorAll('.dropdown-toggle')
                            const dropdownList = [...dropdownElementList].map(dropdownToggleEl => new bootstrap.Dropdown(dropdownToggleEl))
                        </script>

                        """),format.raw/*85.36*/("""

                        """),format.raw/*106.33*/("""

                    """),format.raw/*108.21*/("""</ul>
                </div>
            </div>
            </nav>
        </header>


        <main>
            """),format.raw/*116.50*/("""
            """),format.raw/*117.56*/("""
        """),format.raw/*118.9*/("""<section class="home d-flex align-items-center h-100" id="home">
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
                            <button class="btn btn-sm btn-small ms-lg-4 px-4" href="#signup">Sign Up</button>
"""),format.raw/*130.112*/("""
                        """),format.raw/*131.25*/("""</div>
                    </div>
                    <div class="landing-img col-xl-8 d-flex justify-content-end">
                        <img src=""""),_display_(/*134.36*/routes/*134.42*/.Assets.at("images/landing.png")),format.raw/*134.74*/("""" class="img-fluid" alt="landing">
                    </div>
                </div>
            </div>
        </section>
        </main>


        <footer class="footer" id="footer">
            <div class="container">
                """),format.raw/*151.25*/("""
            """),format.raw/*152.13*/("""<div class="row">
                <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                    """),format.raw/*154.46*/("""
                """),format.raw/*155.17*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
                </div>
            </div>
            </div>
        </footer>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
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
                  HASH: 534a95d5f78c2e648ccc2c0684b0b2eb2dea2b63
                  MATRIX: 991->0|1647->631|1662->637|1720->674|1790->717|1805->723|1862->759|2076->1013|2118->1027|2285->1167|2300->1173|2350->1202|3621->3361|3679->3391|3970->3655|3985->3661|4045->3700|5266->5227|5323->6414|5376->6438|5527->6597|5570->6654|5608->6664|6479->7616|6534->7642|6716->7796|6732->7802|6786->7834|7062->8532|7105->8546|7269->8706|7316->8724
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|50->19|51->20|53->22|53->22|53->22|73->59|76->62|79->65|79->65|79->65|96->85|98->106|100->108|108->116|109->117|110->118|122->130|123->131|126->134|126->134|126->134|136->151|137->152|139->154|140->155
                  -- GENERATED --
              */
          