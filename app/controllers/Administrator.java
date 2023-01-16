package controllers;

import io.ebean.Finder;
import models.Status;
import models.User;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

/*@Security.Authenticated(UserAuth.class)*/
public class Administrator extends Controller {
    private final FormFactory formFactory;

    @Inject
    public Administrator(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result administrator(Http.Request request) {
        return ok(views.html.Administrator.administrator.render());
    }

    public Result createcanteen(Http.Request request) {
        return ok(views.html.Administrator.createcanteen.render());
    }
    public Result managecanteens(Http.Request request) {
        return ok(views.html.Administrator.managecanteens.render());
    }

    public Result userslist(Http.Request request) {
        List<User> approvedUsersList = finder.query().where().eq("status","approved").findList();
        return ok(views.html.Administrator.userslist.render(approvedUsersList, request));
    }

    private static final Finder<Long, User> finder = new Finder<>(User.class);
    public Result authapproval(Http.Request request) {
        List<User> pendingUsersList = finder.query().where().eq("status","pending").findList();
        return ok(views.html.Administrator.authapproval.render(pendingUsersList, request));
    }

    public Result approveUser(Http.Request request, Long id){
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        User user = User.getUserById(id);
        user.setStatus(Status.approved);
        user.update();
        return redirect(routes.Administrator.authapproval());
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
