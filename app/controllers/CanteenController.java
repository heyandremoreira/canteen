package controllers;

import models.Canteen;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class CanteenController extends Controller {
    private final FormFactory formFactory;

    @Inject
    public CanteenController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result canteen(Http.Request request, Long id){
        Canteen canteen = Canteen.getCanteenById(id);
        return ok(views.html.Canteens.canteen.render(canteen));
    }
}
