package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ticket")
public class Ticket extends Model{

    @Id
    private Long id;

    @ManyToOne 
    private User user;

    @ManyToOne
    private Dish dish;

    private LocalDate localDate;

    private Canteen canteen;

    public Ticket(User user, Dish dish, LocalDate localDate, Canteen canteen) {
        this.user = user;
        this.dish = dish;
        this.localDate=localDate;
        this.canteen=canteen;
    }

    /*  @OneToMany
    private Feedback feedback;*/

    private static final Finder<String, Ticket> finder = new Finder<>(Ticket.class);
    public static List<Ticket> getTicket(){
        return finder.all();
    }

}