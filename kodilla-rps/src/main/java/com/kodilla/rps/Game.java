package com.kodilla.rps;

import static com.kodilla.rps.Game.FightResult.*;

public class Game {

    public enum FightResult {PLAYER_WINS, COMPUTER_WINS, DRAW}

    private final Shapes playerMove;
    private final Shapes computerMove;

    public Game(Shapes playerMove, Shapes computerMove) {
        this.playerMove = playerMove;
        this.computerMove = computerMove;

    }

    public FightResult fightResult() {
        //Verification if player move beats computer move
        //Overall logic - program check list for player move and if computer move is in that list -player wins, otherwise - computer wins

        if (playerMove.getWinsWith().contains(computerMove.getName())) {
            return PLAYER_WINS;
        } else if (playerMove.getName().equals(computerMove.getName())) {
            return COMPUTER_WINS;
        }
        return DRAW;

    }
}
