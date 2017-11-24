
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

object editForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Long,Form[Feature],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, featureForm: Form[Feature]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""

"""),format.raw/*7.1*/("""<h1>Фича</h1>

"""),_display_(/*9.2*/form(routes.HomeController.update(id))/*9.40*/ {_display_(Seq[Any](format.raw/*9.42*/("""
"""),format.raw/*10.1*/("""<fieldset>
    """),_display_(/*11.6*/CSRF/*11.10*/.formField),format.raw/*11.20*/("""
    """),_display_(/*12.6*/inputText(featureForm("title"), '_label -> "Название", '_help -> "")),format.raw/*12.74*/("""
    """),_display_(/*13.6*/bootstrap/*13.15*/.editor(featureForm("description"), '_label -> "Описание", '_help -> "")),format.raw/*13.87*/("""
    """),_display_(/*14.6*/inputText(featureForm("imageUrl"), '_label -> "Ссылка на картинку", '_help -> "")),format.raw/*14.87*/("""

    """),format.raw/*16.5*/("""<input type="hidden" name=""""),_display_(/*16.33*/featureForm("id")/*16.50*/.getName),format.raw/*16.58*/("""" value=""""),_display_(/*16.68*/featureForm("id")/*16.85*/.getValue),format.raw/*16.94*/("""">
</fieldset>

<div class="actions">
    <input type="submit" value="Сохранить" class="btn primary">
    <a href=""""),_display_(/*21.15*/routes/*21.21*/.HomeController.list()),format.raw/*21.43*/("""" class="btn btn-default">Отменить</a>
    """),_display_(/*22.6*/form(routes.HomeController.delete(id), 'class -> "topRight")/*22.66*/ {_display_(Seq[Any](format.raw/*22.68*/("""
    """),_display_(/*23.6*/CSRF/*23.10*/.formField),format.raw/*23.20*/("""
    """),format.raw/*24.5*/("""<input type="submit" value="Удалить" class="btn btn-danger">
    """)))}),format.raw/*25.6*/("""
"""),format.raw/*26.1*/("""</div>
""")))}),format.raw/*27.2*/("""
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(id:Long,featureForm:Form[Feature]): play.twirl.api.HtmlFormat.Appendable = apply(id,featureForm)

  def f:((Long,Form[Feature]) => play.twirl.api.HtmlFormat.Appendable) = (id,featureForm) => apply(id,featureForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 17:15:26 IRKT 2017
                  SOURCE: F:/web/copy/playVA/playVA/app/views/editForm.scala.html
                  HASH: 6119edb5d2f658cf465817501496da4b88def11a
                  MATRIX: 963->1|1074->42|1119->39|1147->58|1174->60|1185->64|1223->66|1251->68|1292->84|1338->122|1377->124|1405->125|1447->141|1460->145|1491->155|1523->161|1612->229|1644->235|1662->244|1755->316|1787->322|1889->403|1922->409|1977->437|2003->454|2032->462|2069->472|2095->489|2125->498|2268->614|2283->620|2326->642|2396->686|2465->746|2505->748|2537->754|2550->758|2581->768|2613->773|2709->839|2737->840|2775->848|2807->850
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|44->12|45->13|45->13|45->13|46->14|46->14|48->16|48->16|48->16|48->16|48->16|48->16|48->16|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|57->25|58->26|59->27|60->28
                  -- GENERATED --
              */
          