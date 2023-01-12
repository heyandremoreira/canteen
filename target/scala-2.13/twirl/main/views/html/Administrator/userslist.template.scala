
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

object userslist extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[java.util.List[models.User],play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: java.util.List[models.User], r: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""
"""),_display_(/*2.2*/template(Array("stylesheets/landing.css"))/*2.44*/ {_display_(Seq[Any](format.raw/*2.46*/("""
    """),format.raw/*3.5*/("""<table class="table table-responsive table-hover darkbg">
        <thead class="text-center">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Username</th>
                <th scope="col">Email</th>
                <th scope="col">Role</th>
                <th scope="col">Status</th>
                <th scope="col"></th>
            </tr>
        </thead>
        <tbody class="align-middle text-center">
        """),_display_(/*15.10*/if(!users.isEmpty)/*15.28*/ {_display_(Seq[Any](format.raw/*15.30*/("""
            """),_display_(/*16.14*/for(user <- users) yield /*16.32*/ {_display_(Seq[Any](format.raw/*16.34*/("""
                """),format.raw/*17.17*/("""<tr>
                    <th>"""),_display_(/*18.26*/user/*18.30*/.getId),format.raw/*18.36*/("""</th>
                    <td>"""),_display_(/*19.26*/user/*19.30*/.getUsername),format.raw/*19.42*/("""</td>
                    <td>"""),_display_(/*20.26*/user/*20.30*/.getEmail),format.raw/*20.39*/("""</td>
                    <td>
                        """),format.raw/*25.29*/("""
                    """),format.raw/*26.21*/("""</td>
                    <td>"""),_display_(/*27.26*/user/*27.30*/.getStatus),format.raw/*27.40*/("""</td>
                    <td>
                        <form action=""""),_display_(/*29.40*/controllers/*29.51*/.routes.Administrator.removeUser(user.getId())),format.raw/*29.97*/("""" method="post">
                            """),_display_(/*30.30*/helper/*30.36*/.CSRF.formField(r.asScala)),format.raw/*30.62*/("""
                        """),format.raw/*31.25*/("""<div class="d-flex justify-content-center">
                            <button name="rembtn" type="submit" class="btn btn-remove px-4">Remove</button>
                        </div>
                        </form>
                    </td>
                </tr>
            """)))}),format.raw/*37.14*/("""
        """)))}),format.raw/*38.10*/("""
        """),format.raw/*39.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(users:java.util.List[models.User],r:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(users,r)

  def f:((java.util.List[models.User],play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (users,r) => apply(users,r)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Administrator/userslist.scala.html
                  HASH: 621afadf1b3caf1285537b474053af799c3b2a16
                  MATRIX: 968->1|1125->63|1153->66|1203->108|1242->110|1274->116|1770->585|1797->603|1837->605|1879->620|1913->638|1953->640|1999->658|2057->689|2070->693|2097->699|2156->731|2169->735|2202->747|2261->779|2274->783|2304->792|2389->994|2439->1016|2498->1048|2511->1052|2542->1062|2641->1134|2661->1145|2728->1191|2802->1238|2817->1244|2864->1270|2918->1296|3231->1578|3273->1589|3310->1599
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|46->15|46->15|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->25|54->26|55->27|55->27|55->27|57->29|57->29|57->29|58->30|58->30|58->30|59->31|65->37|66->38|67->39
                  -- GENERATED --
              */
          