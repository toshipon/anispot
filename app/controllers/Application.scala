package controllers

import play.api.mvc._
import play.api._
import com.sun.net.httpserver.HttpContext

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.sp.index("Your new application is ready."))
  }
  
}