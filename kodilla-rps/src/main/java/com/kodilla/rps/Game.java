package com.kodilla.rps;

import java.util.Collection;
import java.util.Collections;

public class Game {

    private final Shapes playerMove; //kazda zmienna od razu powina byc private final  i zmieniasz to tylko jesli potrzebujesz
    private final Shapes computerMove;

    //Creating dependencies

    private Shapes rock = new Shapes("rock", Collections.singletonList("scissors"));
    private Shapes paper = new Shapes("paper", Collections.singletonList("rock"));
    private Shapes scissors = new Shapes("scissors", Collections.singletonList("paper"));

    public Game(String playerMove, int computerMove) {
        this.playerMove = playerMove;
        this.computerMove = computerMove;

    }

    //Translating computer moves to String
    public Shapes computerMoveTranslate(int computerMove){  //nie zwracaj stringa tylko obiekt
        if(computerMove==0){
            return "rock"; 
        } else if (computerMove==1) {
            return "scissors";
        }
        return "paper"; //co jak bedzie -1 ? paper?
    }

    //Translating player move

    public Shapes playerMoveTranslate(String playerMove){ //nie zwracaj stringa tylko obiekt
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

        return playerMove.confront(computerMove);
    }
}
