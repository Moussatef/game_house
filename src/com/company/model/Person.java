package com.company.model;

import java.util.Date;

public class Person  {
    private String firstName ;
    private String lastName;
    private Games game;
    private Date dateStart;
    private Post post;
    private String codeGame;

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

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
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
}
