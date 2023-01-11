
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
                <th scope="col"></th>
            </tr>
        </thead>
        <tbody class="align-middle text-center">
        """),_display_(/*14.10*/if(!users.isEmpty)/*14.28*/ {_display_(Seq[Any](format.raw/*14.30*/("""
            """),_display_(/*15.14*/for(user <- users) yield /*15.32*/ {_display_(Seq[Any](format.raw/*15.34*/("""
                """),format.raw/*16.17*/("""<tr>
                    <th>"""),_display_(/*17.26*/user/*17.30*/.getId),format.raw/*17.36*/("""</th>
                    <td>"""),_display_(/*18.26*/user/*18.30*/.getUsername),format.raw/*18.42*/("""</td>
                    <td>"""),_display_(/*19.26*/user/*19.30*/.getEmail),format.raw/*19.39*/("""</td>
                    <td>"""),_display_(/*20.26*/user/*20.30*/.getStatus),format.raw/*20.40*/("""
                    """),format.raw/*24.25*/("""
                    """),format.raw/*25.21*/("""</td>
                    <td>
                        <form action=""""),_display_(/*27.40*/controllers/*27.51*/.routes.Administrator.removeUser(user.getId())),format.raw/*27.97*/("""" method="post">
                            """),_display_(/*28.30*/helper/*28.36*/.CSRF.formField(r.asScala)),format.raw/*28.62*/("""
                            """),format.raw/*29.29*/("""<div class="d-flex justify-content-center">
                                <button name="rembtn" type="submit" class="btn btn-remove px-4">Remove</button>
                            </div>
                        </form>
                    </td>
                </tr>
            """)))}),format.raw/*35.14*/("""
        """)))}),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""</tbody>
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
                  HASH: 47b7a340e64e3900f9874ff6bcb39922fd951ee0
                  MATRIX: 968->1|1125->63|1153->66|1203->108|1242->110|1274->116|1725->540|1752->558|1792->560|1834->575|1868->593|1908->595|1954->613|2012->644|2025->648|2052->654|2111->686|2124->690|2157->702|2216->734|2229->738|2259->747|2318->779|2331->783|2362->793|2412->956|2462->978|2561->1050|2581->1061|2648->1107|2722->1154|2737->1160|2784->1186|2842->1216|3163->1506|3205->1517|3242->1527
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|45->14|45->14|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->24|53->25|55->27|55->27|55->27|56->28|56->28|56->28|57->29|63->35|64->36|65->37
                  -- GENERATED --
              */
          