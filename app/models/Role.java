package models;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role extends Model{
    @Id
    @GeneratedValue
    private long id;
    private String username;
    public Role(String username) {
        this.username = username;
    }
    public Role() {
    }

    public String getRole(){
        switch (username) {
            case "ROLE_ADMIN":
                return "Administrator";
            case "ROLE_MANAGER":
                return "Manager";
            case "ROLE_STUDENT":
                return "Student";
            default:
                return "User";
        }
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}