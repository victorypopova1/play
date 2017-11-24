
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(regForm: Form[Register]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import bootstrap._


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main/*6.6*/ {_display_(Seq[Any](format.raw/*6.8*/("""
    """),_display_(/*7.6*/if(regForm.hasErrors)/*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-danger">
            <a class="close" data-dismiss="alert">x</a>
            """),_display_(/*10.14*/if(regForm.errors.size() > 0)/*10.43*/ {_display_(Seq[Any](format.raw/*10.45*/("""
                """),_display_(/*11.18*/for((key, value) <- regForm.errors) yield /*11.53*/ {_display_(Seq[Any](format.raw/*11.55*/("""
                    """),_display_(/*12.22*/for(err <- value) yield /*12.39*/ {_display_(Seq[Any](format.raw/*12.41*/("""
                        """),format.raw/*13.25*/("""<p>"""),_display_(/*13.29*/err/*13.32*/.message().toString()),format.raw/*13.53*/("""</p>
                    """)))}),format.raw/*14.22*/("""
                """)))}),format.raw/*15.18*/("""
            """)))}),format.raw/*16.14*/("""
        """),format.raw/*17.9*/("""</div>
    """)))}),format.raw/*18.6*/("""

    """),_display_(/*20.6*/helper/*20.12*/.form(routes.Auth.register())/*20.41*/ {_display_(Seq[Any](format.raw/*20.43*/("""
        """),_display_(/*21.10*/bootstrap/*21.19*/.text(regForm("email"),'_label ->  "Email", 'type -> "email")),format.raw/*21.80*/("""
        """),_display_(/*22.10*/bootstrap/*22.19*/.text(regForm("password"),'_label ->  "Пароль", 'type -> "password")),format.raw/*22.87*/("""
        """),format.raw/*23.9*/("""<div class="form-group">
            <button type="submit" class="btn btn-primary">Зарегистрироваться</button>
        </div>
    """)))}),format.raw/*26.6*/("""
""")))}))
      }
    }
  }

  def render(regForm:Form[Register]): play.twirl.api.HtmlFormat.Appendable = apply(regForm)

  def f:((Form[Register]) => play.twirl.api.HtmlFormat.Appendable) = (regForm) => apply(regForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 17:15:27 IRKT 2017
                  SOURCE: F:/web/copy/playVA/playVA/app/views/register.scala.html
                  HASH: 383847cb15b33bac9d4f187d69d3dd565dd9b93c
                  MATRIX: 959->1|1057->29|1080->46|1128->26|1156->65|1183->67|1194->71|1232->73|1263->79|1292->100|1331->102|1366->111|1495->213|1533->242|1573->244|1618->262|1669->297|1709->299|1758->321|1791->338|1831->340|1884->365|1915->369|1927->372|1969->393|2026->419|2075->437|2120->451|2156->460|2198->472|2231->479|2246->485|2284->514|2324->516|2361->526|2379->535|2461->596|2498->606|2516->615|2605->683|2641->692|2802->823
                  LINES: 28->1|31->3|32->4|35->1|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|46->14|47->15|48->16|49->17|50->18|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|58->26
                  -- GENERATED --
              */
          