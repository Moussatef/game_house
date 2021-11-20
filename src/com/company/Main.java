package com.company;

import com.company.helpers.MenuHelper;
import com.company.model.gametype.GameType;
import com.company.model.gametype.types.Sport;

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

        GameType gameType=new Sport("FIFA2021");
        print(gameType.getName());
    }
}
