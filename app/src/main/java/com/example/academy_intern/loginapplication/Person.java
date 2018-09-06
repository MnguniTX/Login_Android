package com.example.academy_intern.loginapplication;

public class Person {

    private String name;
    private String surn;


    public Person()
    {
        this.name = "Thabo";
        this.surn = "Mnguni";
    }

    public  Person(String name, String surn)
    {
        this.name = name;
        this.surn = surn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurn(String surn) {
        this.surn = surn;
    }

    public String getName() {
        return name;
    }

    public String getSurn() {
        return surn;
    }
}
