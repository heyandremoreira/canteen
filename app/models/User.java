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
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;

    private static final Finder<Long, User> finder = new Finder<>(User.class);

    public static User getUserById(Long id){
        return finder.byId(id);
    }

    public static User getUserByEmail(String email){
        return finder.query().where().eq("Email", email).setMaxRows(1).findOne();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
