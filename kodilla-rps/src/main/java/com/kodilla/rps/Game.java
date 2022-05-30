package com.kodilla.rps;

import java.awt.*;
import java.util.Collection;
import java.util.Collections;

public class Game {

    private final Shapes playerMove;
    private final Shapes computerMove;

    public Game(Shapes playerMove, Shapes computerMove) {
        this.playerMove = playerMove;
        this.computerMove = computerMove;

    }

    //Translating computer moves to String


    //Translating player move

       public int fightResult(Shapes playerMove, Shapes computerMove){
        //Verification if player move beats computer move
        //Overall logic - program check list for player move and if computer move is in that list -player wins, otherwise - computer wins

        if(playerMove.getWinsWith().contains(computerMove.getName())){
            return 1;
        }else if(playerMove.getName().equals(computerMove.getName())){
            return 2;
        }
            return 0;

    }
}
