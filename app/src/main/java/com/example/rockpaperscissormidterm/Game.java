package com.example.rockpaperscissormidterm;

public class Game {
    private String id;
    private String first_name;
    private String last_name;
    private String user_choice;
    private String computer_choice;
    private String winner;

    public Game(){
        //require empty constructor
    }

    public Game(String id, String first_name, String last_name, String user_choice, String computer_choice, String winner){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_choice = user_choice;
        this.computer_choice = computer_choice;
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
    public String getComputer(){

        return computer_choice;
    }

    public String getUser(){

        return user_choice;
    }

    public String getWinner(){

        return winner;
    }

}
