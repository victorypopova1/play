
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

object editor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],helper.FieldConstructor,play.api.i18n.Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**
* Generate an HTML input text.
*
* Example:
* {{{
* @inputText(field = myForm("name"), args = 'size -> 10, 'placeholder -> "Your name")
* }}}
*
* @param field The form field.
* @param args Set of extra attributes.
* @param handler The field constructor.
*/
  def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: helper.FieldConstructor, lang: play.api.i18n.Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*15.2*/import helper._;

def /*16.2*/invalid/*16.9*/ = {{if (field.hasErrors){"is-invalid"} else if(!field.value.isEmpty){"is-valid"} else {""}}};
Seq[Any](format.raw/*13.120*/("""

"""),format.raw/*16.101*/("""

"""),format.raw/*18.1*/("""<div class="form-group">

    <label class="control-label" for=""""),_display_(/*20.40*/field/*20.45*/.id),format.raw/*20.48*/("""">"""),_display_(/*20.51*/{args.toMap.get('_label).map(_.toString).getOrElse(field.name)}),format.raw/*20.114*/("""</label>
    <textarea  class="form-control" id="editor" name=""""),_display_(/*21.56*/field/*21.61*/.name),format.raw/*21.66*/("""" """),_display_(/*21.69*/toHtmlArgs(args.filter(arg => !arg._1.name.startsWith("_") && arg._1 != 'id).toMap)),format.raw/*21.152*/(""">"""),_display_(/*21.154*/field/*21.159*/.value),format.raw/*21.165*/(""" """),format.raw/*21.166*/("""</textarea>

</div>

<script src=""""),_display_(/*25.15*/routes/*25.21*/.Assets.versioned("tinymce/tinymce.min.js")),format.raw/*25.64*/("""" type="text/javascript"></script>
<script type="text/javascript" src=""""),_display_(/*26.38*/routes/*26.44*/.Assets.versioned("edit.js")),format.raw/*26.72*/(""""></script>
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
                  SOURCE: F:/web/copy/playVA/playVA/app/views/bootstrap/editor.scala.html
                  HASH: 5820e0856f69525b52d895c12a79e096575aed3f
                  MATRIX: 1305->262|1497->383|1527->401|1542->408|1666->380|1697->500|1726->502|1818->567|1832->572|1856->575|1886->578|1971->641|2062->705|2076->710|2102->715|2132->718|2237->801|2267->803|2282->808|2310->814|2340->815|2402->850|2417->856|2481->899|2580->971|2595->977|2644->1005
                  LINES: 39->13|42->15|44->16|44->16|45->13|47->16|49->18|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|56->25|56->25|56->25|57->26|57->26|57->26
                  -- GENERATED --
              */
          