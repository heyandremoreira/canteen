package models;

import io.ebean.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "menu")
public class Menu extends Model {
    @Id
    private Long id;
    private String description;
    private Date date;
    private double value;

    @OneToMany(mappedBy = "menu")
    private List<Dish> dishes;

    @ManyToOne
    private List<Ticket> tickets;

    @ManyToOne
    private Canteen canteen;

    public Menu(Long id, String description, Date date, double value){
        this.id=id;
        this.description=description;
        this.date=date;
        this.value=value;
    }
}
