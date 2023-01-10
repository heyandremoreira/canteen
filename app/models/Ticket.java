package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ticket")
public class Ticket extends Model {

    @Id
    private Long id;

    @ManyToOne 
    private User user;

    @ManyToOne
    private Menu menu;

/*  @OneToMany
    private Feedback feedback;*/

    private static final Finder<String, Ticket> finder = new Finder<>(Ticket.class);
    public static List<Ticket> getTicket(){
        return finder.all();
    }

}