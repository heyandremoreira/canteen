
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

object authapproval extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[java.util.List[models.User],play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

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
                    <td>
                        """),format.raw/*24.29*/("""
                    """),format.raw/*25.21*/("""</td>
                    <td>"""),_display_(/*26.26*/user/*26.30*/.getStatus),format.raw/*26.40*/("""</td>
                    <td>
                        <form action=""""),_display_(/*28.40*/controllers/*28.51*/.routes.Administrator.addUser()),format.raw/*28.82*/("""" method="post">
                            """),_display_(/*29.30*/helper/*29.36*/.CSRF.formField(r.asScala)),format.raw/*29.62*/("""
                        """),format.raw/*30.25*/("""<div class="d-flex justify-content-center">
                            <button name="appbtn" type="submit" class="btn btn-approve">Approve</button>
                        </div>
                        </form>
                        <form action=""""),_display_(/*34.40*/controllers/*34.51*/.routes.Administrator.denyUser(user.getId())),format.raw/*34.95*/("""" method="post">
                            """),_display_(/*35.30*/helper/*35.36*/.CSRF.formField(r.asScala)),format.raw/*35.62*/("""
                        """),format.raw/*36.25*/("""<div class="d-flex justify-content-center">
                            <button name="rembtn" type="submit" class="btn btn-remove">Deny</button>
                        </div>
                        </form>
                    </td>
                </tr>
            """)))}),format.raw/*42.14*/("""
        """)))}),format.raw/*43.10*/("""
        """),format.raw/*44.9*/("""</tbody>
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
                  SOURCE: app/views/Administrator/authapproval.scala.html
                  HASH: 0c426d887cb740d1404bf322f1abd717a3edc3e8
                  MATRIX: 971->1|1128->63|1156->66|1206->108|1245->110|1277->116|1728->540|1755->558|1795->560|1837->575|1871->593|1911->595|1957->613|2015->644|2028->648|2055->654|2114->686|2127->690|2160->702|2219->734|2232->738|2262->747|2347->949|2397->971|2456->1003|2469->1007|2500->1017|2599->1089|2619->1100|2671->1131|2745->1178|2760->1184|2807->1210|2861->1236|3143->1491|3163->1502|3228->1546|3302->1593|3317->1599|3364->1625|3418->1651|3724->1926|3766->1937|3803->1947
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|45->14|45->14|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|52->24|53->25|54->26|54->26|54->26|56->28|56->28|56->28|57->29|57->29|57->29|58->30|62->34|62->34|62->34|63->35|63->35|63->35|64->36|70->42|71->43|72->44
                  -- GENERATED --
              */
          