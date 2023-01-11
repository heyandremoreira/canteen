package models;

import io.ebean.Model;

import javax.persistence.*;

@Entity
public class Dish extends Model {
    private Long id;
    private String name;
    private String description;
    private String type;

    @ManyToOne
    private Menu menu;

    public Dish(Long id, String name, String description, String type){
        this.id=id;
        this.name=name;
        this.description=description;
        this.type=type;
        this.menu=menu;
    }
}
