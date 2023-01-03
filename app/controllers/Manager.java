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

    public Result manage_thelastdrop(Http.Request request) {
        return ok(views.html.Manager.manage_thelastdrop.render());
    }

    public Result manage_arconia(Http.Request request) {
        return ok(views.html.Manager.manage_arconia.render());
    }

    public Result manage_theleakycauldron(Http.Request request) {
        return ok(views.html.Manager.manage_theleakycauldron.render());
    }
    public Result manage_waverlysubstation(Http.Request request) {
        return ok(views.html.Manager.manage_waverlysubstation.render());
    }

    public Result managemenus(Http.Request request) {
        return ok(views.html.Manager.managemenus.render());
    }

    public Result managetickets(Http.Request request) {
        List<Canteen> canteens = Canteen.getCanteenList();
        return ok(views.html.Manager.managetickets.render(canteens));
    }
}