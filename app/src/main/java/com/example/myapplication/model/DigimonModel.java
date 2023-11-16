package com.example.myapplication.model;

import java.util.List;

public class DigimonModel {

    private String name;
    private String lvl;

    private String img;

    public DigimonModel(String name, String lvl, String img) {
        this.name = name;
        this.lvl = lvl;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getLvl() {
        return lvl;
    }

    public String getImg() {
        return img;
    }
}
