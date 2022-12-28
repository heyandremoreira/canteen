package controllers;

import models.Item;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

public class Administrator extends Controller {

    private final FormFactory formFactory;

    @Inject
    public Administrator(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result administrator(Http.Request request) {
        return ok(views.html.Administrator.administrator.render());
    }

    public Result userslist(Http.Request request) {
        return ok(views.html.Administrator.userslist.render());
    }

    public Result authapproval(Http.Request request) {
        return ok(views.html.Administrator.authapproval.render());
    }

    public Result addItem(Http.Request request){
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        Item item = new Item();
        item.setName(dynamicForm.get("item"));
        item.setCategory(dynamicForm.get("category"));
        item.setAmount(dynamicForm.get("amount"));
        item.save();
        return redirect(routes.Administrator.index());
    }

    public Result removeItem(Http.Request request, Long id){
/*        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        Long id = Long.parseLong(dynamicForm.get("itemId"));*/
        Item item = Item.getItemById(id);
        item.delete();
        item.save();
        return redirect(routes.Administrator.index());
    }

}
