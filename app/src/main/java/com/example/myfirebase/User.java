package com.example.myfirebase;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    private String name;
    private String email;
    private String age;
    private String spinner;

    public User(String name, String email, String age, String userSpinner) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.spinner = userSpinner;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public String getSpinner() {
        return spinner;
    }
}
