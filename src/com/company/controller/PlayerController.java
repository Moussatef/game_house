package com.company.controller;

import com.company.model.Post;
import com.company.model.gametype.GameType;
import com.company.model.gametype.types.Action;
import com.company.model.gametype.types.Sport;
import static com.company.helpers.Helper.print;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class PlayerController {
    public static Scanner scanner = new Scanner(System.in);
    public  ArrayList<GameType>  gameTypeArrayList = new ArrayList<>();


    public void fillListGame(){
        gameTypeArrayList.add(new Sport("FIFA2021"));
        gameTypeArrayList.add(new Sport("PES2021"));
        gameTypeArrayList.add(new Sport("Riders Republic"));
        gameTypeArrayList.add(new Sport("EA SPORTS NHL"));
        gameTypeArrayList.add(new Sport("NBA 2K22"));
        gameTypeArrayList.add(new Sport("Tennis world tour 2"));
        gameTypeArrayList.add(new Sport("NBA 2K2"));
        gameTypeArrayList.add(new Action("GTA5"));
        gameTypeArrayList.add(new Action("WWA"));
        gameTypeArrayList.add(new Action("CALL OF DUET"));
        gameTypeArrayList.add(new Action("Battlefield 2042"));
        gameTypeArrayList.add(new Action("The Demon World"));
        gameTypeArrayList.add(new Action(" Back 4"));
        gameTypeArrayList.add(new Action("ALL-STAR BRAWL"));
        gameTypeArrayList.add(new Action("World War 2"));
        gameTypeArrayList.add(new Action("Bonfire Peaks"));
        gameTypeArrayList.add(new Action("Ghostrunner"));
        gameTypeArrayList.add(new Action("DEATHLOOP"));
        gameTypeArrayList.add(new Action("Death Stranding"));
    }


    public ArrayList<GameType> arrayListGame(){

        ArrayList<GameType> gameReturn = new ArrayList<>();
        Random random = new Random();
        for (int i = 0 ; i < 4 ; i++){
            int x = random.nextInt(gameTypeArrayList.size());
            gameReturn.add(gameTypeArrayList.get(x));
        }
        return  gameReturn;
    }

    public boolean

    public  void addplayer(){
        ArrayList<Post> postArrayList = new ArrayList<>();
        fillListGame();


        postArrayList.add(new Post(1,"PlayStation5","Samsung",arrayListGame() ,false));
        postArrayList.add(new Post(2,"PlayStation5","Asus",arrayListGame() ,true));
        postArrayList.add(new Post(3,"Xbox","HP",arrayListGame() ,true));
        postArrayList.add(new Post(4,"Xbox","Asus",arrayListGame() ,true));
        postArrayList.add(new Post(5,"Xbox","Asus",arrayListGame() ,false));
        postArrayList.add(new Post(6,"Nintendo switch","Dell",arrayListGame() ,true));
        postArrayList.add(new Post(7,"Nintendo switch","Dell",arrayListGame() ,false));

 int cmp = 0;
        for (Post p1 : postArrayList) {

            print("\t\t\t\t\t********************************** POST NUMBER "+ (cmp+1) + "**********************************");
            print("\t\t\t\t\tPost Number : " + p1.getNumberPost() + "\n\t\t\t\t\tGames : " + p1.getGames() + " \n\t\t\t\t\tDisplay type : " + p1.getTypeDisplay() + " \n\t\t\t\t\tPlay type : " + p1.getTypeEng() + "\n\t\t\t\t\t" + p1.isAvailable());
            print("\t\t\t\t\t**********************************************************************************");
            cmp++;
        }
        for (GameType game : gameTypeArrayList)
           print(game.getName().toUpperCase());
        System.out.print("chose a game : ");
        String game = scanner.nextLine();





    }
}
