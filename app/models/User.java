package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends Model {
    @Id
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;

    private String nationality;

    private String address;
    @Column(unique = true)
    private String email;

    private String nif;
    private String token;

    @Enumerated(EnumType.STRING)
    @Column(length = 50, columnDefinition = "VARCHAR(50) default 'pending'")
    private Status status = Status.pending;

    @OneToMany(mappedBy = "user")
    private List<UserRole> userRoles;

    /*private List<Role> roles = new ArrayList<>(){
        roles.add("ADMIN");
        roles.add("MANAGER");
        roles.add("STUDENT");
    };*/

    @OneToMany(mappedBy = "user")
    private List<Ticket> tickets;

    @OneToOne
    private Image image;

    private static final Finder<Long, User> finder = new Finder<>(User.class);

    public static List<User> getUserList() {
        return finder.all();
    }
    public static List<User> getApprovedUsersList(){
        List<User> approvedUserList = finder.query().where().eq("status","approved").findList();
        return approvedUserList;
    }

    public static User getUserById(Long id) {
        return finder.byId(id);
    }

    public static User getUserByEmail(String email) {
        return finder.query().where().eq("Email", email).setMaxRows(1).findOne();
    }

    public User(Long id, String username, String password, String token, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.token = token;
        this.email = email;
    }

    public User() {
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
