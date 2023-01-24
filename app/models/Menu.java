package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "menu")
public class Menu extends Model {
    @Id
    private Long id;
    private LocalDate date;

    @OneToMany(mappedBy = "menu")
    private List<Dish> dishes;

    @ManyToOne
    private Canteen canteen;

    private static final Finder<Long, Menu> finder = new Finder<>(Menu.class);
    public static Menu getMenuById(Long id){
        return finder.byId(id);
    }

    public Menu(Long id, Type type, LocalDate date){
        this.id=id;
        this.date=date;
    }



    public static Menu getMenuByDate(LocalDate date, Long canteenId) {
        return finder.query().where().eq("date", date).and().eq("canteen_id", canteenId).setMaxRows(1).findOne();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Canteen getCanteen() {
        return canteen;
    }

    public void setCanteen(Canteen canteen) {
        this.canteen = canteen;
    }
}
