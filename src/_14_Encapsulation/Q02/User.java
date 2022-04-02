package _14_Encapsulation.Q02;

import java.util.Scanner;

public class User {
    //filedları(encapsulated) id, username, password, active (boolean), signedIn (boolean)
    // olan User isimli bir class create ediniz.
    static Scanner scan = new Scanner(System.in);
    protected int ıd;
    protected String username;
    protected String password;
    protected boolean active;
    protected boolean signedIn;

//bütün fieldları parametre alan bir constructor tanımlayınız.
    public User(int ıd, String username, String password, boolean active, boolean sidnerIn) {
        this.ıd = ıd;
        this.username = username;
        this.password = password;
        this.active = true;
        this.signedIn = false;
    }

    public User() {

    }

    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() <6) {
            System.out.println("Sifre gecersiz lütfen yeniden deneyin");
            password=scan.next();
            setPassword(password);
        }else
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "ıd='" + ıd + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", sidnerIn=" + signedIn +
                '}';
    }



}
