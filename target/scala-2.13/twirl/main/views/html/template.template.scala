
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

object template extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Array[String],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cssurls: Array[String])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import java.time.LocalDate


Seq[Any](format.raw/*1.41*/("""
"""),_display_(/*3.2*/defining(LocalDate.now.getYear)/*3.33*/{ year =>_display_(Seq[Any](format.raw/*3.42*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cantini</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        """),_display_(/*15.10*/for(s <- cssurls) yield /*15.27*/{_display_(Seq[Any](format.raw/*15.28*/("""
            """),format.raw/*16.13*/("""<link rel="stylesheet" href=""""),_display_(/*16.43*/routes/*16.49*/.Assets.at(s)),format.raw/*16.62*/("""">
        """)))}),format.raw/*17.10*/("""
        """),format.raw/*18.9*/("""<link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.at("stylesheets/landing.css")),format.raw/*18.82*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*19.39*/routes/*19.45*/.Assets.at("stylesheets/styles.css")),format.raw/*19.81*/(""""/>
    </head>

    <body style="background-color: black">
        <header class="header-menu">
            <nav class="navbar navbar-dark navbar-expand-lg bg-black">
                """),format.raw/*25.85*/("""
                """),format.raw/*26.17*/("""<div class="container-fluid">
                    <a style="padding-left: 80px" class="navbar-brand" href="/">
                        <img src=""""),_display_(/*28.36*/routes/*28.42*/.Assets.at("images/logo.png")),format.raw/*28.71*/("""" class="img-fluid" alt="logo" width="200px">
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
                                <a class="nav-link px-3" href=/profile>Profile</a>
                            </li>

                            """),format.raw/*67.31*/("""

                            """),format.raw/*72.36*/("""


                            """),format.raw/*75.29*/("""<div class="dropdown">
                                <button class="btn dropdown-toggle" type="button" id="dropdownMenu2"
                                data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <img src=""""),_display_(/*78.48*/routes/*78.54*/.Assets.at("images/white_settings.png")),format.raw/*78.93*/("""" class="img-fluid" alt="settings" width="30px">
                                </button>
                                <div class="dropdown-menu dropdown-menu-lg-end text-center p-2 bg-dark" aria-labelledby="dropdownMenu2">
                                    <a class="dropdown-item" href="#lang">Language</a>
                                    <a class="dropdown-item" href="#colormode">Dark Mode</a>
                                    <a class="dropdown-item" href="#help">Help</a>
                                    <a class="dropdown-item" href="/termsofuse">Terms of Use</a>
                                    <a class="dropdown-item" href="/privacypolicy">Privacy Policy</a>
                                    <p></p>
                                    <a class="btn btn-logout" href="#logout">Log out</a>
                                </div>
                            </div>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>

        """),_display_(/*96.10*/content),format.raw/*96.17*/("""

    """),format.raw/*98.5*/("""<footer class="footer" id="footer">
        <div class="container">
            <div class="row">
                <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                    <p>Copyright """),_display_(/*102.35*/year),format.raw/*102.39*/(""". cantini. All rights reserved.</p>
                </div>
            </div>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
    </body>
</html>
""")))}))
      }
    }
  }

  def render(cssurls:Array[String],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(cssurls)(content)

  def f:((Array[String]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (cssurls) => (content) => apply(cssurls)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/template.scala.html
                  HASH: 563937c9948a3d7aa798a5d0e9aa3dddb4e4d44c
                  MATRIX: 922->1|1034->43|1090->40|1118->72|1157->103|1203->112|1233->116|1860->718|1893->735|1932->736|1974->750|2031->780|2046->786|2080->799|2124->812|2161->822|2218->852|2233->858|2291->895|2361->938|2376->944|2433->980|2651->1238|2697->1256|2872->1404|2887->1410|2937->1439|4287->3773|4347->4109|4409->4143|4712->4419|4727->4425|4787->4464|5856->5506|5884->5513|5919->5521|6178->5752|6204->5756
                  LINES: 27->1|30->2|33->1|34->3|34->3|34->3|36->5|46->15|46->15|46->15|47->16|47->16|47->16|47->16|48->17|49->18|49->18|49->18|49->18|50->19|50->19|50->19|56->25|57->26|59->28|59->28|59->28|79->67|81->72|84->75|87->78|87->78|87->78|105->96|105->96|107->98|111->102|111->102
                  -- GENERATED --
              */
          