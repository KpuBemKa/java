package com.logic;

import com.data.Database;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class User {
    private Integer ID;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String mobileNumber;
    private String email;

    public User(Integer ID, String username, String password, String name, String surname, String mobileNumber, String email) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public static ArrayList<User> getAllUsers() {
        return Database.getAllUsers();
    }

    public static boolean newUser(String username, String password, String name, String surname, String mobileNumber, String email) {
        return Database.newUser(username, password, name, surname, mobileNumber, email);
    }

    public static boolean updateUser(Integer id, String username, String password, String name, String surname, String mobileNumber, String email) {
        if (!username.isBlank()) {
            if (!Database.updateUser(id, Database.Field.USERNAME, username))
                return false;
        }

        if (!password.isBlank()) {
            if (!Database.updateUser(id, Database.Field.PASSWORD, password))
                return false;
        }

        if (!name.isBlank()) {
            if (!Database.updateUser(id, Database.Field.NAME, name))
                return false;
        }

        if (!surname.isBlank()) {
            if (!Database.updateUser(id, Database.Field.SURNAME, surname))
                return false;
        }

        if (!mobileNumber.isBlank()) {
            if (!Database.updateUser(id, Database.Field.MOBILE_NUMBER, mobileNumber))
                return false;
        }

        if (!email.isEmpty()) {
            if (!Database.updateUser(id, Database.Field.EMAIL, email))
                return false;
        }

        return true;
    }

    public static boolean deleteUser(Integer id) {
        return Database.deleteUser(id);
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
