package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ticket")
public class Ticket extends Model {
    private String description;
    private Date date;
    private double value;

    private static final Finder<String, Ticket> finder = new Finder<>(Ticket.class);
    public static List<Ticket> getTicket(){
        return finder.all();
    }

    public Ticket (String description, Date date, double value){
        this.description=description;
        this.date=date;
        this.value=value;
    }
}
