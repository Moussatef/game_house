package com.company.controller;

import com.company.enums.PackGame;
import com.company.model.Person;
import com.company.model.Post;
import com.company.model.gametype.GameType;
import com.company.model.gametype.types.Action;
import com.company.model.gametype.types.Sport;

import javax.lang.model.type.NullType;

import static com.company.helpers.Helper.*;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class PlayerController {
    public static Scanner scanner = new Scanner(System.in);
    public  ArrayList<GameType>  gameTypeArrayList = new ArrayList<>();
    public  ArrayList<Post> postArrayList = new ArrayList<>();
    public ArrayList<Post> postFind = new ArrayList<>();


    public void fillListPost(){
        postArrayList.add(new Post(1,"PlayStation5","Samsung",arrayListGame() ,false));
        postArrayList.add(new Post(2,"PlayStation5","Asus",arrayListGame() ,true));
        postArrayList.add(new Post(3,"Xbox","HP",arrayListGame() ,true));
        postArrayList.add(new Post(4,"Xbox","Asus",arrayListGame() ,true));
        postArrayList.add(new Post(5,"Xbox","Asus",arrayListGame() ,false));
        postArrayList.add(new Post(6,"Nintendo switch","Dell",arrayListGame() ,true));
        postArrayList.add(new Post(7,"Nintendo switch","Dell",arrayListGame() ,false));

    }
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
        gameTypeArrayList.add(new Action("Back 4"));
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

    public boolean searchGame(String game){

        for(GameType games : gameTypeArrayList)
            if(game.equals(games.getName().toUpperCase()))
                return true;


        return false;


    }
    public void searchPost(String game){

        ArrayList<Post> post = new ArrayList<>();
        ArrayList<GameType> games = new ArrayList<>();

        for (Post posts : postArrayList) {
            games = posts.getGames();
            for (GameType g : games)
                if (game.equals(g.getName().toUpperCase())) {
                    if (posts.available()) {
                        print("\t\t\t\t\t********************************** POST AVAILABLE NOW **********************************");
                        print("\t\t\t\t\tPost Number : " + posts.getNumberPost() + "\n\t\t\t\t\tGames : " + posts.getGamesType() + " \n\t\t\t\t\tDisplay type : " + posts.getTypeDisplay() + " \n\t\t\t\t\tPlay type : " + posts.getTypeEng() + "\n\t\t\t\t\t" + posts.isAvailable());
                        print("\t\t\t\t\t**********************************************************************************");
                        postFind.add(posts);
                    } else
                        print("Post Number : " + posts.getNumberPost()+" is not available for now");
                }
        }



    }

    public boolean checkPost(int nb_post){

        for (Post p : postFind)
            if (p.getNumberPost() == nb_post){
                postFind.clear();
                postFind.add(p);
                return  true;
            }

        return false;
    }

    public  void addplayer(){
        HashSet<String> hashListGame = new HashSet<>();



        //Method Fill List Game
        fillListGame();
        //Method Fill List Post
        fillListPost();
        //show list post exist
        int cmp = 0;
        for (Post p1 : postArrayList) {

            print("\t\t\t\t\t********************************** POST NUMBER "+ (cmp+1) + "**********************************");
            print("\t\t\t\t\tPost Number : " + p1.getNumberPost() + "\n\t\t\t\t\tGames : " + p1.getGamesType() + " \n\t\t\t\t\tDisplay type : " + p1.getTypeDisplay() + " \n\t\t\t\t\tPlay type : " + p1.getTypeEng() + "\n\t\t\t\t\t" + p1.isAvailable());
            print("\t\t\t\t\t**********************************************************************************");
            cmp++;
            for (GameType g : p1.getGames()){
                hashListGame.add(g.getName());
            }
        }

        //Show List games
        print("\t\t\t\t\t************************************** LIST GAME *********************************");
        for (String game : hashListGame) {
            print("\t\t\t\t\t**\t\t\t\t\t\t\t\t\t\t " + game.toUpperCase() );
        }
        print("\t\t\t\t\t**********************************************************************************");

        String game ;
        do{
            printl("chose a game : ");
            game = scanner.nextLine();
            if (!searchGame(game.toUpperCase()))
                print("This game is not exist in list game !!! try again ");
        }while (!searchGame(game.toUpperCase()));


        searchPost(game.toUpperCase());
        print(" Number of post available is : "+postFind.size());
        int numberPost ;
        try {
            if(postFind.size() > 0) {
                while (true) {
                    printl("Chose number post of this post available : ");
                    numberPost = scanner.nextInt();
                    if (checkPost(numberPost)) {
                        print(postFind.get(0).getNumberPost());
                        break;
                    } else {
                        print("This Post is not in chose !!!");
                        continue;
                    }
                }

                    printl("First Name : ");
                    String name = scanner.next();

                    printl("Last Name : ");
                    String lastname = scanner.next();

                    PackGame packGame;


                    print("***************************** { Chose Pack Period } *****************************");
                    print("***************************** { 1 - "+ PackGame.HALF_HOUR.toString() +" } *****************************");
                    print("***************************** { 2 - "+ PackGame.HOUR.toString()+" } *****************************");
                    print("***************************** { 3 - "+ PackGame.TWO_HOURS.toString()+" } *****************************");
                    print("***************************** { 4 - "+ PackGame.FAVE_HOURS.toString()+" } *****************************");
                    print("***************************** { 5 - "+ PackGame.ALL_JOURNEY.toString()+" } *****************************");

                    while (true){
                        printl("Puck number  : ");
                        int packNumber = scanner.nextInt();
                        switch(packNumber){
                            case 1 : packGame = PackGame.HALF_HOUR;
                            print(packGame);
                                break;
                            case 2 : packGame = PackGame.HOUR;
                                print(packGame);
                                break;
                            case 3 : packGame = PackGame.TWO_HOURS;
                                print(packGame);
                                break;
                            case 4 : packGame = PackGame.FAVE_HOURS;
                                print(packGame);
                                break;
                                case 5 : packGame = PackGame.ALL_JOURNEY;
                                print(packGame);
                                break;
                            default:
                                print("this number not exist in pack game !!!");
                                continue;
                        }

                        break;
                    }

                while (true) {
                        print("********* Enter start time ********* ");


                         System.out.print("Enter HOUR : ");
                         String hourP = scanner.next();
                         /*
                         if (Integer.parseInt(hourP) > 12 || Integer.parseInt(hourP) > 20 ){
                             print("This time is not available");
                             continue;
                         }

                          */

                         System.out.print("Enter Minutes :");
                        String minP = scanner.next();

                        /* if (Integer.parseInt(minP) > 60 || Integer.parseInt(minP) < 0 )
                         {
                             print("This time is not available");
                             continue;
                         }

                         */


                        if (Integer.parseInt(hourP) >= 8 || Integer.parseInt(hourP) < 12 || Integer.parseInt(hourP) >= 14 || Integer.parseInt(hourP) > 20 ) {
                            int hour = scanner.nextInt();
                            int min = scanner.nextInt();
                            LocalTime time = LocalTime.of(hour, min);
                            print(time);

                        } else {
                            print("This time is not available");
                            continue;
                        }


                    break;
                }
            }


        }catch(Exception e){
            print(e.getMessage());
        }


        /*
        for (Post p1 : postFind)
            print(p1.getGamesType());

         */


    }
}
