package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "feedback")
public class Feedback extends Model {
    private String description;

    @ManyToOne
    private Ticket ticket;

    private static final Finder<String, Feedback> finder = new Finder<>(Feedback.class);
    public static List<Feedback> getFeedback(){
        return finder.all();
    }

    public Feedback(String description){
        this.description=description;
    }
}
