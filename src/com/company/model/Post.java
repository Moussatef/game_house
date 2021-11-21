package com.company.model;

import com.company.model.gametype.GameType;

import java.util.ArrayList;

public class Post {
    private int numberPost;
    private String typeEng;
    private String typeDisplay;
    private static boolean available = true;
    private ArrayList<GameType>  games ;

    public Post(){}
    public Post(int numberPost,String typeEng,String typeDisplay,ArrayList<GameType> games,boolean available){
        this.numberPost = numberPost;
        this.typeEng = typeEng;
        this.typeDisplay = typeDisplay;
        this.available = available;
        this.games = games;

    }

    public static String isAvailable() {
        String isAvailable = available ? "Available" : "Not available";
        return isAvailable ;
    }

    public static void setAvailable(boolean available) {
        Post.available = available;
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

    public ArrayList<GameType> getGames() {
        ArrayList game = new ArrayList<>();
        for(GameType gameN : this.games)
            game.add(gameN.getClass().getSimpleName() +" : "+ gameN.getName());
        return game;
    }

    public void setGames(ArrayList<GameType> games) {
        this.games = games;
    }
}
