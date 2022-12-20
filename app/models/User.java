package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends Model {
    @Id
    private Long id;
    private String username;
    private String password;

    private Role role;
    private String token;

    @Column(unique = true)
    private String email;

    private static final Finder<Long, User> finder = new Finder<>(User.class);

    public static User getUserById(Long id){
        return finder.byId(id);
    }

    public static User getUserByEmail(String email){
        return finder.query().where().eq("Email", email).setMaxRows(1).findOne();
    }

    public User(Long id, String username, String password, Role role, String token, String email){
        this.id=id;
        this.username=username;
        this.password=password;
        this.role=role;
        this.token=token;
        this.email=email;
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

    public void setUsername(String firstUsername) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
