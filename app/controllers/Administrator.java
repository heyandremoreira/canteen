package controllers;

import io.ebean.Finder;
import models.User;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

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
        List<User> users = User.getUserList();
        return ok(views.html.Administrator.userslist.render(users, request));
    }

    private static final Finder<Long, User> finder = new Finder<>(User.class);
    public Result authapproval(Http.Request request) {
        List<User> approvedUserList = finder.query().where().eq("status","approved").findList();
        return ok(views.html.Administrator.authapproval.render(approvedUserList, request));

        /*List<User> users = User.getUserList();
        return ok(views.html.Administrator.authapproval.render(users, request));*/
    }

    public Result approveUser(Http.Request request, Long id){
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        User user = new User();
        user.setUsername(dynamicForm.get("user"));
        user.save();
        return redirect(routes.Administrator.userslist());
    }

    public Result removeUser(Http.Request request, Long id){
        User user = User.getUserById(id);
        user.delete();
        user.save();
        return redirect(routes.Administrator.userslist());
    }

    public Result denyUser(Http.Request request, Long id){
        User user = User.getUserById(id);
        user.delete();
        user.save();
        return redirect(routes.Administrator.authapproval());
    }

}
