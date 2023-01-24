package controllers;

import models.User;
import org.mindrot.jbcrypt.BCrypt;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import scala.Dynamic;
import scala.xml.Null;

import javax.inject.Inject;

public class AuthController extends Controller {
    private static final String USERNAME = "username";
    private static final String ID = "id";
    private static final String ROLE_ID = "role_id";
    private final FormFactory formFactory;

    @Inject
    public AuthController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result signup(Http.Request request) {
        return ok(views.html.signup.render(request));
    }

    public Result signupProcess(Http.Request request) {
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        String username = dynamicForm.get("username");
        String email = dynamicForm.get("email");
        String password = BCrypt.hashpw(dynamicForm.get("password"), BCrypt.gensalt());
        if (username != null && email != null && password != null  && !username.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            User user = User.getUserByUsername(username);
            if (user == null) {
                user = new User(username, email, password);
                user.save();
                user.refresh();

            }
        }
        return redirect(routes.MainController.landing());
    }

    public Result login(Http.Request request) {
        return ok(views.html.login.render(request));
    }

    public Result loginProcess(Http.Request request) {
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        String username = dynamicForm.get("username");
        String password = dynamicForm.get("password");
        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {
            User user = User.getUserByUsername(username);
            if (user != null) {
                BCrypt.checkpw(dynamicForm.get("password"), user.getPassword());
                request.session().adding(USERNAME, username);
                request.session().adding(ID, user.getId().toString());
                //TODO implementar o getRole para a role que vai iniciar a sessão.
            }
        }
        return redirect(routes.MainController.home());
    }

    /*public Result logout(Http.Request request) {
        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest(request);
        String username = dynamicForm.get("username");
        String password = dynamicForm.get("password");
        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {
            User user = User.getUserByUsername(username);
            if (user != null) {
                BCrypt.checkpw(dynamicForm.get("password"), user.getPassword());
                request.session().removing(USERNAME, username);
                request.session().removing(ID, user.getId().toString());
            }
        }
        return redirect(routes.MainController.landing());
    }*/

}