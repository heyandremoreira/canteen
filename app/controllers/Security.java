package controllers;

import models.User;
import play.mvc.With;

/*@With(Secure.class)*/
/*public class Security extends Secure.Security {

    static boolean authenticate(String username, String password) {
        User user = User.find("byEmail", username).first();
        return user != null && user.password.equals(password);
    }
}*/
