package com.example.academy_intern.loginapplication;



public class User extends Person {
    private String email;
    static private String pass;
    static private String corn_pass;

    public User() {
        super();
        this.email = "xolanithabo@gmail.com";
        this.pass = "1234";
        this.corn_pass = "1234";
    }

    public User(String name, String surn, String email, String pass, String corn_pass) {
        super(name, surn);
        this.email = email;
        this.pass = pass;
        this.corn_pass = corn_pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    static public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    static public String getCorn_pass() {
        return corn_pass;
    }

    public void setCorn_pass(String corn_pass) {
        this.corn_pass = corn_pass;
    }

    public String toStrin()
    {
        return String.format("Name : %s" + "\n" +
                "Surname : %s" + "\n" +
                "E-mal Address : %s", getName(), getSurn(), getEmail());
    }


}
