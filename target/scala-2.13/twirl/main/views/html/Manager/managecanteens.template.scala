
package views.html.Manager

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


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css", "stylesheets/home.css"))/*1.68*/{_display_(Seq[Any](format.raw/*1.69*/("""

    """),format.raw/*3.5*/("""<main class="container-menu">
        <section class="canteens mb-5 pb-5" id="canteens">
            <div class="row w-75 d-flex mx-auto mt-2">
                <div class="col-xl-3 cards pb-4">
                    <div style="background-color: #131313" class="card">
                        <img src=""""),_display_(/*8.36*/routes/*8.42*/.Assets.at("images/h.arc.jpg")),format.raw/*8.72*/("""" class="card-img-top" alt="arc">
                        <div class="card-body">
                            <h5 class="card-title">Arconia</h5>
                            <a href="/manage_arconia" class="btn btn-brown d-flex ms-auto">
                                <img src=""""),_display_(/*12.44*/routes/*12.50*/.Assets.at("images/next2.png")),format.raw/*12.80*/("""" class="card-img-top" alt="arrow">
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-xl-3 cards pb-4">
                    <div style="background-color: #131313" class="card">
                        <img src=""""),_display_(/*19.36*/routes/*19.42*/.Assets.at("images/h.tld.jpg")),format.raw/*19.72*/("""" class="card-img-top" alt="tld">
                        <div class="card-body">
                            <h5 class="card-title">The Last Drop</h5>
                            """),format.raw/*22.119*/("""
                            """),format.raw/*23.29*/("""<a href="/manage_thelastdrop" class="btn btn-brown d-flex ms-auto">
                                <img src=""""),_display_(/*24.44*/routes/*24.50*/.Assets.at("images/next2.png")),format.raw/*24.80*/("""" class="card-img-top" alt="arrow">
                            </a>
                            """),format.raw/*26.39*/("""
                        """),format.raw/*27.25*/("""</div>
                    </div>
                </div>
                <div class="col-xl-3 cards pb-4">
                    <div style="background-color: #131313" class="card">
                        <img src=""""),_display_(/*32.36*/routes/*32.42*/.Assets.at("images/h.tlc.jpg")),format.raw/*32.72*/("""" class="card-img-top" alt="tlc">
                        <div class="card-body">
                            <h5 class="card-title">The Leaky Cauldron</h5>
                            <a href="/manage_theleakycauldron" class="btn btn-brown d-flex ms-auto">
                                <img src=""""),_display_(/*36.44*/routes/*36.50*/.Assets.at("images/next2.png")),format.raw/*36.80*/("""" class="card-img-top" alt="arrow">
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-xl-3 cards pb-4">
                    <div style="background-color: #131313" class="card">
                        <img src=""""),_display_(/*43.36*/routes/*43.42*/.Assets.at("images/h.wss.jpg")),format.raw/*43.72*/("""" class="card-img-top" alt="wss">
                        <div class="card-body">
                            <h5 class="card-title">Waverly <br> Sub Station</h5>
                            <a href="/manage_waverlysubstation" class="btn btn-brown d-flex ms-auto">
                                <img src=""""),_display_(/*47.44*/routes/*47.50*/.Assets.at("images/next2.png")),format.raw/*47.80*/("""" class="card-img-top" alt="arrow">
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
                  SOURCE: app/views/Manager/managecanteens.scala.html
                  HASH: 1b605da6d359ff9eb60685267067d04aa9450154
                  MATRIX: 1006->1|1080->67|1118->68|1152->76|1485->383|1499->389|1549->419|1861->704|1876->710|1927->740|2269->1055|2284->1061|2335->1091|2547->1364|2605->1394|2744->1506|2759->1512|2810->1542|2937->1651|2991->1677|3238->1897|3253->1903|3304->1933|3636->2238|3651->2244|3702->2274|4044->2589|4059->2595|4110->2625|4449->2937|4464->2943|4515->2973
                  LINES: 32->1|32->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|50->19|50->19|50->19|53->22|54->23|55->24|55->24|55->24|57->26|58->27|63->32|63->32|63->32|67->36|67->36|67->36|74->43|74->43|74->43|78->47|78->47|78->47
                  -- GENERATED --
              */
          