/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Model;

/**
 *
 * @author sinic
 */
public class User {
    private String fullname, PhoneNumber, Gender, user, password, position;

    public User() {
    }

    public User(String fullname, String PhoneNumber, String Gender, String user, String password, String position) {
        this.fullname = fullname;
        this.PhoneNumber = PhoneNumber;
        this.Gender = Gender;
        this.user = user;
        this.password = password;
        this.position = position;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "User{" + "fullname=" + fullname + ", PhoneNumber=" + PhoneNumber + ", Gender=" + Gender + ", user=" + user + ", password=" + password + ", position=" + position + '}';
    }
    
}
