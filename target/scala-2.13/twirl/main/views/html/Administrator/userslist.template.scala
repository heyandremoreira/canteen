
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
                        <form action=""""),_display_(/*25.40*/controllers/*25.51*/.routes.Administrator.removeUser(user.getId())),format.raw/*25.97*/("""" method="post">
                            """),_display_(/*26.30*/helper/*26.36*/.CSRF.formField(r.asScala)),format.raw/*26.62*/("""
                            """),format.raw/*27.29*/("""<div class="d-flex justify-content-center">
                                <button name="rembtn" type="submit" class="btn btn-remove px-4">Deny</button>
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

  def render(users:java.util.List[models.User],r:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(users,r)

  def f:((java.util.List[models.User],play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (users,r) => apply(users,r)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Administrator/userslist.scala.html
                  HASH: 83f021d2624133443c78b6dbf2ca9fc4c27e6ef0
                  MATRIX: 968->1|1125->63|1153->66|1203->108|1242->110|1274->116|1687->502|1714->520|1754->522|1796->537|1830->555|1870->557|1916->575|1974->606|1987->610|2014->616|2073->648|2086->652|2119->664|2200->718|2235->744|2275->746|2329->773|2372->800|2412->802|2470->829|2524->852|2574->874|2673->946|2693->957|2760->1003|2834->1050|2849->1056|2896->1082|2954->1112|3273->1400|3315->1411|3352->1421
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|51->20|51->20|51->20|52->21|53->22|54->23|56->25|56->25|56->25|57->26|57->26|57->26|58->27|64->33|65->34|66->35
                  -- GENERATED --
              */
          