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

    public Result home(Http.Request request) {
        return ok(views.html.home.render());
    }

    public Result login(Http.Request request) {
        return ok(views.html.login.render());
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

    public Result termsofuse(Http.Request request) {
        return ok(views.html.Settings.termsofuse.render());
    }

    public Result privacypolicy(Http.Request request) {
        return ok(views.html.Settings.privacypolicy.render());
    }

    public Result calendar(Http.Request request) {
        return ok(views.html.calendar.render());
    }

}