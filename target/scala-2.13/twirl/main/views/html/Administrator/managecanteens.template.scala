
package views.html.Administrator

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

object managecanteens extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("../../../public/stylesheets/landing.css", "../../../public/stylesheets/home.css"))/*1.100*/{_display_(Seq[Any](format.raw/*1.101*/("""

    """),format.raw/*3.5*/("""<main class="container-menu">
        <section class="canteens mb-5 pb-5" id="canteens">
            <div class="row w-75 d-flex mx-auto mt-2">
                <div class="col-xl-3 cards pb-4">
                    <div style="background-color: #131313" class="card">
                        <img src=""""),_display_(/*8.36*/routes/*8.42*/.Assets.at("../../../public/images/h.arc.jpg")),format.raw/*8.88*/("""" class="card-img-top" alt="arc">
                        <div class="card-body">
                            <h5 class="card-title">Arconia</h5>
                            <a href="/manage_arc" class="btn btn-brown d-flex ms-auto">
                                <img src=""""),_display_(/*12.44*/routes/*12.50*/.Assets.at("../../../public/images/next2.png")),format.raw/*12.96*/("""" class="card-img-top" alt="arrow">
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-xl-3 cards pb-4">
                    <div style="background-color: #131313" class="card">
                        <img src=""""),_display_(/*19.36*/routes/*19.42*/.Assets.at("../../../public/images/h.tld.jpg")),format.raw/*19.88*/("""" class="card-img-top" alt="tld">
                        <div class="card-body">
                            <h5 class="card-title">The Last Drop</h5>
                            """),format.raw/*22.119*/("""
                            """),format.raw/*23.29*/("""<a href="/manage_tld" class="btn btn-brown d-flex ms-auto">
                                <img src=""""),_display_(/*24.44*/routes/*24.50*/.Assets.at("../../../public/images/next2.png")),format.raw/*24.96*/("""" class="card-img-top" alt="arrow">
                            </a>
                            """),format.raw/*26.39*/("""
                        """),format.raw/*27.25*/("""</div>
                    </div>
                </div>
                <div class="col-xl-3 cards pb-4">
                    <div style="background-color: #131313" class="card">
                        <img src=""""),_display_(/*32.36*/routes/*32.42*/.Assets.at("../../../public/images/h.tlc.jpg")),format.raw/*32.88*/("""" class="card-img-top" alt="tlc">
                        <div class="card-body">
                            <h5 class="card-title">The Leaky Cauldron</h5>
                            <a href="/manage_tlc" class="btn btn-brown d-flex ms-auto">
                                <img src=""""),_display_(/*36.44*/routes/*36.50*/.Assets.at("../../../public/images/next2.png")),format.raw/*36.96*/("""" class="card-img-top" alt="arrow">
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-xl-3 cards pb-4">
                    <div style="background-color: #131313" class="card">
                        <img src=""""),_display_(/*43.36*/routes/*43.42*/.Assets.at("../../../public/images/h.wss.jpg")),format.raw/*43.88*/("""" class="card-img-top" alt="wss">
                        <div class="card-body">
                            <h5 class="card-title">Waverly <br> Sub Station</h5>
                            <a href="/manage_wss" class="btn btn-brown d-flex ms-auto">
                                <img src=""""),_display_(/*47.44*/routes/*47.50*/.Assets.at("../../../public/images/next2.png")),format.raw/*47.96*/("""" class="card-img-top" alt="arrow">
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Administrator/managecanteens.scala.html
                  HASH: 98f7c3c5864ea911da2943c2b4fe24fda513646d
                  MATRIX: 1012->1|1119->99|1158->100|1192->108|1525->415|1539->421|1605->467|1913->748|1928->754|1995->800|2337->1115|2352->1121|2419->1167|2631->1440|2689->1470|2820->1574|2835->1580|2902->1626|3029->1735|3083->1761|3330->1981|3345->1987|3412->2033|3731->2325|3746->2331|3813->2377|4155->2692|4170->2698|4237->2744|4562->3042|4577->3048|4644->3094
                  LINES: 32->1|32->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|50->19|50->19|50->19|53->22|54->23|55->24|55->24|55->24|57->26|58->27|63->32|63->32|63->32|67->36|67->36|67->36|74->43|74->43|74->43|78->47|78->47|78->47
                  -- GENERATED --
              */
          