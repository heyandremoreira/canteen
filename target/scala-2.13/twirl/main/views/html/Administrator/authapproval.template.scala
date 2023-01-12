
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
        """),_display_(/*15.10*/if(!users.isEmpty)/*15.28*/ {_display_(Seq[Any](format.raw/*15.30*/("""
            """),_display_(/*16.14*/for(user <- users) yield /*16.32*/ {_display_(Seq[Any](format.raw/*16.34*/("""
                """),format.raw/*17.17*/("""<tr>
                    <th>"""),_display_(/*18.26*/user/*18.30*/.getId),format.raw/*18.36*/("""</th>
                    <td>"""),_display_(/*19.26*/user/*19.30*/.getUsername),format.raw/*19.42*/("""</td>
                    <td>"""),_display_(/*20.26*/user/*20.30*/.getEmail),format.raw/*20.39*/("""</td>
                    <td>
                        """),format.raw/*25.29*/("""
                    """),format.raw/*26.21*/("""</td>

                    <td>
                        <div class="d-inline justify-content-center">
                            <form action=""""),_display_(/*30.44*/controllers/*30.55*/.routes.Administrator.approveUser(user.getId())),format.raw/*30.102*/("""" method="post">
                                """),_display_(/*31.34*/helper/*31.40*/.CSRF.formField(r.asScala)),format.raw/*31.66*/("""
                            """),format.raw/*32.29*/("""<button name="appbtn" type="submit" class="btn btn-approve">Approve</button>
                            </form>
                            <form action=""""),_display_(/*34.44*/controllers/*34.55*/.routes.Administrator.denyUser(user.getId())),format.raw/*34.99*/("""" method="post">
                                """),_display_(/*35.34*/helper/*35.40*/.CSRF.formField(r.asScala)),format.raw/*35.66*/("""
                            """),format.raw/*36.29*/("""<button name="rembtn" type="submit" class="btn btn-remove">Deny</button>
                            </form>
                        </div>
                    </td>
                </tr>
            """)))}),format.raw/*41.14*/("""
        """)))}),format.raw/*42.10*/("""
        """),format.raw/*43.9*/("""</tbody>
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
                  HASH: 0d64219b05b2fc486833d6e70305648625f3674f
                  MATRIX: 971->1|1128->63|1156->66|1206->108|1245->110|1277->116|1730->542|1757->560|1797->562|1839->577|1873->595|1913->597|1959->615|2017->646|2030->650|2057->656|2116->688|2129->692|2162->704|2221->736|2234->740|2264->749|2349->951|2399->973|2575->1122|2595->1133|2664->1180|2742->1231|2757->1237|2804->1263|2862->1293|3047->1451|3067->1462|3132->1506|3210->1557|3225->1563|3272->1589|3330->1619|3567->1825|3609->1836|3646->1846
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|46->15|46->15|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->25|54->26|58->30|58->30|58->30|59->31|59->31|59->31|60->32|62->34|62->34|62->34|63->35|63->35|63->35|64->36|69->41|70->42|71->43
                  -- GENERATED --
              */
          