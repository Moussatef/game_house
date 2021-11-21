package com.company.controller;

import com.company.model.gametype.GameType;
import com.company.model.gametype.types.Action;
import com.company.model.gametype.types.Sport;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerController {
    public static Scanner scanner = new Scanner(System.in);

    public  void addplayer(){
        ArrayList<GameType> games = new ArrayList<>();
        games.add(new Sport("FIFA2021"));
        games.add(new Sport("PES2021"));
        games.add(new Action("GTA5"));
        games.add(new Action("WWA"));

        for (GameType game : games)
            System.out.println(game.getName());
        System.out.print("chose a game : ");
        String game = scanner.nextLine();





    }
}
