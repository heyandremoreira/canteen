/*package controllers;

import com.google.inject.Inject;
import play.data.Form;
import play.mvc.Result;
import views.html.login;

import static play.mvc.Results.ok;

public class Application {

    public static class Login {
        public String email;
        public String password;
    }

    private final Form form;

    @Inject
    public Application(Form form) {
        this.form = form;
    }

    public static Result login(String username, String password) {
        return ok(login.render(form(Login.class))
        );
    }

    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
                routes.Application.login()
        );
    }

    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session().clear();
            session("email", loginForm.get().email);
            return redirect(
                    routes.Application.index()
            );
        }
    }

    public String validate() {
        if (User.authenticate(email, password) == null) {
            return "Invalid user or password";
        }
        return null;
    }

}*/