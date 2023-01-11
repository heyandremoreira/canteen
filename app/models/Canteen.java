package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "canteen")
public class Canteen extends Model {
    @Id
    private Long id;
    private String name;
    private String description;
    private String address;

    @OneToMany(mappedBy = "canteen")
    private List<Menu> menus;

    @OneToOne
    private Image image;

    private static final Finder<String, Canteen> finder = new Finder<>(Canteen.class);

    public static List<Canteen> getCanteenList(){
        return finder.all();
    }

    public Canteen(Long id, String name, String description, String address){
        this.id=id;
        this.name=name;
        this.description=description;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
