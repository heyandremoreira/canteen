package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "canteen")
public class Canteen extends Model {
    private String description;
    private String title;
    private Date date;
    private String image;
    private double value;
    private String adress;

    private static final Finder<String, Canteen> finder = new Finder<>(Canteen.class);
    public static List<Canteen> getCanteen(){
        return finder.all();
    }

    public Canteen(String description, String title, Date date, String image, double value, String adress){
        this.description=description;
        this.title=title;
        this.date=date;
        this.image=image;
        this.value=value;
        this.adress=adress;
    }
}
