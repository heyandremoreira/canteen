package models;

public class Login {
    private String username;
    private String password;

    public String getEmail() {
        return username;
    }

    public void setEmail(String email) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}