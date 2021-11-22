package com.company.helpers;

import com.company.controller.PlayerController;

import java.util.Scanner;

import static com.company.helpers.Helper.print;
public class MenuHelper {
       public static Scanner scaner = new Scanner(System.in);
        public static void menu(){


            print("1- Add player \n");
            print("2- View players \n");
            print("3- View post \n");
            print("4- View the players are waiting \n");
            print("Exit");



            String chose = scaner.nextLine();
            try{
                switch (chose){
                    case "1" :
                        print("************************* Games List *************************");
                        PlayerController player = new PlayerController();
                        player.addplayer();

                        break;
                    case "2"  : print("View players"); break;


                    default: print("This chose not in menu !!!");
                }
            } catch (Exception e) {
                print("Error !!");
                menu();
            }




        }


}
