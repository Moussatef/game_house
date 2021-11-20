package com.company.model;

import java.util.Arrays;

public class Post {
    private int numberPost;
    private String typeEng;
    private String typeDisplay;
    private static boolean available = true;
    private String[] games ;

    public Post(){}
    public Post(int numberPost,String typeEng,String typeDisplay,String[] games,boolean available){
        this.numberPost = numberPost;
        this.typeEng = typeEng;
        this.typeDisplay = typeDisplay;
        this.available = available;
        this.games = games;

    }

    public static boolean isAvailable() {
        return available;
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

    public String getGames() {
        return Arrays.toString(games);
    }

    public void setGames(String[] games) {
        this.games = games;
    }
}
