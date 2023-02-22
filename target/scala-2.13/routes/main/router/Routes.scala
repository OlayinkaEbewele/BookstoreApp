// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  BooksController_0: controllers.BooksController,
  // @LINE:19
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    BooksController_0: controllers.BooksController,
    // @LINE:19
    Assets_1: controllers.Assets
  ) = this(errorHandler, BooksController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, BooksController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BooksController.create(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit/""" + "$" + """id<[^/]+>""", """controllers.BooksController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit""", """controllers.BooksController.update()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BooksController.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/delete""", """controllers.BooksController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_BooksController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_index0_invoker = createInvoker(
    BooksController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "index",
      Nil,
      "GET",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_BooksController_create1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BooksController_create1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BooksController_0.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """books/create""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_BooksController_show2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_show2_invoker = createInvoker(
    BooksController_0.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_BooksController_edit3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_edit3_invoker = createInvoker(
    BooksController_0.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BooksController_update4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit")))
  )
  private[this] lazy val controllers_BooksController_update4_invoker = createInvoker(
    BooksController_0.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "update",
      Nil,
      "POST",
      this.prefix + """books/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BooksController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BooksController_save5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BooksController_0.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """books/create""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BooksController_destroy6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/delete")))
  )
  private[this] lazy val controllers_BooksController_destroy6_invoker = createInvoker(
    BooksController_0.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_BooksController_index0_route(params@_) =>
      call { 
        controllers_BooksController_index0_invoker.call(BooksController_0.index)
      }
  
    // @LINE:9
    case controllers_BooksController_create1_route(params@_) =>
      call { 
        controllers_BooksController_create1_invoker.call(
          req => BooksController_0.create(req))
      }
  
    // @LINE:10
    case controllers_BooksController_show2_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_show2_invoker.call(BooksController_0.show(id))
      }
  
    // @LINE:11
    case controllers_BooksController_edit3_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_edit3_invoker.call(BooksController_0.edit(id))
      }
  
    // @LINE:12
    case controllers_BooksController_update4_route(params@_) =>
      call { 
        controllers_BooksController_update4_invoker.call(BooksController_0.update())
      }
  
    // @LINE:14
    case controllers_BooksController_save5_route(params@_) =>
      call { 
        controllers_BooksController_save5_invoker.call(
          req => BooksController_0.save(req))
      }
  
    // @LINE:15
    case controllers_BooksController_destroy6_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_BooksController_destroy6_invoker.call(BooksController_0.destroy(id))
      }
  
    // @LINE:19
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
