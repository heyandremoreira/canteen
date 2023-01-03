package controllers;

import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

public class CanteenController extends Controller {
    private final FormFactory formFactory;

    @Inject
    public CanteenController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result arconia(Http.Request request) {
        return ok(views.html.Canteens.arconia.render());
    }

    public Result thelastdrop(Http.Request request) {
        return ok(views.html.Canteens.thelastdrop.render());
    }

    public Result theleakycauldron(Http.Request request) {
        return ok(views.html.Canteens.theleakycauldron.render());
    }

    public Result waverlysubstation(Http.Request request) {
        return ok(views.html.Canteens.waverlysubstation.render());
    }
}
