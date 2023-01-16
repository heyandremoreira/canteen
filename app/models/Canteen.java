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

    public List<Menu> getMenus() {
        return menus;
    }

    private static final Finder<Long, Canteen> finder = new Finder<>(Canteen.class);
    public static List<Canteen> getCanteenList(){
        return finder.all();
    }
    public static Canteen getCanteenById(Long id){
        return finder.byId(id);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
