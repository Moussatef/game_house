package com.company;

import com.company.helpers.MenuHelper;
import com.company.model.Post;
import com.company.model.gametype.GameType;
import com.company.model.gametype.types.Action;
import com.company.model.gametype.types.Sport;

import java.util.ArrayList;

import static com.company.helpers.Helper.*;

public class Main {



    public static void main(String[] args) {
	// write your code here
        //Post p1 = new Post(1,"PS4","Samsung", new String[]{"FIFA2020", "PES2021","Basket"},false);
       // System.out.println( "Post Number : " +p1.getNumberPost()+"\nGames : " +p1.getGames()+" \nDisplay type : " +p1.getTypeDisplay()+" \nPlay type : " +p1.getTypeEng());
        /*
       print( PackG.HALF_HOUR.toString());
       print( PackG.HOUR.toString());
       print( PackG.TWO_HOURS.toString());
       print( PackG.FAVE_HOURS.toString());
       print( PackG.ALL_JOURNEY.toString());
         */

        MenuHelper.menu();
/*
        ArrayList<GameType> games = new ArrayList<>();
        games.add(new Sport("FIFA2021"));
        games.add(new Sport("PES2021"));
        games.add(new Action("GTA5"));
        games.add(new Action("WWA"));

        Post p1 = new Post(1,"PS4","Samsung",games ,false);
        System.out.println( "Post Number : " +p1.getNumberPost()+"\nGames : " +p1.getGames()+" \nDisplay type : " +p1.getTypeDisplay()+" \nPlay type : " +p1.getTypeEng()+"\n"+p1.isAvailable());


 */
        //for(GameType game : games)
         //print(game.getClass().getSimpleName() +" : "+ game.getName());
    }
}
