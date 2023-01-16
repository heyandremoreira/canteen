package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.mvc.Result;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="dish")
public class Dish extends Model {
    @Id
    private Long id;
    private String name;
    private String description;
    private String type;

    @ManyToOne
    private Menu menu;

    private static final Finder<Long, Dish> finder = new Finder<>(Dish.class);
    public static List<Dish> getDishList(){
        return finder.all();
    }
    public static Dish getDishById(Long id){
        return finder.byId(id);
    }

    public Dish(Long id, String name, String description, String type){
        this.id=id;
        this.name=name;
        this.description=description;
        this.type=type;
        this.menu=menu;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
