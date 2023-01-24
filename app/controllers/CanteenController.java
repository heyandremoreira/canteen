package controllers;

import models.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CanteenController extends Controller {
    private final FormFactory formFactory;

    @Inject
    public CanteenController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result canteen(Http.Request request, Long id){
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        LocalDate date = LocalDate.now();
        String formDate =  dynamicForm.get("date");
        if (formDate != null){
            date = LocalDate.parse(formDate);
        }
        Canteen canteen = Canteen.getCanteenById(id);
        Menu menu = Menu.getMenuByDate(date, canteen.getId());
        List<Dish> dishes = new ArrayList<>();
        if (menu != null){
            dishes = Dish.getDishesFromMenu(menu);
        }
        return ok(views.html.Canteens.canteen.render(canteen, dishes, request));
    }

    public Result buy(Http.Request request, Long id) {
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        Dish dish = Dish.getDishById(id);
        User user =  User.getUserById(1L);
        if (dish.getDishQuantity() > 0) {
            dish.setDishQuantity(dish.getDishQuantity()-1);
            Ticket ticket = new Ticket(dish, user);
            dish.update();
            dish.refresh();
            ticket.save();
            ticket.refresh();
        }
        return redirect(routes.Student.tickets());
    }
}