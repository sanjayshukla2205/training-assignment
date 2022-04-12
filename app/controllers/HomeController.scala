package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import views.html


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def Name() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.Name())
  }

  def NamePost(): Action[AnyContent] =  Action { implicit request: Request[AnyContent] =>
    Ok(views.html.DOB())
  }

  def DOB() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.DOB())
  }

 def DOBPost() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.Addressform())
  }



  def Addressform() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.Addressform())
  }



  /*def AddressPost() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.
  }*/


}
