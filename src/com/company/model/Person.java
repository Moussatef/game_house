package com.company.model;

import com.company.enums.PackGame;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Person  {
    private String firstName ;
    private String lastName;
    private String game;
    private String dateStart;
    private Post post;
    private String codeGame;
    private PackGame timePeriod;

    public String getFirsName() {
        return firstName;
    }

    public void setFirsName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateStart() {
        return dateStart;
    }

    public boolean setDateStart(LocalTime dateStart) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");

        if (dateStart.getHour() >= 8 && dateStart.getHour() < 12 && dateStart.getHour() >= 14 && dateStart.getHour() < 20) {
            this.dateStart = dtf.format(dateStart);

            return true;
        }else{
            System.out.println("this time is not accepted !!!");
            return false;
        }
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    public String getCodeGame() {
        return codeGame;
    }

    public void setCodeGame(String codeGame) {
        this.codeGame = codeGame;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public PackGame getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(PackGame timePeriod) {
        this.timePeriod = timePeriod;
    }
}
