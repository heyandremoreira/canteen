package controllers;

import models.Canteen;
import models.Dish;
import models.Menu;
import models.Type;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.List;

public class Manager extends Controller {
    private final FormFactory formFactory;

    @Inject
    public Manager(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    // ARCONIA
    public Result manager_arc(Http.Request request) {
        return ok(views.html.Management.Arconia.manager_arc.render());
    }

    public Result manage_tickets_arc(Http.Request request) {
        return ok(views.html.Management.Arconia.manage_tickets_arc.render());
    }

    public Result manage_menus_arc(Http.Request request) {
        return ok(views.html.Management.Arconia.manage_menus_arc.render(request));
    }

    public Result createMenu(Http.Request request){
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        String name = dynamicForm.get("name");
        String description = dynamicForm.get("description");
        String valueString = dynamicForm.get("value");
        Double value = Double.parseDouble(valueString);
        Integer quantity = Integer.parseInt(dynamicForm.get("quantity"));
        Dish dish = new Dish(name, description, value, quantity);
        dish.save();
        dish.refresh();
        return ok(views.html.Management.Arconia.manage_menus_arc.render(request));
    }


    // THE LAST DROP
    public Result manager_tld(Http.Request request) {
        return ok(views.html.Management.TheLastDrop.manager_tld.render());
    }

    public Result manage_tickets_tld(Http.Request request) {
        return ok(views.html.Management.TheLastDrop.manage_tickets_tld.render());
    }

    public Result manage_menus_tld(Http.Request request) {
        return ok(views.html.Management.TheLastDrop.manage_menus_tld.render(request));
    }


    // THE LEAKY CAULDRON
    public Result manager_tlc(Http.Request request) {
        return ok(views.html.Management.TheLeakyCauldron.manager_tlc.render());
    }

    public Result manage_tickets_tlc(Http.Request request) {
        return ok(views.html.Management.TheLeakyCauldron.manage_tickets_tlc.render());
    }

    public Result manage_menus_tlc(Http.Request request) {
        return ok(views.html.Management.TheLeakyCauldron.manage_menus_tlc.render(request));
    }


    // WAVERLY SUB STATION
    public Result manager_wss(Http.Request request) {
        return ok(views.html.Management.WaverlySubStation.manager_wss.render());
    }

    public Result manage_tickets_wss(Http.Request request) {
        return ok(views.html.Management.WaverlySubStation.manage_tickets_wss.render());
    }

    public Result manage_menus_wss(Http.Request request) {
        return ok(views.html.Management.WaverlySubStation.manage_menus_wss.render(request));
    }
}