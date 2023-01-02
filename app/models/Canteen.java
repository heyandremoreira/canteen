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

    private String id;
    private String name;
    private String description;
    private String title;
    private Date date;
    private String image;
    private double value;
    private String adress;

    private static final Finder<String, Canteen> finder = new Finder<>(Canteen.class);
    public static List<Canteen> getCanteenList(){
        return finder.all();
    }

    public Canteen(String id, String name, String description, String title, Date date, String image, double value, String adress){
        this.id=id;
        this.name=name;
        this.description=description;
        this.title=title;
        this.date=date;
        this.image=image;
        this.value=value;
        this.adress=adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
