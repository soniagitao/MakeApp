package com.example.makeapp.models;

public class MakeupLogo {
    private int logo;
    private String name;
    private String title;

    public MakeupLogo(int logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    public MakeupLogo(int s, String s1, String rbc_news) {
    }

    public int getLogo() {

        return logo;
    }

    public void setLogo(int logo) {

        this.logo = logo;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

}
