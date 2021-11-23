package com.company.model;

import com.company.model.gametype.GameType;
import com.company.model.gametype.types.Action;
import com.company.model.gametype.types.Sport;

import java.util.ArrayList;

public class Post {
    private int numberPost;
    private String typeEng;
    private String typeDisplay;
    private boolean available ;
    private ArrayList<GameType>  games ;

    public Post(){}
    public Post(int numberPost,String typeEng,String typeDisplay,ArrayList<GameType> games,boolean available){
        this.numberPost = numberPost;
        this.typeEng = typeEng;
        this.typeDisplay = typeDisplay;
        this.available = available;
        this.games = games;

    }

    public  String isAvailable() {
        String isAvailable = this.available ? "Available" : "Not available";
        return isAvailable ;
    }
    public  boolean available() {

        return this.available ;
    }

    public  void setAvailable(boolean available) {
        this.available = available;
    }

    public int getNumberPost() {
        return numberPost;
    }

    public void setNumberPost(int numberPost) {
        this.numberPost = numberPost;
    }

    public String getTypeEng() {
        return typeEng;
    }

    public void setTypeEng(String typeEng) {
        this.typeEng = typeEng;
    }

    public String getTypeDisplay() {
        return typeDisplay;
    }

    public void setTypeDisplay(String typeDisplay) {
        this.typeDisplay = typeDisplay;
    }

    public ArrayList<GameType> getGamesType() {

        ArrayList game = new ArrayList<>();

        for(GameType gameN : this.games)
            game.add(gameN.getClass().getSimpleName() +" : "+ gameN.getName());

        return game;
    }
    public ArrayList<GameType> getGames() {
        return this.games;
    }

    public void setGames(ArrayList<GameType> games) {
        this.games = games;
    }
}
