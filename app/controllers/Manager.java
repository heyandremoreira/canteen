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

    public Result createMenu(Http.Request request, Long id) {
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        LocalDate date = LocalDate.parse(dynamicForm.get("date"));
        Canteen canteen = Canteen.getCanteenById(id);
        Menu menu = new Menu(date, canteen);
        menu.save();
        menu.refresh();
        String meattypeString = dynamicForm.get("meattype");
        Type meattype = Type.valueOf(meattypeString);
        String meatname = dynamicForm.get("meatname");
        String meatdescription = dynamicForm.get("meatdescription");
        String meatvalueString = dynamicForm.get("meatvalue");
        Double meatvalue = Double.parseDouble(meatvalueString);
        Integer meatquantity = Integer.parseInt(dynamicForm.get("meatquantity"));
        Dish meatdish = new Dish(meattype, meatname, meatdescription, meatvalue, menu, meatquantity);
        meatdish.save();
        meatdish.refresh();

        String fishtypeString = dynamicForm.get("fishtype");
        Type fishtype = Type.valueOf(fishtypeString);
        String fishname = dynamicForm.get("fishname");
        String fishdescription = dynamicForm.get("fishdescription");
        String fishvalueString = dynamicForm.get("fishvalue");
        Double fishvalue = Double.parseDouble(fishvalueString);
        Integer fishquantity = Integer.parseInt(dynamicForm.get("fishquantity"));
        Dish fishdish = new Dish(fishtype, fishname, fishdescription, fishvalue, menu, fishquantity);
        fishdish.save();
        fishdish.refresh();

        String vegtypeString = dynamicForm.get("vegtype");
        Type vegtype = Type.valueOf(vegtypeString);
        String vegname = dynamicForm.get("vegname");
        String vegdescription = dynamicForm.get("vegdescription");
        String vegvalueString = dynamicForm.get("vegvalue");
        Double vegvalue = Double.parseDouble(vegvalueString);
        Integer vegquantity = Integer.parseInt(dynamicForm.get("vegquantity"));
        Dish vegdish = new Dish(vegtype, vegname, vegdescription, vegvalue, menu, vegquantity);
        vegdish.save();
        vegdish.refresh();
        return ok(views.html.Canteens.manage_menus.render(canteen, request));
    }

    // ARCONIA
    public Result manager_arc(Http.Request request) {
        return ok(views.html.Management.Arconia.manager_arc.render());
    }

    public Result manage_tickets_arc(Http.Request request) {
        return ok(views.html.Management.Arconia.manage_tickets_arc.render());
    }

    public Result manage_menus(Http.Request request, Long id) {
        Canteen canteen = Canteen.getCanteenById(id);
        return ok(views.html.Canteens.manage_menus.render(canteen, request));
    }



    // THE LAST DROP
    public Result manager_tld(Http.Request request) {
        return ok(views.html.Management.TheLastDrop.manager_tld.render());
    }

    public Result manage_tickets_tld(Http.Request request) {
        return ok(views.html.Management.TheLastDrop.manage_tickets_tld.render());
    }


    // THE LEAKY CAULDRON
    public Result manager_tlc(Http.Request request) {
        return ok(views.html.Management.TheLeakyCauldron.manager_tlc.render());
    }

    public Result manage_tickets_tlc(Http.Request request) {
        return ok(views.html.Management.TheLeakyCauldron.manage_tickets_tlc.render());
    }


    // WAVERLY SUB STATION
    public Result manager_wss(Http.Request request) {
        return ok(views.html.Management.WaverlySubStation.manager_wss.render());
    }

    public Result manage_tickets_wss(Http.Request request) {
        return ok(views.html.Management.WaverlySubStation.manage_tickets_wss.render());
    }
}