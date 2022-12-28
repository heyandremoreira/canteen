package controllers;

import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

public class Manager extends Controller {
    private final FormFactory formFactory;

    @Inject
    public Manager(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result manager(Http.Request request) {
        return ok(views.html.Manager.manager.render());
    }

    public Result createcanteen(Http.Request request) {
        return ok(views.html.Manager.createcanteen.render());
    }

    public Result managemenus(Http.Request request) {
        return ok(views.html.Manager.managemenus.render());
    }

    public Result managetickets(Http.Request request) {
        return ok(views.html.Manager.managetickets.render());
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
}