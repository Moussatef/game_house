package com.company.model.gametype;

import java.util.Locale;

public class GameType {
    private String name;

    public GameType(String name){
        this.name = name;
    }
    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }
}
