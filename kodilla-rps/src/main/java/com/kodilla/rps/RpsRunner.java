package com.kodilla.rps;
import java.util.Random;
import java.util.Scanner;
public class RpsRunner {
    public static void main(String[] args){

        System.out.println("Player 1 please state your name");
        Scanner sc = new Scanner(System.in);
        String player1Name = sc.nextLine();
        System.out.println("Round count:");
        int gameCount = sc.nextInt();

        //Game instructions for player

        System.out.println("Game manual: \n " +
                "Press 1 for rock \n " +
                "Press 2 for paper \n " +
                "Press 3 for scissors \n " +
                "press x to end game \n" +
                "press n for new game");


        boolean end = false;
        int counter=0;
        int computerWins=0;
        int playerWins=0;

        while(!end) {

            //Player move

            System.out.println(player1Name + ": Please choose your move.");
            Scanner scanner = new Scanner(System.in);
            String move = scanner.nextLine();



            //Translating player move with actions

            if (move.equals("x")) {
                System.out.println("End game!");
                break;
            } else if (move.equals("n")) {
                System.out.println("New game");
                counter = 0;
                System.out.println("Round count:");
                gameCount = sc.nextInt();
                continue;
            }
            //Generating computer move

            Random random = new Random();
            int computerMove = random.nextInt(3);



            //actual game

            Game game = new Game(move,computerMove);
            System.out.println(game.playerMoveTranslate(move) + " vs " + game.computerMoveTranslate(computerMove));

            //calculating game result

            if (game.fightResult() == 1) {
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

            if (counter >= gameCount) {
                if (playerWins > computerWins) {
                    System.out.println("Player wins game!");
                    end = true;
                } else {
                    System.out.print("Computer wins game!");
                    end = true;
                }
            }
        }
    }
}
