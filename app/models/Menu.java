package models;

import io.ebean.Finder;
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

    private static final Finder<Long, Menu> finder = new Finder<>(Menu.class);
    public static Menu getMenuById(Long id){
        return finder.byId(id);
    }

    public Menu(Long id, String description, Date date, double value){
        this.id=id;
        this.description=description;
        this.date=date;
        this.value=value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Canteen getCanteen() {
        return canteen;
    }

    public void setCanteen(Canteen canteen) {
        this.canteen = canteen;
    }
}
