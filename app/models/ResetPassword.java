package models;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reset_password")
public class ResetPassword extends Model{
    private String token;
    private String password;
    private String confirmPassword;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
