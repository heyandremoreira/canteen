package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "category")
public class Category extends Model{
    @Id
    public int id;
    public String name;
    private static final Finder<Long, Category> finder = new Finder<>(Category.class);

    public Category(int id, String name){
        this.id=id;
        this.name=name;
    }

    public static List<Category> getCategoryList() {
        return finder.all();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
