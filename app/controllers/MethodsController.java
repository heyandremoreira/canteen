package controllers;

import models.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.Student.tickets;

import javax.inject.Inject;
import java.time.LocalDate;

public class MethodsController extends Controller {
    private final FormFactory formFactory;

    @Inject
    public MethodsController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /*public Result buy(Http.Request request, Long id) {
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        Dish dish = Dish.getDishById(id);
        if (dish.getDishQuantity() > 0) {
            dish.setDishQuantity(dish.getDishQuantity()-1);
            dish.update();
            dish.refresh();
        }
        return redirect(routes.Student.tickets());
    }*/
}
