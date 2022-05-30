package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;
public class RpsRunner {
    public static void main(String[] args){
        
        private static final int PLAYER_WINS = 1;

        //wydzielic do initialScreen ()
        System.out.println("Player 1 please state your name");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.nextLine();
        System.out.println("Round count:");
        int gameCount = sc.nextInt();

        //Game instructions for player

        System.out.println("Game manual: \n " +
                "Press 1 for rock \n " +
                "Press 2 for paper \n " +
                "Press 3 for scissors \n " +
                "Press x to end game \n" +
                "Press n for new game \n");
        
        //dodaj zamknięcie scannera
        //koniec initialScreen()
        
        private boolean end = false;
        private int counter=0;
        private int computerWins=0;
        private int playerWins=0;

        private  Scanner scanner = new Scanner(System.in);
        while(!end) {
            //wydzielic do metody playerRound() 
            //Player move

            System.out.println(playerName + ": Please choose your move.");
           
            String move = scanner.nextLine();

            //Translating player move with actions

            if (move.equals("x")) { //bonus: https://docs.oracle.com/javase/8/docs/technotes/guides/language/strings-switch.html
                System.out.println("End game!");
                break;
            } else if (move.equals("n")) {
                System.out.println("New game");
                counter = 0;
                System.out.println("Round count:");
                gameCount = sc.nextInt();
                continue;
            }
            //wydzielic do comupterRound
            //Generating computer move

            Random random = new Random();
            int computerMove = random.nextInt(3);

            //actual game

//wydzielic do metody play 
            Game game = new Game(move,computerMove);
            System.out.println(game.playerMoveTranslate(move) + " vs " + game.computerMoveTranslate(computerMove));

            //calculating game result

            if (game.fightResult() == PLAYER_WINS) { //zrob sobie stala albo enuma
                playerWins++;
                counter++;
                System.out.println("Player wins round!");
            } else if(game.fightResult() ==2) {
                System.out.println("Draw!");
            } else{
                computerWins++;
                counter++;
                System.out.println("Computer wins round!");
            }

            //Displaying game result
//wydzielic do metody result
            if (counter >= gameCount) {
                if (playerWins > computerWins) {
                    System.out.println("Player wins game!");
                    end = true;
                } else if(computerWins > playerWins) {
                    System.out.print("Computer wins game!");
                    end = true;
                } else{
                    System.out.println("Draw! Additional round");
                }
            }
        }
    }
}
