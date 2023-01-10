package models;

import io.ebean.Model;

public class Dish extends Model {
    private Long id;
    private String name;
    private String description;
    private double value;

    public Dish(Long id, String name, String description, double value){
        this.id=id;
        this.name=name;
        this.description=description;
        this.value=value;
    }
}
