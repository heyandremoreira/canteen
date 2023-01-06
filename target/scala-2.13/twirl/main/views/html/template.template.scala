
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
/*2.6*/import java.time.LocalDate


Seq[Any](format.raw/*1.41*/("""
    """),format.raw/*3.1*/("""    """),_display_(/*3.6*/defining(LocalDate.now.getYear)/*3.37*/ { year =>_display_(Seq[Any](format.raw/*3.47*/("""

    """),format.raw/*5.5*/("""<!DOCTYPE html>
        <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1">
                <title>Cantini</title>

                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
                """),_display_(/*15.18*/for(s <- cssurls) yield /*15.35*/ {_display_(Seq[Any](format.raw/*15.37*/("""
                    """),format.raw/*16.21*/("""<link rel="stylesheet" href=""""),_display_(/*16.51*/routes/*16.57*/.Assets.at(s)),format.raw/*16.70*/("""">
                    """),format.raw/*17.69*/("""
                """)))}),format.raw/*18.18*/("""
                """),format.raw/*19.17*/("""<link rel="stylesheet" href=""""),_display_(/*19.47*/routes/*19.53*/.Assets.at("stylesheets/landing.css")),format.raw/*19.90*/(""""/>
                <link rel="stylesheet" href=""""),_display_(/*20.47*/routes/*20.53*/.Assets.at("stylesheets/styles.css")),format.raw/*20.89*/(""""/>
            </head>

            <body style="background-color: black">
                <header class="header-menu">
                    <nav class="navbar navbar-dark navbar-expand-lg bg-black">
                        """),format.raw/*26.93*/("""
                        """),format.raw/*27.25*/("""<div class="container-fluid">
                            <a style="margin-left: 80px" class="navbar-brand" href="/">
                                <img src=""""),_display_(/*29.44*/routes/*29.50*/.Assets.at("images/logo.png")),format.raw/*29.79*/("""" class="img-fluid" alt="logo" width="200px">
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
                                        <a class="nav-link px-3" href=/profile>Profile</a>
                                    </li>

                                    """),format.raw/*74.40*/("""

                                    """),format.raw/*79.44*/("""


                                    """),format.raw/*82.37*/("""<div class="dropdown">
                                        <button class="btn dropdown-toggle" type="button" id="dropdownMenu2"
                                        data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <img src=""""),_display_(/*85.56*/routes/*85.62*/.Assets.at("images/white_settings.png")),format.raw/*85.101*/("""" class="img-fluid" alt="settings" width="30px">
                                        </button>
                                        <div class="dropdown-menu dropdown-menu-lg-end text-center p-2 bg-dark" aria-labelledby="dropdownMenu2">
                                            <a class="dropdown-item" href="#lang">Language</a>
                                            <a class="dropdown-item" href="#colormode">Dark Mode</a>
                                            <a class="dropdown-item" href="/help">Help</a>
                                            <a class="dropdown-item" href="/termsofuse">Terms of Use</a>
                                            <a class="dropdown-item" href="/privacypolicy">Privacy Policy</a>
                                            <p></p>
                                           """),format.raw/*96.48*/("""
                                        """),format.raw/*97.41*/("""</div>
                                    </div>
                                </ul>
                            </div>
                        </div>
                    </nav>
                </header>

                """),_display_(/*105.18*/content),format.raw/*105.25*/("""

                """),format.raw/*107.17*/("""<footer class="footer" id="footer">
                    <div class="container">
                        <div class="row">
                            <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                                <p>Copyright """),_display_(/*111.47*/year),format.raw/*111.51*/(""". cantini. All rights reserved.</p>
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
                  HASH: 584be330f6a27efa832519e79ce0e53aa634eb6d
                  MATRIX: 922->1|1034->47|1090->40|1122->75|1152->80|1191->111|1238->121|1272->129|1971->803|2004->820|2044->822|2094->844|2151->874|2166->880|2200->893|2252->965|2302->984|2348->1002|2405->1032|2420->1038|2478->1075|2556->1126|2571->1132|2628->1168|2886->1466|2940->1492|3130->1655|3145->1661|3195->1690|4307->4757|4375->5117|4445->5159|4772->5459|4787->5465|4848->5504|5726->6530|5796->6572|6057->6805|6086->6812|6135->6832|6442->7111|6468->7115
                  LINES: 27->1|30->2|33->1|34->3|34->3|34->3|34->3|36->5|46->15|46->15|46->15|47->16|47->16|47->16|47->16|48->17|49->18|50->19|50->19|50->19|50->19|51->20|51->20|51->20|57->26|58->27|60->29|60->29|60->29|74->74|76->79|79->82|82->85|82->85|82->85|91->96|92->97|100->105|100->105|102->107|106->111|106->111
                  -- GENERATED --
              */
          