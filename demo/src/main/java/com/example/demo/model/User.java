package com.example.demo.model;

public class User {

    public int id;
    public String name;
    public String collegeName;

    public User(){}
    public User(int id, String name, String collegeName){
        this.id=id;
        this.name=name;
        this.collegeName=collegeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
