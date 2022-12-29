package models;


import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "menu")
public class Menu extends Model {
    private String description;
    private Date date;
    private double value;

    public Menu(String description, Date date, double value){
        this.description=description;
        this.date=date;
        this.value=value;
    }
}
