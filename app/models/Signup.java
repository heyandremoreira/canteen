package models;

import io.ebean.Model;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "signup")
public class Signup extends Model{
    private String username;
    private String email;
    private String password;
    private String confirmPassword;

    public Signup(String username, String email, String password, String confirmPassword){
        this.username=username;
        this.email=email;
        this.password=password;
        this.confirmPassword=confirmPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
