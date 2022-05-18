package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
     PoemBeautifier poemBeautifier = new PoemBeautifier();
     poemBeautifier.beautify("I Love Java", String::toUpperCase);
     poemBeautifier.beautify("Java is the best", (a) -> a + "!!!");
        poemBeautifier.beautify("Are first letters of alphabet", (a) -> "ABC " + a);
     poemBeautifier.beautify("Love, Peace", (a) -> a + " & Rock & Roll!!!");
     poemBeautifier.beautify("THERE WAS A KING", String::toLowerCase);

     // Stream 7.2
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}