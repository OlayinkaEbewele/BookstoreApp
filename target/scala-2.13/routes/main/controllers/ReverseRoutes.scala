// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseBooksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books/create")
    }
  
    // @LINE:11
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:10
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:15
    def destroy(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/delete" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:12
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books/edit")
    }
  
    // @LINE:9
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/create")
    }
  
    // @LINE:8
    def index: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
