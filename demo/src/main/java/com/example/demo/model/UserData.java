package com.example.demo.model;

public class UserData {
    private String name;
    private String age;

    public UserData() {
    }
    public UserData(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    
}
