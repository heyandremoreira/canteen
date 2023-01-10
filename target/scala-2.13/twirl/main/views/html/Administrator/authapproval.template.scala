
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
                    """),format.raw/*22.25*/("""
                    """),format.raw/*23.21*/("""</td>
                    <td>
                        <form action=""""),_display_(/*25.40*/controllers/*25.51*/.routes.Administrator.addUser()),format.raw/*25.82*/("""" method="post">
                            """),_display_(/*26.30*/helper/*26.36*/.CSRF.formField(r.asScala)),format.raw/*26.62*/("""
                            """),format.raw/*27.29*/("""<div class="d-flex justify-content-center">
                                <button name="appbtn" type="submit" class="btn btn-approve">Approve</button>
                            </div>
                        </form>
                        <form action=""""),_display_(/*31.40*/controllers/*31.51*/.routes.Administrator.denyUser(user.getId())),format.raw/*31.95*/("""" method="post">
                            """),_display_(/*32.30*/helper/*32.36*/.CSRF.formField(r.asScala)),format.raw/*32.62*/("""
                            """),format.raw/*33.29*/("""<div class="d-flex justify-content-center">
                                <button name="rembtn" type="submit" class="btn btn-remove">Deny</button>
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

  def render(users:java.util.List[models.User],r:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(users,r)

  def f:((java.util.List[models.User],play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (users,r) => apply(users,r)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Administrator/authapproval.scala.html
                  HASH: c9b8b8b72afb5118a652cae42ccbe9e4333fd70e
                  MATRIX: 971->1|1128->63|1156->66|1206->108|1245->110|1277->116|1690->502|1717->520|1757->522|1799->537|1833->555|1873->557|1919->575|1977->606|1990->610|2017->616|2076->648|2089->652|2122->664|2203->858|2253->880|2352->952|2372->963|2424->994|2498->1041|2513->1047|2560->1073|2618->1103|2908->1366|2928->1377|2993->1421|3067->1468|3082->1474|3129->1500|3187->1530|3501->1813|3543->1824|3580->1834
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->22|51->23|53->25|53->25|53->25|54->26|54->26|54->26|55->27|59->31|59->31|59->31|60->32|60->32|60->32|61->33|67->39|68->40|69->41
                  -- GENERATED --
              */
          