/*
package controllers;

import models.User;
import play.api.data.Form;
import views.html.login;
import javax.xml.transform.Result;
import static play.mvc.Results.ok;

public class Application {
    public static class Login {
        public String email;
        public String password;
    }

    public static Result login() {
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

/*verifyAuthUser();*/
