package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemdecorator) {
        String result = poemdecorator.decorate(text);
        System.out.println(result);
    }
}
