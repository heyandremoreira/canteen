package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "item")
public class Item extends Model {
    @Id
    public Long id;
    public String name;
    public String amount;
    public String category;
    private static final Finder<Long, Item> finder = new Finder<>(Item.class);

    public static List<Item> getItemList(){
        return finder.all();
    }

    public static Item getItemById(Long id) {
        return finder.byId(id);
    }

    public Item (Long id, String name, String amount, String category){
        this.id=id;
        this.name=name;
        this.amount=amount;
        this.category=category;
    }

    public Item(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    /*@Column(unique = true)
    private String name;*/
}
