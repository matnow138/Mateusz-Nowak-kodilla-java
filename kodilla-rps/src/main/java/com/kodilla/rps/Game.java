package com.kodilla.rps;

import java.util.Collection;
import java.util.Collections;

public class Game {

    String playerMove;
    int computerMove;

    //Creating dependencies

    private Shapes rock = new Shapes("rock", Collections.singletonList("scissors"));
    private Shapes paper = new Shapes("paper", Collections.singletonList("rock"));
    private Shapes scissors = new Shapes("scissors", Collections.singletonList("paper"));

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

        switch (playerMove) {
            case "1":
                return rock.confront(computerMoveTranslate(computerMove));
            case "2":
                return paper.confront(computerMoveTranslate(computerMove));
        }
                return scissors.confront(computerMoveTranslate(computerMove));
    }
}
