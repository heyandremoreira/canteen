
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

object managemenus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <title>Cantini | Manage Menus</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.at("stylesheets/landing.css")),format.raw/*11.82*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("stylesheets/home.css")),format.raw/*12.79*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.at("stylesheets/styles.css")),format.raw/*13.81*/(""""/>
    </navbar>

    <header class="header-menu">
        <nav class="navbar navbar-dark navbar-expand-lg bg-black">
            """),format.raw/*18.81*/("""
        """),format.raw/*19.9*/("""<div class="container-fluid">
            <a style="padding-left: 80px" class="navbar-brand" href="/">
                <img src=""""),_display_(/*21.28*/routes/*21.34*/.Assets.at("images/logo.png")),format.raw/*21.63*/("""" class="img-fluid" alt="logo" width="200px">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span style="color: white" class="navbar-toggler-icon"></span>
            </button>
            <div style="padding-right: 80px" class="collapse navbar-collapse align-items-center justify-content-center" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link px-3" aria-current="page" href="/home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link px-3" href="#tickets">Tickets</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link px-3" href="#wallet">Wallet</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/profile">Profile</a>
                    </li>
                    """),format.raw/*57.28*/("""
                    """),format.raw/*58.21*/("""<div class="dropdown">
                        <button class="btn dropdown-toggle" type="button" id="dropdownMenu2"
                        data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <img src=""""),_display_(/*61.40*/routes/*61.46*/.Assets.at("images/white_settings.png")),format.raw/*61.85*/("""" class="img-fluid" alt="settings" width="30px">
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
                </ul>
            </div>
        </div>
        </nav>
    </header>


    <body style="background: black">
        """),format.raw/*85.32*/("""
    """),format.raw/*86.5*/("""<main class="container-menu">
        <section class="container mb-5 pb-5" id="managemenus">
            <div class="row w-100 d-flex mx-auto justify-content-center pt-2">
                <div class="col-xl-12 cards pb-4">
                    <div style="background-color: #131313" class="card">
                        <img src=""""),_display_(/*91.36*/routes/*91.42*/.Assets.at("images/i1.jpg")),format.raw/*91.69*/("""" class="img-fluid" alt="managephoto">
                        <div class="card-body">
                            <h5 class="card-title">Northy</h5>
                            <p style="font-size: 12px" class="card-text text-white">University Of Worldy, Building 1 - Floor 2</p>
                            <button href="#" class="btn btn-brown d-flex ms-auto">Go</button>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <main class="container-menu">
        <section class="container mb-5 pb-5" id="managemenus">
            <div class="row w-100 d-flex mx-auto justify-content-end pt-2">
                <div class="col-xl-5 cards pb-4">
                    <div style="background-color: #131313" class="card">
                        <div class="text-white card-body">
                            <h4>Create Menu</h4>
                            <div class="input-group pb-3">
                                <textarea class="form-control" placeholder="Insert the title of the menu" aria-label="With textarea"></textarea>
                            </div>
                            <div class="input-group pb-3">
                                <textarea class="form-control" placeholder="Insert the description of the menu" aria-label="With textarea"></textarea>
                            </div>
                            <button href="#" class="btn btn-small ms-lg-4 px-4">Go</button>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <footer class="footer" id="footer">
        <div class="container">
            <div class="row">
                <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                    """),format.raw/*128.46*/("""
                """),format.raw/*129.17*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
                </div>
            </div>
        </div>
    </footer>

    </body>
    """),format.raw/*136.93*/("""
"""),format.raw/*137.1*/("""</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/managemenus.scala.html
                  HASH: 7413e5b39fbd7a021d39d82eea4566e58855e087
                  MATRIX: 995->0|1668->648|1683->654|1741->691|1811->734|1826->740|1881->774|1951->817|1966->823|2023->859|2187->1063|2224->1073|2383->1205|2398->1211|2448->1240|3641->3230|3691->3252|3970->3504|3985->3510|4045->3549|5328->4827|5361->4833|5724->5169|5739->5175|5787->5202|7689->7100|7736->7118|7913->7354|7943->7356
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|49->18|50->19|52->21|52->21|52->21|71->57|72->58|75->61|75->61|75->61|99->85|100->86|105->91|105->91|105->91|142->128|143->129|150->136|151->137
                  -- GENERATED --
              */
          