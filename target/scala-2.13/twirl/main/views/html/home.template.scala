
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[Canteen],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(canteens : java.util.List[Canteen]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*2.2*/template(Array("stylesheets/landing.css", "stylesheets/home.css"))/*2.68*/{_display_(Seq[Any](format.raw/*2.69*/("""

        """),format.raw/*4.9*/("""<main class="container-menu">
            <section class="canteens mb-5 pb-5" id="canteens">
                <div class="container">
                    <h2 class="text-white text-left pt-5 pb-3">Hungry? <br> Get some food!</h2>
                    <p style="color: #B87651" class="text-left">Check out our canteens near you:</p>
                </div>
                <div class="row w-75 d-flex mx-auto mt-2">
                    """),_display_(/*11.22*/for(canteen <- canteens) yield /*11.46*/{_display_(Seq[Any](format.raw/*11.47*/("""
                        """),_display_(/*12.26*/Canteens/*12.34*/.canteenCard(canteen)),format.raw/*12.55*/("""
                    """)))}),format.raw/*13.22*/("""

                    """),format.raw/*52.29*/("""
                """),format.raw/*53.17*/("""</div>
            </section>
        </main>
""")))}))
      }
    }
  }

  def render(canteens:java.util.List[Canteen]): play.twirl.api.HtmlFormat.Appendable = apply(canteens)

  def f:((java.util.List[Canteen]) => play.twirl.api.HtmlFormat.Appendable) = (canteens) => apply(canteens)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/home.scala.html
                  HASH: a1bbd9bb033faef01f7306d80a168afeb503f80b
                  MATRIX: 923->1|1054->37|1082->40|1156->106|1194->107|1232->119|1699->559|1739->583|1778->584|1832->611|1849->619|1891->640|1945->663|1997->3459|2043->3477
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|46->52|47->53
                  -- GENERATED --
              */
          