
package views.html

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
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import bootstrap._


Seq[Any](format.raw/*1.26*/("""
"""),_display_(/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""
"""),_display_(/*5.2*/if(loginForm.hasErrors)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
"""),format.raw/*6.1*/("""<div class="alert alert-danger">
    <a class="close" data-dismiss="alert">x</a>
    """),_display_(/*8.6*/if(loginForm.errors.size() > 0)/*8.37*/ {_display_(Seq[Any](format.raw/*8.39*/("""
    """),_display_(/*9.6*/for((key, value) <- loginForm.errors) yield /*9.43*/ {_display_(Seq[Any](format.raw/*9.45*/("""
    """),_display_(/*10.6*/for(err <- value) yield /*10.23*/ {_display_(Seq[Any](format.raw/*10.25*/("""
    """),format.raw/*11.5*/("""<p>"""),_display_(/*11.9*/err/*11.12*/.message().toString()),format.raw/*11.33*/("""</p>
    """)))}),format.raw/*12.6*/("""
    """)))}),format.raw/*13.6*/("""
    """)))}),format.raw/*14.6*/("""
"""),format.raw/*15.1*/("""</div>
""")))}),format.raw/*16.2*/("""
"""),_display_(/*17.2*/helper/*17.8*/.form(routes.Auth.auth())/*17.33*/ {_display_(Seq[Any](format.raw/*17.35*/("""
"""),format.raw/*18.1*/("""<h2 class="form-signin-heading">Вход</h2>

"""),_display_(/*20.2*/bootstrap/*20.11*/.text(loginForm("email"),'_label -> "Email", 'type -> "email")),format.raw/*20.73*/("""
"""),_display_(/*21.2*/bootstrap/*21.11*/.text(loginForm("password"), '_label -> "Пароль", 'type -> "password")),format.raw/*21.81*/("""

"""),format.raw/*23.1*/("""<div class="form-group">
    <button type="submit" class="btn btn-primary">Войти</button> или
    <a href=""""),_display_(/*25.15*/routes/*25.21*/.Auth.signup()),format.raw/*25.35*/("""" class="btn btn-default">Зарегистрироваться</a>
</div>
""")))}),format.raw/*27.2*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 17:15:27 IRKT 2017
                  SOURCE: F:/web/copy/playVA/playVA/app/views/login.scala.html
                  HASH: 6fc6656e105d4925c48bde39037dc9b28ba55e4c
                  MATRIX: 953->1|1050->28|1073->46|1121->25|1149->67|1160->71|1198->73|1226->76|1257->99|1296->101|1324->103|1437->191|1476->222|1515->224|1547->231|1599->268|1638->270|1671->277|1704->294|1744->296|1777->302|1807->306|1819->309|1861->330|1902->341|1939->348|1976->355|2005->357|2044->366|2073->369|2087->375|2121->400|2161->402|2190->404|2262->450|2280->459|2363->521|2392->524|2410->533|2501->603|2532->607|2669->717|2684->723|2719->737|2808->796
                  LINES: 28->1|31->2|32->3|35->1|36->4|36->4|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|43->11|44->12|45->13|46->14|47->15|48->16|49->17|49->17|49->17|49->17|50->18|52->20|52->20|52->20|53->21|53->21|53->21|55->23|57->25|57->25|57->25|59->27
                  -- GENERATED --
              */
          