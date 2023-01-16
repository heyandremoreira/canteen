/*
package models;

import akka.http.javadsl.Http;

import java.net.Authenticator;
import java.util.Optional;

public class UserAuth extends Authenticator {
    @Override
    public Optional<User> getUser(Http.Context ctx) {
        String email = ctx.session().get("email");
        if (email != null) {
            User user = User.findByEmail(email);
            if (user.role.equals("administrator")) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}*/
