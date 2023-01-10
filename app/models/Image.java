package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "image")
public class Image extends Model {

    @Id
    private Long id;
    private String name;
    private String image;
    private String description;

    @OneToOne (mappedBy = "image")
    private User user;

    @OneToOne (mappedBy = "image")
    private Canteen canteen;

    private static final Finder<String, Image> finder = new Finder<>(Image.class);

    public static List<Image> getImage() {
        return finder.all();
    }

    public Image(String name, String image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }

}
