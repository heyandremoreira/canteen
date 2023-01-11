package models;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login extends Model{
    private String username;
    private String password;

    public Login(String username, String password){
        this.username=username;
        this.password=password;
    }

    public String getEmail() {
        return username;
    }

    public void setEmail(String email) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
