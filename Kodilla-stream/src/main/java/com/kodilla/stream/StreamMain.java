package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
public class StreamMain {

    public static void main(String[] args) {
     PoemBeautifier poemBeautifier = new PoemBeautifier();
     poemBeautifier.beautify("I Love Java", String::toUpperCase);
     poemBeautifier.beautify("Java is the best", (a) -> a + "!!!");
        poemBeautifier.beautify("Are first letters of alphabet", (a) -> "ABC " + a);
     poemBeautifier.beautify("Love, Peace", (a) -> a + " & Rock & Roll!!!");
     poemBeautifier.beautify("THERE WAS A KING", String::toLowerCase);

    }
}