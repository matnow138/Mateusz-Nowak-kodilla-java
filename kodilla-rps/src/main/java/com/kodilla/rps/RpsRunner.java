package com.kodilla.rps;


import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class RpsRunner {

    private  String playerName;
    private  int gameCount;
    private  int counter;
    private  String move;
    private  int playerPoints=0;
    private  int computerPoints=0;
    private  Shapes rock = new Shapes("rock", Collections.singletonList("scissors"));
    private  Shapes paper = new Shapes("paper", Collections.singletonList("rock"));
    private  Shapes scissors = new Shapes("scissors", Collections.singletonList("paper"));
    private  Random random = new Random();
    
    public static void main(String[] args){
        new RpsRunner().run();
    }
    
    private void run(){
        //Player name and round count;
        initialScreen();
        instructions();

        boolean end = false;
        while(!end) {

            //Player and computer move
            Shapes playerMove = playerMove();
            Shapes computerMove = computerMove();
            //Translating player move with actions
            switch(move){
                case "x":
                    System.out.println("End game!");
                    break;
                case "n":
                    System.out.println("New game");
                    initialScreen();
                    break;
            }

            //actual game
            play(playerMove,computerMove);


            //Displaying game result

            if (counter >= gameCount) {
                if (playerPoints > computerPoints) {
                    System.out.println("Player wins game!");
                    end = true;
                } else if(computerPoints > playerPoints) {
                    System.out.print("Computer wins game!");
                    end = true;
                } else{
                    System.out.println("Draw! Additional round");
                }
            }
        }
    }
    
    private void initialScreen(){
        System.out.println("Player 1 please state your name");
        Scanner sc = new Scanner(System.in);
        playerName = sc.nextLine();
        System.out.println("Round count:");
        gameCount = sc.nextInt();
        counter =0;

    }
    private   void instructions(){
        System.out.println("Game manual: \n " +
                "Press 1 for rock \n " +
                "Press 2 for paper \n " +
                "Press 3 for scissors \n " +
                "Press x to end game \n" +
                "Press n for new game \n");

    }
    
    private  Shapes playerMove(){
        System.out.println(playerName + ": Please choose your move.");
        Scanner scanner = new Scanner(System.in);
        move = scanner.nextLine();
        switch(move){
            case "1":
                return rock;
            case "2":
                return paper;
            case "3":
                return scissors;
            case "x", "n":
                return null;
            default:
            System.out.println("Wrong move, please choose again");
            playerMove();
        }
        return null;
    }
    
    private   Shapes computerMove(){
        
        int computerMove = random.nextInt(3);
        switch (computerMove){
            case 0:
                return rock;
            case 1:
                return paper;
            case 2:
                return scissors;
            }

        return null;
    }

    private  void play(Shapes playerMove, Shapes computerMove){
        Game game = new Game(playerMove,computerMove);
        System.out.println(playerMove.getName() + " vs " + computerMove.getName());
        if (game.fightResult(playerMove, computerMove) == 1) {
            playerPoints++;
            counter++;
            System.out.println("Player wins round!");
        } else if(game.fightResult(playerMove,computerMove) ==2) {
            System.out.println("Draw!");
        } else{
            computerPoints++;
            counter++;
            System.out.println("Computer wins round!");
        }
    }

}
