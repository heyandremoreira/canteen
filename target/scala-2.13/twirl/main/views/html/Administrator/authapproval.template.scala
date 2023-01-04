
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

object authapproval extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[models.User],play.twirl.api.HtmlFormat.Appendable] {

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
                        <a type="submit" class="btn btn-approve">Approve</a>
                        <form action=""""),_display_(/*26.40*/controllers/*26.51*/.routes.Administrator.addUser()),format.raw/*26.82*/("""" method="post">
                            <div class="d-flex justify-content-center flex-grow-1 mt-3">
                                <button name="userId" type="submit" class="btn btn-sm btn-dark">Approve</button>
                            </div>
                        </form>
                        <a type="submit" class="btn btn-remove px-4">Remove</a>
                        <form action=""""),_display_(/*32.40*/controllers/*32.51*/.routes.Administrator.removeUser(user.getId())),format.raw/*32.97*/("""" method="post">
                            <div class="d-flex justify-content-center flex-grow-1 mt-3">
                                <button name="userId" type="submit" class="btn btn-sm btn-dark">Deny</button>
                            </div>
                        </form>
                    </td>
                </tr>
            """)))}),format.raw/*39.14*/("""
        """)))}),format.raw/*40.10*/("""
        """),format.raw/*41.9*/("""</tbody>
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
                  SOURCE: app/views/Administrator/authapproval.scala.html
                  HASH: b4b996cd38c19465ee3fb7a4653f1160eb7c4c17
                  MATRIX: 949->1|1080->37|1108->40|1158->82|1197->84|1229->90|1642->476|1669->494|1709->496|1751->511|1785->529|1825->531|1871->549|1929->580|1942->584|1969->590|2028->622|2041->626|2074->638|2155->692|2190->718|2230->720|2284->747|2327->774|2367->776|2425->803|2479->826|2529->848|2706->998|2726->1009|2778->1040|3216->1451|3236->1462|3303->1508|3685->1859|3727->1870|3764->1880
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|51->20|51->20|51->20|52->21|53->22|54->23|57->26|57->26|57->26|63->32|63->32|63->32|70->39|71->40|72->41
                  -- GENERATED --
              */
          