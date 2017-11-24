
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/web/copy/playVA/playVA/conf/routes
// @DATE:Fri Nov 24 17:15:23 IRKT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:20
  Auth_2: controllers.Auth,
  // @LINE:27
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:20
    Auth_2: controllers.Auth,
    // @LINE:27
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Auth_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Auth_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """feature""", """controllers.HomeController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """feature/new""", """controllers.HomeController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """feature""", """controllers.HomeController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """feature/""" + "$" + """id<[^/]+>""", """controllers.HomeController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """feature/""" + "$" + """id<[^/]+>""", """controllers.HomeController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """feature/""" + "$" + """id<[^/]+>/delete""", """controllers.HomeController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Auth.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Auth.signup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Auth.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Auth.auth()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Маршрут к главной странице сайта""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("feature")))
  )
  private[this] lazy val controllers_HomeController_list1_invoker = createInvoker(
    HomeController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "list",
      Nil,
      "GET",
      this.prefix + """feature""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("feature/new")))
  )
  private[this] lazy val controllers_HomeController_create2_invoker = createInvoker(
    HomeController_0.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create",
      Nil,
      "GET",
      this.prefix + """feature/new""",
      """ Создание""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("feature")))
  )
  private[this] lazy val controllers_HomeController_save3_invoker = createInvoker(
    HomeController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "save",
      Nil,
      "POST",
      this.prefix + """feature""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("feature/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_edit4_invoker = createInvoker(
    HomeController_0.edit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """feature/""" + "$" + """id<[^/]+>""",
      """ Редактирование""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("feature/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_update5_invoker = createInvoker(
    HomeController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "update",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """feature/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_delete6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("feature/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_HomeController_delete6_invoker = createInvoker(
    HomeController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """feature/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Auth_register7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Auth_register7_invoker = createInvoker(
    Auth_2.register(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Auth_signup8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Auth_signup8_invoker = createInvoker(
    Auth_2.signup(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Auth_login9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Auth_login9_invoker = createInvoker(
    Auth_2.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Auth_auth10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Auth_auth10_invoker = createInvoker(
    Auth_2.auth(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "auth",
      Nil,
      "GET",
      this.prefix + """auth""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """""" + "$" + """file<.+>""",
      """ Отображает статические файлы из папки /public в /public URL
GET     /public/*file               controllers.Assets.versioned(path="/public", file: Asset)""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_HomeController_list1_route(params@_) =>
      call { 
        controllers_HomeController_list1_invoker.call(HomeController_0.list)
      }
  
    // @LINE:11
    case controllers_HomeController_create2_route(params@_) =>
      call { 
        controllers_HomeController_create2_invoker.call(HomeController_0.create())
      }
  
    // @LINE:12
    case controllers_HomeController_save3_route(params@_) =>
      call { 
        controllers_HomeController_save3_invoker.call(HomeController_0.save())
      }
  
    // @LINE:15
    case controllers_HomeController_edit4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_edit4_invoker.call(HomeController_0.edit(id))
      }
  
    // @LINE:16
    case controllers_HomeController_update5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_update5_invoker.call(HomeController_0.update(id))
      }
  
    // @LINE:18
    case controllers_HomeController_delete6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_delete6_invoker.call(HomeController_0.delete(id))
      }
  
    // @LINE:20
    case controllers_Auth_register7_route(params@_) =>
      call { 
        controllers_Auth_register7_invoker.call(Auth_2.register())
      }
  
    // @LINE:21
    case controllers_Auth_signup8_route(params@_) =>
      call { 
        controllers_Auth_signup8_invoker.call(Auth_2.signup())
      }
  
    // @LINE:22
    case controllers_Auth_login9_route(params@_) =>
      call { 
        controllers_Auth_login9_invoker.call(Auth_2.login())
      }
  
    // @LINE:23
    case controllers_Auth_auth10_route(params@_) =>
      call { 
        controllers_Auth_auth10_invoker.call(Auth_2.auth())
      }
  
    // @LINE:27
    case controllers_Assets_versioned11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
