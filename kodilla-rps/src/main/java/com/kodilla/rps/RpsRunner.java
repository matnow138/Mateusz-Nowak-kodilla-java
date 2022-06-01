package com.kodilla.rps;


import java.util.*;

import static com.kodilla.rps.Game.fightResult.*;

public class RpsRunner {

    private String playerName;
    private int gameCount;
    private  String move;
    private int playerPoints=0;
    private int computerPoints=0;
    private final Shapes rock = new Shapes("rock", Arrays.asList("scissors", "lizard"));

    private final Shapes paper = new Shapes("paper", Arrays.asList("rock", "spock"));
    private final Shapes scissors = new Shapes("scissors", Arrays.asList("paper", "lizard"));
    private final Shapes lizard = new Shapes("lizard", Arrays.asList("spock", "paper"));
    private final Shapes spock = new Shapes("spock", Arrays.asList("scissors", "rock"));
    private Random random = new Random();
    public static void main(String[] args) {
        new RpsRunner().run();

    }
    public void run(){

            //Player name and round count;
            initialScreen();

            instructions();


            boolean end = false;


            while(!end) {

                //Player and computer move
                Shapes playerMove = playerMove();
                Shapes computerMove = computerMove();
                //Translating player move with actions
                if(!playerDecision()){
                    continue;
                }

                //actual game
                play(playerMove, computerMove);


                //Displaying game result
                end = displayResult();

            }
        }

    public void initialScreen(){
        System.out.println("Player 1 please state your name");
        Scanner sc = new Scanner(System.in);
        playerName = sc.nextLine();
        System.out.println("Rounds to win:");
        gameCount = sc.nextInt();

    }
    public void instructions(){
        System.out.println("Game manual: \n " +
                "Press 1 for rock \n " +
                "Press 2 for paper \n " +
                "Press 3 for scissors \n " +
                "Press 4 for lizard \n " +
                "Press 5 for spock \n" +
                "Press x to end game \n " +
                "Press n for new game \n");

    }
    public Shapes playerMove(){
        System.out.println(playerName + ": Please choose your move.");
        Scanner scanner = new Scanner(System.in);
        move = scanner.nextLine();
        switch (move) {
            case "1":
                return rock;
            case "2":
                return paper;
            case "3":
                return scissors;
            case "4":
                return lizard;
            case "5":
                return spock;
            case "x", "n":
                return null;
            default:
            System.out.println("Wrong move, please choose again");
            return playerMove();
        }

    }
    public boolean playerDecision(){
        switch(move){
            case "x":
                System.out.println("End game!");
                System.exit(0);
            case "n":
                System.out.println("Are you sure to restart game? \n" +
                        "Press y to to confirm \n " +
                        "Press n to cancel" );
                Scanner sc = new Scanner(System.in);
                String decision = sc.nextLine();
                switch(decision) {
                    case "y":
                        System.out.println("New game");
                        initialScreen();
                        computerPoints=0;
                        playerPoints=0;
                        return false;
                    case "n":

                        return false;
                }
                return true;
        }
        return true;
    }
    public Shapes computerMove(){

        int computerMove = random.nextInt(5);
        switch (computerMove){
            case 0:
                return rock;
            case 1:
                return paper;
            case 2:
                return scissors;
            case 3:
                return lizard;
            case 4:
                return spock;
            }

        return null;
    }

    public void play(Shapes playerMove, Shapes computerMove){
        Game game = new Game(playerMove,computerMove);
        System.out.println(playerMove.getName() + " vs " + computerMove.getName());
        if (game.fightResult() == PLAYER_WINS) {
            playerPoints++;

            System.out.println("Player wins round!");
        } else if(game.fightResult() ==DRAW) {
            System.out.println("Draw!");
        } else{
            computerPoints++;

            System.out.println("Computer wins round!");
        }
        System.out.println("Player points: " + playerPoints + "\nComputer points: " + computerPoints);
    }
    public boolean displayResult(){
        if (playerPoints >= gameCount || computerPoints >= gameCount) {
            if (playerPoints > computerPoints) {
                System.out.println("Player wins game!" + playerPoints +":" + computerPoints +"\n");
                System.out.println("For new game press n\n" +
                        "to end game press x");
                Scanner sc = new Scanner(System.in);
                move = sc.nextLine();
                playerDecision();
                if (move.equals("x")) {
                    playerDecision();
                    return false;
                } else {
                    return true;
                }
            } else if (computerPoints > playerPoints) {
                System.out.print("Computer wins game!" + computerPoints + ":" + playerPoints+"\n");
                System.out.println("For new game press n\n" +
                        "to end game press x");
                Scanner sc = new Scanner(System.in);
                move = sc.nextLine();
                if (move.equals("n")) {
                    playerDecision();
                    return false;
                } else {
                    System.exit(0);
                }
            } else if (computerPoints==playerPoints){
                System.out.println("Draw! Additional round");
                return false;
            }
        }
        return false;
    }

}
