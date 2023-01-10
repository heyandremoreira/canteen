package models;

import io.ebean.Model;

import javax.persistence.ManyToOne;
import java.util.Date;

public class CanteenMenu extends Model {
    private Long id;
    private Date date;

    @ManyToOne
    private Canteen canteen;

    @ManyToOne
    private Menu menu;
}
