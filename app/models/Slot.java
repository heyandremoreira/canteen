package models;

import controllers.Student;
import io.ebean.Model;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.LocalTime;

public class Slot extends Model{
    @Id
    @GeneratedValue
    private long id;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;

    private LocalTime time;

    @ManyToOne
    private Student student;

    @OneToOne
    private Menu menu;

    public Slot(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
