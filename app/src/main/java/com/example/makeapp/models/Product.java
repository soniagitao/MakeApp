package com.example.makeapp.models;

public class Product {
    private int logo;
    private String name;


    public Product(int logo , String name, int rowID) {
        this.logo = logo;
        this.name = name;
    }

    public Product(int s, String makeup) {
        logo = s;
        name = makeup;
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
