package com.kodilla.rps;

public class Game {

    String playerMove;
    int computerMove;

    public Game(String playerMove, int computerMove) {
        this.playerMove = playerMove;
        this.computerMove = computerMove;
    }

    //Translating computer moves to String
    public String computerMoveTranslate(int computerMove){
        if(computerMove==0){
            return "rock";
        } else if (computerMove==1) {
            return "scissors";
        }
        return "paper";
    }

    //Translating player move

    public String playerMoveTranslate(String playerMove){
        if(playerMove.equals("1")){
            return "rock";
        } else if (playerMove.equals("2")) {
            return "paper";
        }
            return "scissors";

    }


    public int fightResult(){
        //Verification if player move beats computer move
        //Overall logic - program check list for player move and if computer move is in that list -player wins, otherwise - computer wins
        if(playerMoveTranslate(playerMove).equals("rock") && Shapes.rockWins.contains(computerMoveTranslate(computerMove))){
            return 1;
        } else if(playerMoveTranslate(playerMove).equals("paper") && Shapes.paperWins.contains(computerMoveTranslate(computerMove))){
            return 1;
        } else if(playerMoveTranslate(playerMove).equals("scissors") && Shapes.scissorsWins.contains(computerMoveTranslate(computerMove))){
            return 1;
        } else if(playerMoveTranslate(playerMove).equals(computerMoveTranslate(computerMove))){
            return 2;
        }
        return 0;

    }





}
