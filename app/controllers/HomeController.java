package controllers;

import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.landing;

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
        return ok(views.html.administrator.render());
    }

    public Result authapproval(Http.Request request) {
        return ok(views.html.authapproval.render());
    }

    public Result canteen(Http.Request request) {
        return ok(views.html.canteen.render());
    }

    public Result home(Http.Request request) {
        return ok(views.html.home.render());
    }

    public Result login(Http.Request request) {
        return ok(views.html.login.render());
    }

    public Result managemenus(Http.Request request) {
        return ok(views.html.managemenus.render());
    }

    public Result managetickets(Http.Request request) {
        return ok(views.html.managetickets.render());
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
        return ok(views.html.tickets.render());
    }

    public Result userslist(Http.Request request) {
        return ok(views.html.userslist.render());
    }

    public Result wallet(Http.Request request) {
        return ok(views.html.wallet.render());
    }

}