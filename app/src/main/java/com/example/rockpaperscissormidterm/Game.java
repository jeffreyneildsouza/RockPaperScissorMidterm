package com.example.rockpaperscissormidterm;

public class Game {
    private String id;
    private String first_name;
    private String last_name;
    private String user_choice;
    private String android;
    private String winner;

    public Game(){
        //require empty constructor
    }

    public Game(String id, String first_name, String last_name, String user_choice, String android, String winner){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_choice = user_choice;
        this.android = android;
        this.winner = winner;
    }

    public String getId(){

        return id;
    }
    public String getFirstName(){

        return first_name;
    }

    public String getLastName(){

        return last_name;
    }
    public String getAndroid(){

        return android;
    }

    public String getUser(){

        return user_choice;
    }

    public String getWinner(){

        return winner;
    }

}
