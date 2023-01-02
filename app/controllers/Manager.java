package controllers;

import models.Canteen;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

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

    public Result manage_northy(Http.Request request) {
        return ok(views.html.Manager.manage_northy.render());
    }

    public Result manage_easty(Http.Request request) {
        return ok(views.html.Manager.manage_easty.render());
    }

    public Result manage_westy(Http.Request request) {
        return ok(views.html.Manager.manage_westy.render());
    }
    public Result manage_southy(Http.Request request) {
        return ok(views.html.Manager.manage_southy.render());
    }

    public Result managetickets(Http.Request request) {
        List<Canteen> canteens = Canteen.getCanteenList();
        return ok(views.html.Manager.managetickets.render(canteens));
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