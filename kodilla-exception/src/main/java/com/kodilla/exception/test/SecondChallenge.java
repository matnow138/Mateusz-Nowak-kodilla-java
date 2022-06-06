package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new ExceptionHandling();
        }
        return "Done!";
    }

    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();
        String result;
        try{
            result = secondChallenge.probablyIWillThrowException(1.5,3);
            System.out.println(result);
        } catch (ExceptionHandling e){
            System.out.println("Error");
        } finally {
            System.out.println("Try again");
        }

    }
}