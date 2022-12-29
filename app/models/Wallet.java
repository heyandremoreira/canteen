package models;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wallet")
public class Wallet extends Model{
    private double value;
    private String description;

    public Wallet(double value, String description){
        this.value=value;
        this.description=description;
    }
}
