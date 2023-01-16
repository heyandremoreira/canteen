
package views.html.Canteens

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

object menuCard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Canteen,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(canteen : Canteen):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.1*/("""<div class="col-md-5 my-auto cards">
    <div class="row">
        <div style="background-color: white" class="card">
            <div class="card-body">
                <div class="row d-flex align-items-center">
                    <div class="col-md-3 ms-4">
                        <h1 class="txtred">"""),format.raw/*8.66*/("""</h1>
                    </div>
                    <div class="col-md-8">
                        <h4 class="txtblack" style="margin: 10px 0px 20px 0px">"""),format.raw/*11.106*/(""" """),format.raw/*11.107*/("""</h4>
                        """),format.raw/*12.100*/("""
                    """),format.raw/*13.21*/("""</div>
                </div>
            </div>
        </div>
    </div>
</div>"""))
      }
    }
  }

  def render(canteen:Canteen): play.twirl.api.HtmlFormat.Appendable = apply(canteen)

  def f:((Canteen) => play.twirl.api.HtmlFormat.Appendable) = (canteen) => apply(canteen)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Canteens/menuCard.scala.html
                  HASH: 704f61d7cd02c4600c4d9a32363a837153628692
                  MATRIX: 920->1|1034->20|1062->22|1400->355|1587->539|1617->540|1677->646|1727->668
                  LINES: 27->1|32->1|33->2|39->8|42->11|42->11|43->12|44->13
                  -- GENERATED --
              */
          