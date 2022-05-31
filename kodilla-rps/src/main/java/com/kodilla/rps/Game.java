package com.kodilla.rps;

public class Game {

    private final Shapes playerMove;
    private final Shapes computerMove;
    public enum fightResult {PLAYER_WINS, COMPUTER_WINS, DRAW}

    public Game(Shapes playerMove, Shapes computerMove) {
        this.playerMove = playerMove;
        this.computerMove = computerMove;

    }

       public fightResult fightResult(){
        //Verification if player move beats computer move
        //Overall logic - program check list for player move and if computer move is in that list -player wins, otherwise - computer wins

        if(playerMove.getWinsWith().contains(computerMove.getName())){
            return fightResult.PLAYER_WINS;
        }else if(playerMove.getName().equals(computerMove.getName())){
            return fightResult.COMPUTER_WINS;
        }
            return fightResult.DRAW;

    }
}
