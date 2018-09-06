package com.example.academy_intern.loginapplication;

import java.util.ArrayList;

public class Datasource {

    static ArrayList<User> arrLi = new ArrayList<User>();

    private int index = 0;


    public void addUser(User u) {
        arrLi.add(u);
        index++;

    }

    public boolean isValid(String email, String pass) {

        for (User u : arrLi) {

            if (email.equalsIgnoreCase(u.getEmail()) && pass.equals(u.getPass())) {
                return true;
            }

        }
        return false;
    }


    public String all() {
        String dis = "LIST OF REGISTERED USERS\n";
        int index = 1;
        for (User u : arrLi) {
            dis += String.valueOf(index) + ". " + u.getEmail() + "\n";
            index++;

        }

        dis += "\nCLICK SEARCH TO FIND MORE INFORMATION";

        return dis;
    }


    public String display(String email) {

        String all = "";

        for (User u : arrLi) {
            if (email.equalsIgnoreCase(u.getEmail())) {

                all += String.format("Name : " + u.getName() + "\n" +
                        "Surname : " + u.getSurn() + "\n" +
                        "E-mail Address : " + u.getEmail());
            }
        }

        return all;
    }

    /*public boolean isPass(String pass, String corn_pass)
    {


        if(pass.equals(u.getPass()) && corn_pass.equals(u.getCorn_pass()))
        {
            return  true;
        }
        else
            return  false;
    }*/

    public boolean search(String email) {
        boolean isVai = false;


        for (User u : arrLi) {
            if (email.equalsIgnoreCase(u.getEmail())) {
                isVai = true;
            }
        }

        return isVai;
    }

    public boolean none(String email) {
        boolean isNone = false;
        for (User u : arrLi) {
            if (email.equalsIgnoreCase(u.getEmail())) {
                isNone = true;
            }
        }
        return isNone;
    }


    static public void password(String email, String pas) {

        String p = "";

        for (User u : arrLi) {
            if (email.equals(u.getEmail())) {
                u.getPass().replace(u.getPass(), pas);

            }
        }


    }

    public String cornfirmPas(String email) {

        String n = "";

        for (User u : arrLi) {
            if (email.equals(u.getEmail())) {

               n = u.getPass();
            }
        }
        return  n;

    }
}
