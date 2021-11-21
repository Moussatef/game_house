package com.company.helpers;

import java.util.Scanner;

import static com.company.helpers.Helper.print;
public class MenuHelper {

        public static void menu(){
            Scanner scaner = new Scanner(System.in);

            print("1- Add player \n");
            print("2- View players \n");
            print("3- View post \n");
            print("4- View the players are waiting \n");
            print("Exit");
            String chose = scaner.nextLine();

            switch (chose){
                case "1" : print("Add Player"); break;
                case "2"  : print("View players"); break;


                default: print("This chose not in menu !!!");
            }



        }
}
