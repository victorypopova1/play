
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,List[Feature],List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(all: List[Feature], a:List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Кулинарные курсы</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/owl.carousel.css" rel="stylesheet">
    <link href="css/owl.transitions.css" rel="stylesheet">
    <link href="css/styles.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">


    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/mousescroll.js"></script>
    <script src="js/smoothscroll.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/jquery.inview.min.js"></script>
    <script src="js/wow.min.js"></script>
    <script src="contact/jqBootstrapValidation.js"></script>
    <script src="contact/contact_me.js"></script>
    <script src="js/contact.js"></script>
    <script src="js/custom-scripts.js"></script>
</head>

<body id="home">
<header id="header">
    <nav id="main-nav" class="navbar navbar-default navbar-fixed-top" role="banner">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html"><div class="logo"><img src="images/logo.png" alt="logo"></a></div>
        </div>

        <div class="collapse navbar-collapse navbar-right">
            <ul class="nav navbar-nav">
                <li class="scroll active"><a href="#home">Главная</a></li>
                <li class="scroll"><a href="#about">Курс</a></li>
                <li class="scroll"><a href="#portfolio">Галерея</a></li>
                <li class="scroll"><a href="#contact-us">Контакты</a></li>
            </ul>
        </div>
        </div><!--/.container-->
    </nav><!--/nav-->
</header><!--/header-->

<section id="main-slider">

    <div class="item" style="background-image: url(images/2.png);">
        <center><img  src="images/2.png" alt=""></center>
    </div><!--/.item-->

</section><!--/#main-slider-->

<section id="hero-text" class="wow fadeIn">
    <section id="services2">

        <div class="container">
            <div class="row">
                """),_display_(/*77.18*/for(feature <- all.asScala) yield /*77.45*/{_display_(Seq[Any](format.raw/*77.46*/("""
                """),format.raw/*78.17*/("""<div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class=""""),_display_(/*80.36*/feature/*80.43*/.imageUrl),format.raw/*80.52*/(""""></i>
                        <h3>"""),_display_(/*81.30*/feature/*81.37*/.title),format.raw/*81.43*/("""</h3>
                        <p>"""),_display_(/*82.29*/Html(feature.description)),format.raw/*82.54*/("""</p>
                    </div>
                </div>
            </div>
            """)))}),format.raw/*86.14*/("""
            """),_display_(/*87.14*/for(user <- a.asScala) yield /*87.36*/{_display_(Seq[Any](format.raw/*87.37*/("""
            """),format.raw/*88.13*/("""<row>
                """),_display_(/*89.18*/user/*89.22*/.email),format.raw/*89.28*/(""" """),_display_(/*89.30*/user/*89.34*/.salt),format.raw/*89.39*/("""
            """),format.raw/*90.13*/("""</row>
            """)))}),format.raw/*91.14*/("""
        """),format.raw/*92.9*/("""</div>
    </section>
    <div class="container">
        <div class="row">
            <div class="col-sm-9">
                <h2>Кулинарные курсы </h2>
                <p><h4>Предлагаем Вашему вниманию новейшую программу "Кулинар-эксперт". <br>В короткие сроки, вне зависимости от уровня подготовки, вы научитесь создавать настоящие кулинарные шедевры,
                получите бесценные навыки и советы от наших профессиональных поваров, а также уникальные рецептуры и рекомендации по выполнению блюд. </h4></p>
            </div>
            <div class="collapse navbar-collapse navbar-right">
                <ul class="nav navbar-nav">
                    <li class="scroll"> <a class="btn btn-primary btn-lg" href="#contact-us">Записаться</a></li>
                </ul>
            </div>
            <div class="col-lg-3 col-md-6 text-center">

            </div>
        </div>
    </div>
</section><!--/#hero-text-->



<section id="about">
    <div class="container">
        <div class="section-header">
            <h2 class="section-title text-center wow fadeInDown">Почему наш курс так эффективен?</h2>

        </div>

        <div class="row">
            <div class="col-md-3 col-sm-6">
                <div class="team-member wow fadeInUp" data-wow-duration="400ms" data-wow-delay="0ms">
                    <div class="img1">
                        <img  src="images/team/1.png" alt="">
                    </div>
                    <div class="team-info">
                        <h3>Теоретическая часть</h3>
                        <div class="text2">  Вы будет изучать историю кулинарного искусства, а также национальные блюда других стран мира, чтобы получать гарантированный результат на кухне.</div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="team-member wow fadeInUp" data-wow-duration="400ms" data-wow-delay="0ms">
                    <div class="img1">
                        <img  src="images/team/2.png" alt="">
                    </div>
                    <div class="team-info">
                        <h3>Практическая часть</h3>
                        <div class="text2"> Вы будете готовить 3 полноценных блюда в неделю. Все блюда подобраны таким образом, чтобы вы могли в течение курса закрепить знания технологий.</div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="team-member wow fadeInUp" data-wow-duration="400ms" data-wow-delay="0ms">
                    <div class="img1">
                        <img  src="images/team/3.png" alt="">
                    </div>
                    <div class="team-info">
                        <h3>Сопровождение</h3>
                        <div class="text2"> Автор курса и его команда поваров ответит на все ваши вопросы, разберут ваши ошибки и помогут вам понять,что и как можно улучшить.</div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="team-member wow fadeInUp" data-wow-duration="400ms" data-wow-delay="0ms">
                    <div class="img1">
                        <img  src="images/team/4.png" alt="">
                    </div>
                    <div class="team-info">
                        <h3>Подведение итогов</h3>
                        <div class="text2"> В конце курса проводися конкурс. Вам будет предложено блюдо, которое необходимо приготовить за 1 час. Победитель получит специальный приз.</div>
                    </div>
                </div>
            </div>

        </div>

</section>

<section id="portfolio">
    <div class="container">
        <div class="section-header">
            <h2 class="section-title text-center wow fadeInDown">Галерея</h2>
            <h3>Кулинарные шедевры наших учеников.</h3>
        </div>

        <div class="portfolio-items">
            <div class="portfolio-item designing">
                <div class="portfolio-item-inner">
                    <img class="img-responsive" src="images/portfolio/5.jpg" alt="">
                    <div class="portfolio-info">

                        <a class="preview" href="images/portfolio/5.jpg" rel="prettyPhoto"><i class="fa fa-search"></i></a>
                    </div>
                </div>
            </div><!--/.portfolio-item-->

            <div class="portfolio-item mobile development">
                <div class="portfolio-item-inner">
                    <img class="img-responsive" src="images/portfolio/2.jpg" alt="">
                    <div class="portfolio-info">

                        <a class="preview" href="images/portfolio/2.jpg" rel="prettyPhoto"><i class="fa fa-search"></i></a>
                    </div>
                </div>
            </div><!--/.portfolio-item-->

            <div class="portfolio-item designing">
                <div class="portfolio-item-inner">
                    <img class="img-responsive" src="images/portfolio/3.jpg" alt="">
                    <div class="portfolio-info">

                        <a class="preview" href="images/portfolio/3.jpg" rel="prettyPhoto"><i class="fa fa-search"></i></a>
                    </div>
                </div>
            </div><!--/.portfolio-item-->

            <div class="portfolio-item mobile">
                <div class="portfolio-item-inner">
                    <img class="img-responsive" src="images/portfolio/4.jpg" alt="">
                    <div class="portfolio-info">

                        <a class="preview" href="images/portfolio/4.jpg" rel="prettyPhoto"><i class="fa fa-search"></i></a>
                    </div>
                </div>
            </div><!--/.portfolio-item-->

            <div class="portfolio-item designing development">
                <div class="portfolio-item-inner">
                    <img class="img-responsive" src="images/portfolio/1.jpg" alt="">
                    <div class="portfolio-info">

                        <a class="preview" href="images/portfolio/1.jpg" rel="prettyPhoto"><i class="fa fa-search"></i></a>
                    </div>
                </div>
            </div><!--/.portfolio-item-->

            <div class="portfolio-item mobile">
                <div class="portfolio-item-inner">
                    <img class="img-responsive" src="images/portfolio/6.jpg" alt="">
                    <div class="portfolio-info">

                        <a class="preview" href="images/portfolio/6.jpg" rel="prettyPhoto"><i class="fa fa-search"></i></a>
                    </div>
                </div>
            </div><!--/.portfolio-item-->

            <div class="portfolio-item designing development">
                <div class="portfolio-item-inner">
                    <img class="img-responsive" src="images/portfolio/7.jpg" alt="">
                    <div class="portfolio-info">

                        <a class="preview" href="images/portfolio/7.jpg" rel="prettyPhoto"><i class="fa fa-search"></i></a>
                    </div>
                </div>
            </div><!--/.portfolio-item-->

            <div class="portfolio-item mobile">
                <div class="portfolio-item-inner">
                    <img class="img-responsive" src="images/portfolio/8.jpg" alt="">
                    <div class="portfolio-info">

                        <a class="preview" href="images/portfolio/8.jpg" rel="prettyPhoto"><i class="fa fa-search"></i></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>




<section id="contact-us">
    <div class="text1">
        Получайте первыми самые полезные знания <br>в области кулинарного искусства</div>
    <div class="container-wrapper">

        <div class="container contact-info">
            <div class="row">

                <div class="col-sm-4 col-md-4">
                    <div class="contact-form">
                        <address>
                            <strong>Кулинарная академия.</strong><br>
                            Иркутск<br>
                            Российская Федерация<br>
                            <abbr title="Phone">Тел:</abbr>8 (3952) 000-000
                        </address>
                    </div></div>
                <div class="col-sm-8 col-md-8">
                    <div class="contact-form">

                        <!--NOTE: Update your email Id in "contact_me.php" file in order to receive emails from your contact form-->
                        <form name="sentMessage" id="contactForm"  novalidate>
                            <div class="control-group">
                                <div class="controls">
                                    <input type="text" class="form-control"
                                           placeholder="Ваше имя" id="name" required
                                           data-validation-required-message="Please enter your name" />
                                    <p class="help-block"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="controls">
                                    <input type="email" class="form-control" placeholder="Email"
                                           id="email" required
                                           data-validation-required-message="Please enter your email" />
                                    <p class="help-block"></p>
                                </div>
                            </div>

                            <div class="control-group">
                                <div class="controls">
		<textarea rows="10" cols="100" class="form-control"
                  placeholder="Вопрос?" id="message" required
                  data-validation-required-message="Please enter your message" minlength="5"
                  data-validation-minlength-message="Min 5 characters"
                  maxlength="999" style="resize:none"></textarea>
                                </div>
                            </div>
                            <div id="success"> </div> <!-- For success/fail messages -->
                            <button type="submit" class="btn btn-primary pull-right">Записаться</button><br />
                        </form>


                    </div>
                </div>
            </div>
        </div>
    </div>
</section><!--/#contact-us-->



<footer id="footer">
    <div class="container">
        <div class="row">
            <div class="col-sm-6">
                &copy; 2017 Victoria Popova
            </div>
            <div class="col-sm-6">
                <ul class="social-icons">
                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                    <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                    <li><a href="#"><i class="fa fa-youtube"></i></a></li>
                    <li><a href="#"><i class="fa fa-github"></i></a></li>
                </ul>
            </div>
        </div>
    </div>
</footer><!--/#footer-->

</body>
</html>
"""))
      }
    }
  }

  def render(message:String,all:List[Feature],a:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(message)(all,a)

  def f:((String) => (List[Feature],List[User]) => play.twirl.api.HtmlFormat.Appendable) = (message) => (all,a) => apply(message)(all,a)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 17:15:27 IRKT 2017
                  SOURCE: F:/web/copy/playVA/playVA/app/views/index.scala.html
                  HASH: 71f34b2e687dc6b3d4eddc6c282a0c9c97c93fb4
                  MATRIX: 973->1|1119->52|1146->53|4215->3095|4258->3122|4297->3123|4342->3140|4494->3265|4510->3272|4540->3281|4603->3317|4619->3324|4646->3330|4707->3364|4753->3389|4871->3476|4912->3490|4950->3512|4989->3513|5030->3526|5080->3549|5093->3553|5120->3559|5149->3561|5162->3565|5188->3570|5229->3583|5280->3603|5316->3612
                  LINES: 28->1|33->1|34->2|109->77|109->77|109->77|110->78|112->80|112->80|112->80|113->81|113->81|113->81|114->82|114->82|118->86|119->87|119->87|119->87|120->88|121->89|121->89|121->89|121->89|121->89|121->89|122->90|123->91|124->92
                  -- GENERATED --
              */
          