package models;

import io.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserRole extends Model {
    @Id
    private Long id;

    @ManyToOne
    @Column(nullable = false)
    private User user;

    @ManyToOne
    @Column(nullable = false)
    private Role role;

    // If this role is currently active for this user
    @Column(nullable = false, columnDefinition = "TINYINT DEFAULT 0")
    private Boolean is_active;
}
