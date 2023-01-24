package controllers;

import models.Canteen;
import models.Status;
import models.User;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class MainController extends Controller {
    private final FormFactory formFactory;

    @Inject
    public MainController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /*public Result signupProcess(Http.Request request) {
        Form<User> form = formFactory.form(User.class).bindFromRequest();
        if (form.hasErrors()) {
            return badRequest(form.errorsAsJson());
        }
        User newUser = form.get();
        String role = form.rawData().get("role");
        newUser.setRole(role);
        newUser.save();
        return ok("User created successfully");
    }*/

    /*public Result signupProcess(Http.Request request, Long id) {
        User user = User.getUserById(id);
        return redirect(routes.HomeController.login());
    }*/

        /*if (selecao == "administrator"){
            User user = new User(username, email, password, administrator);
        } else if (selecao = "manager_arc"){
            User user = new User(username, email, password, manager_arc);
        } else if (selecao == "student"){
            User user = new User(username, email, password, student);
        }
        return redirect(routes.HomeController.landing());
        }*/

    public Result landing(Http.Request request) {
        return ok(views.html.landing.render());
    }

    public Result home(Http.Request request) {
        List<Canteen> canteens = Canteen.getCanteenList();
        return ok(views.html.home.render(canteens));
    }

    public Result profile(Http.Request request) {
        return ok(views.html.profile.render());
    }

    public Result recoverpassword(Http.Request request) {
        return ok(views.html.recoverpassword.render());
    }

    public Result termsofuse(Http.Request request) {
        return ok(views.html.Settings.termsofuse.render());
    }

    public Result privacypolicy(Http.Request request) {
        return ok(views.html.Settings.privacypolicy.render());
    }

    public Result help(Http.Request request) {
        return ok(views.html.Settings.help.render());
    }

    public Result buy(Http.Request request, Long id){
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        User user = User.getUserById(id);
        user.setStatus(Status.approved);
        user.update();
        return redirect(routes.Administrator.authapproval());
    }

}