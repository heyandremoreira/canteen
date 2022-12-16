package models;

public class Profile {
    private String name;
    private String nationality;
    private String adress;
    private String email;
    private String nif;


    public Profile(String name, String nationality, String adress, String email, String nif) {
        this.name = name;
        this.nationality = nationality;
        this.adress = adress;
        this.email = email;
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
