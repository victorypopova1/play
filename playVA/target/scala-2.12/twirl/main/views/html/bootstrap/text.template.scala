
package views.html.bootstrap

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

object text extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],helper.FieldConstructor,play.api.i18n.Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**
* Генерирует HTML input.
*
* Пример:
* {{{
* @text(field = myForm("name"), args = 'size -> 10, 'placeholder -> "Your name")
* }}}
*
* @param Поле для формы.
* @param args Множество дополнительных атрибутов.
* @param handler конструктор поля.
*/
  def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: helper.FieldConstructor, lang: play.api.i18n.Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*15.2*/import helper._;

def /*17.2*/inputType/*17.11*/ = {{ args.toMap.get('type).map(_.toString).getOrElse("text") }};def /*18.2*/invalid/*18.9*/ = {{if (field.hasErrors){"is-invalid"} else if(!field.value.isEmpty){"is-valid"} else {""}}};
Seq[Any](format.raw/*13.120*/("""

"""),format.raw/*16.1*/("""
"""),format.raw/*17.74*/("""
"""),format.raw/*18.101*/("""

"""),format.raw/*20.1*/("""<div class="form-group """),_display_(/*20.25*/if(field.hasErrors)/*20.44*/{_display_(Seq[Any](format.raw/*20.45*/("""error""")))}),format.raw/*20.51*/("""">
    <label class="control-label" for=""""),_display_(/*21.40*/field/*21.45*/.id),format.raw/*21.48*/("""">"""),_display_(/*21.51*/{args.toMap.get('_label).map(_.toString).getOrElse(field.name)}),format.raw/*21.114*/("""</label>

    <input class="form-control """),_display_(/*23.33*/invalid),format.raw/*23.40*/("""" type=""""),_display_(/*23.49*/inputType),format.raw/*23.58*/("""" id=""""),_display_(/*23.65*/field/*23.70*/.id),format.raw/*23.73*/("""" name=""""),_display_(/*23.82*/field/*23.87*/.name),format.raw/*23.92*/("""" value=""""),_display_(/*23.102*/field/*23.107*/.value),format.raw/*23.113*/("""" """),_display_(/*23.116*/toHtmlArgs(args.filter(arg => !arg._1.name.startsWith("_") && arg._1 != 'id).toMap)),format.raw/*23.199*/(""" """),format.raw/*23.200*/("""/>
    <div class="invalid-feedback">"""),_display_(/*24.36*/{field.error.map { error => error.message }}),format.raw/*24.80*/("""</div>
    <div class="help-block">"""),_display_(/*25.30*/{args.toMap.get('_help).map(_.toString).getOrElse("")}),format.raw/*25.84*/("""</div>

</div>




"""))
      }
    }
  }

  def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:helper.FieldConstructor,lang:play.api.i18n.Lang): play.twirl.api.HtmlFormat.Appendable = apply(field,args:_*)(handler,lang)

  def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (helper.FieldConstructor,play.api.i18n.Lang) => play.twirl.api.HtmlFormat.Appendable) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 17:15:27 IRKT 2017
                  SOURCE: F:/web/copy/playVA/playVA/app/views/bootstrap/text.scala.html
                  HASH: 48f8e46afb3261612c9e65d5ec7ce9e2e5bcdf81
                  MATRIX: 1291->250|1483->371|1513->390|1531->399|1608->464|1623->471|1747->368|1776->388|1805->462|1835->563|1864->565|1915->589|1943->608|1982->609|2019->615|2088->657|2102->662|2126->665|2156->668|2241->731|2310->773|2338->780|2374->789|2404->798|2438->805|2452->810|2476->813|2512->822|2526->827|2552->832|2590->842|2605->847|2633->853|2664->856|2769->939|2799->940|2864->978|2929->1022|2992->1058|3067->1112
                  LINES: 39->13|42->15|44->17|44->17|44->18|44->18|45->13|47->16|48->17|49->18|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|56->25|56->25
                  -- GENERATED --
              */
          