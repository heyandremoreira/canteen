
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

object userslist extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: java.util.List[models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*2.2*/template(Array("stylesheets/landing.css"))/*2.44*/ {_display_(Seq[Any](format.raw/*2.46*/("""
    """),format.raw/*3.5*/("""<table class="table table-responsive table-hover darkbg">
        <thead class="text-center">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Username</th>
                <th scope="col">Role</th>
                <th scope="col">Status</th>
            </tr>
        </thead>
        <tbody class="align-middle text-center">
        """),_display_(/*13.10*/if(!users.isEmpty)/*13.28*/ {_display_(Seq[Any](format.raw/*13.30*/("""
            """),_display_(/*14.14*/for(user <- users) yield /*14.32*/ {_display_(Seq[Any](format.raw/*14.34*/("""
                """),format.raw/*15.17*/("""<tr>
                    <th>"""),_display_(/*16.26*/user/*16.30*/.getId),format.raw/*16.36*/("""</th>
                    <td>"""),_display_(/*17.26*/user/*17.30*/.getUsername),format.raw/*17.42*/("""</td>
                    <td>
                    """),_display_(/*19.22*/if(!user.getRoles.isEmpty)/*19.48*/ {_display_(Seq[Any](format.raw/*19.50*/("""
                        """),_display_(/*20.26*/for(roles <- user.getRoles) yield /*20.53*/ {_display_(Seq[Any](format.raw/*20.55*/("""
                        """)))}),format.raw/*21.26*/("""
                    """)))}),format.raw/*22.22*/("""
                    """),format.raw/*23.21*/("""</td>
                    <td>
                        <a type="submit" class="btn btn-remove px-4">Remove</a>
                        <form action=""""),_display_(/*26.40*/controllers/*26.51*/.routes.Administrator.removeUser(user.getId())),format.raw/*26.97*/("""" method="post">
                            <div class="d-flex justify-content-center flex-grow-1 mt-3">
                                <button name="userId" type="submit" class="btn btn-sm btn-dark">Deny</button>
                            </div>
                        </form>
                    </td>
                </tr>
            """)))}),format.raw/*33.14*/("""
        """)))}),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(users:java.util.List[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((java.util.List[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Administrator/userslist.scala.html
                  HASH: 1269150efb4d269f1df5c4585b6af5386a570b3f
                  MATRIX: 946->1|1077->37|1105->40|1155->82|1194->84|1226->90|1639->476|1666->494|1706->496|1748->511|1782->529|1822->531|1868->549|1926->580|1939->584|1966->590|2025->622|2038->626|2071->638|2152->692|2187->718|2227->720|2281->747|2324->774|2364->776|2422->803|2476->826|2526->848|2706->1001|2726->1012|2793->1058|3175->1409|3217->1420|3254->1430
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|51->20|51->20|51->20|52->21|53->22|54->23|57->26|57->26|57->26|64->33|65->34|66->35
                  -- GENERATED --
              */
          