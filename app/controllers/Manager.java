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

    // ARCONIA
    public Result manager_arc(Http.Request request) {
        return ok(views.html.Management.Arconia.manager_arc.render());
    }

    public Result manage_arc(Http.Request request) {
        return ok(views.html.Management.Arconia.manage_arc.render());
    }

    /*public Result manage_tickets_arc(Http.Request request) {
        return ok(views.html.Management.Arconia.manage_tickets_arc.render());
    }*/

    public Result manage_menus_arc(Http.Request request) {
        return ok(views.html.Management.Arconia.manage_menus_arc.render());
    }

    // THE LAST DROP
    public Result manager_tld(Http.Request request) {
        return ok(views.html.Management.TheLastDrop.manager_tld.render());
    }

    public Result manage_tld(Http.Request request) {
        return ok(views.html.Management.TheLastDrop.manage_tld.render());
    }

    public Result manage_tickets_tld(Http.Request request) {
        return ok(views.html.Management.TheLastDrop.manage_tickets_tld.render());
    }

    public Result manage_menus_tld(Http.Request request) {
        return ok(views.html.Management.TheLastDrop.manage_menus_tld.render());
    }


    // THE LEAKY CAULDRON
    public Result manager_tlc(Http.Request request) {
        return ok(views.html.Management.TheLeakyCauldron.manager_tlc.render());
    }

    public Result manage_tlc(Http.Request request) {
        return ok(views.html.Management.TheLeakyCauldron.manage_tlc.render());
    }

    public Result manage_tickets_tlc(Http.Request request) {
        return ok(views.html.Management.TheLeakyCauldron.manage_tickets_tlc.render());
    }

    public Result manage_menus_tlc(Http.Request request) {
        return ok(views.html.Management.TheLeakyCauldron.manage_menus_tlc.render());
    }


    // WAVERLY SUB STATION
    public Result manager_wss(Http.Request request) {
        return ok(views.html.Management.WaverlySubStation.manager_wss.render());
    }

    public Result manage_wss(Http.Request request) {
        return ok(views.html.Management.WaverlySubStation.manage_wss.render());
    }

    public Result manage_tickets_wss(Http.Request request) {
        return ok(views.html.Management.WaverlySubStation.manage_tickets_wss.render());
    }

    public Result manage_menus_wss(Http.Request request) {
        return ok(views.html.Management.WaverlySubStation.manage_menus_wss.render());
    }




}