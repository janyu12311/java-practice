package Difficult;

public class User {
    private String name;
    private String password;
    private String identity;
    private String number;

    public User() {
    }

    public User(String name, String password, String identity, String number) {
        this.name = name;
        this.password = password;
        this.identity = identity;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
