
package views.html.Management.Arconia

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

object manage_menus_arc extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*2.2*/template(Array("../../../public/stylesheets/landing.css", "../../../public/stylesheets/home.css"))/*2.100*/ {_display_(Seq[Any](format.raw/*2.102*/("""
    """),_display_(/*3.6*/Templates/*3.15*/.createMenuCard(r)),format.raw/*3.33*/("""
""")))}))
      }
    }
  }

  def render(r:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(r)

  def f:((play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (r) => apply(r)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Management/Arconia/manage_menus_arc.scala.html
                  HASH: 8adfd5aa8693039763f48d3c3b2ad1f17ef46a7e
                  MATRIX: 952->1|1073->27|1101->30|1208->128|1248->130|1280->137|1297->146|1335->164
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3
                  -- GENERATED --
              */
          