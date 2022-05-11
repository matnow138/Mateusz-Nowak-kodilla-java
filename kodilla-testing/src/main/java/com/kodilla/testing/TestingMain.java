package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        Calculator calculator = new Calculator();
        int add = calculator.add(3,5);
        if(add == (3+5)){
            System.out.println("it works");
        } else {
            System.out.println("Nope");
        }
        int substract = calculator.substract(8,3);
        if (substract == (8-3)){
            System.out.println("It works");
        } else{
            System.out.println("Nope");
        }


        }
    }
