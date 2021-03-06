package com.example.makeapp.models;

public class MakeupLogo {
    private int logo;
    private String name;
    private int RowID;

    public MakeupLogo(int logo , String name, int rowID) {
        this.logo = logo;
        this.name = name;
        this.RowID = rowID;
    }

    public MakeupLogo(int s, String makeup) {
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

    public int getRowID() {
        return RowID;
    }

    public void setRowID(int rowID) {
        RowID = rowID;
    }
}
