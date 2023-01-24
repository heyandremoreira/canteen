package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="dish")
public class Dish extends Model {
    @Id
    private Long id;
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    private Type type;
    private double value;

    @ManyToOne
    private Menu menu;

    private int dishQuantity;

    @OneToMany(mappedBy = "dish")
    private List<Ticket> tickets;

    private static final Finder<Long, Dish> finder = new Finder<>(Dish.class);
    public static List<Dish> getDishList(){
        return finder.all();
    }
    public static Dish getDishById(Long id){
        return finder.byId(id);
    }

    public Dish(String name, String description, double value, int dishQuantity){
        this.name=name;
        this.description=description;
        this.type=type;
        this.value=value;
        this.menu=menu;
        this.dishQuantity=dishQuantity;
    }

    public static List<Dish> getDishesFromMenu(Menu menu) {
        return finder.query().where().eq("menu_id", menu.getId()).findList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getDishQuantity() {
        return dishQuantity;
    }

    public void setDishQuantity(int dishQuantity) {
        this.dishQuantity = dishQuantity;
    }
}
