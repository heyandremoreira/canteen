
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
        """),format.raw/*18.9*/("""<link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.at("stylesheets/styles.css")),format.raw/*18.81*/(""""/>
    </head>

    <body style="background-color: black">
        <header class="header-menu">
            <nav class="navbar navbar-dark navbar-expand-lg bg-black">
                """),format.raw/*24.85*/("""
                """),format.raw/*25.17*/("""<div class="container-fluid">
                    <a style="padding-left: 80px" class="navbar-brand" href="/">
                        <img src=""""),_display_(/*27.36*/routes/*27.42*/.Assets.at("images/logo.png")),format.raw/*27.71*/("""" class="img-fluid" alt="logo" width="200px">
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

                            """),format.raw/*64.36*/("""
                            """),format.raw/*68.36*/("""


                            """),format.raw/*71.29*/("""<div class="dropdown">
                                <button class="btn dropdown-toggle" type="button" id="dropdownMenu2"
                                data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <img src=""""),_display_(/*74.48*/routes/*74.54*/.Assets.at("images/white_settings.png")),format.raw/*74.93*/("""" class="img-fluid" alt="settings" width="30px">
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
                        </ul>
                    </div>
                </div>
            </nav>
        </header>

        """),_display_(/*92.10*/content),format.raw/*92.17*/("""

    """),format.raw/*94.5*/("""<footer class="footer" id="footer">
        <div class="container">
            <div class="row">
                <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                    <p>Copyright """),_display_(/*98.35*/year),format.raw/*98.39*/(""". cantini. All rights reserved.</p>
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
                  HASH: 76326e59ec30dc268168ac2a99b82a291db79ed5
                  MATRIX: 922->1|1034->43|1090->40|1118->72|1157->103|1203->112|1233->116|1860->718|1893->735|1932->736|1974->750|2031->780|2046->786|2080->799|2124->812|2161->822|2218->852|2233->858|2290->894|2508->1152|2554->1170|2729->1318|2744->1324|2794->1353|4141->3628|4199->3962|4261->3996|4564->4272|4579->4278|4639->4317|5697->5348|5725->5355|5760->5363|6018->5594|6043->5598
                  LINES: 27->1|30->2|33->1|34->3|34->3|34->3|36->5|46->15|46->15|46->15|47->16|47->16|47->16|47->16|48->17|49->18|49->18|49->18|49->18|55->24|56->25|58->27|58->27|58->27|78->64|79->68|82->71|85->74|85->74|85->74|103->92|103->92|105->94|109->98|109->98
                  -- GENERATED --
              */
          