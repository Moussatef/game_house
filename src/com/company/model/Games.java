package com.company.model;

import com.company.model.gametype.GameType;

public class Games {
    private String name;
    private GameType type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameType getType() {
        return type;
    }

    public void setType(GameType type) {
        this.type = type;
    }
}
