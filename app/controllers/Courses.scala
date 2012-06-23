package controllers

import play.api.mvc._
import play.api._
import com.sun.net.httpserver.HttpContext

object Courses extends Controller {
  
  def detail = Action {
    Ok(views.html.sp.courses.detail())
  }
}