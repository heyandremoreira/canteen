package controllers;

import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

public class HomeController extends Controller {
    private final FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result landing(Http.Request request) {
        return ok(views.html.landing.render());
    }

    public Result administrator(Http.Request request) {
        return ok(views.html.Administrator.administrator.render());
    }

    public Result authapproval(Http.Request request) {
        return ok(views.html.Administrator.authapproval.render());
    }

    public Result northycanteen(Http.Request request) {
        return ok(views.html.Canteens.northycanteen.render());
    }

    public Result westycanteen(Http.Request request) {
        return ok(views.html.Canteens.westycanteen.render());
    }

    public Result eastycanteen(Http.Request request) {
        return ok(views.html.Canteens.eastycanteen.render());
    }

    public Result southycanteen(Http.Request request) {
        return ok(views.html.Canteens.southycanteen.render());
    }

    public Result home(Http.Request request) {
        return ok(views.html.home.render());
    }

    public Result login(Http.Request request) {
        return ok(views.html.login.render());
    }

    public Result managemenus(Http.Request request) {
        return ok(views.html.Manager.managemenus.render());
    }

    public Result managetickets(Http.Request request) {
        return ok(views.html.Manager.managetickets.render());
    }

    public Result profile(Http.Request request) {
        return ok(views.html.profile.render());
    }

    public Result recoverpassword(Http.Request request) {
        return ok(views.html.recoverpassword.render());
    }

    public Result signup(Http.Request request) {
        return ok(views.html.signup.render());
    }

    public Result tickets(Http.Request request) {
        return ok(views.html.Student.tickets.render());
    }

    public Result userslist(Http.Request request) {
        return ok(views.html.Administrator.userslist.render());
    }

    public Result wallet(Http.Request request) {
        return ok(views.html.Student.wallet.render());
    }

    public Result calendar(Http.Request request) {
        return ok(views.html.calendar.render());
    }

}