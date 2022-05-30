package com.kodilla.rps;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shapes {
    private final List<String> winsWith;
    private final String name;


    public Shapes(String name, List<String> winsWith) {
        this.name = name;
        this.winsWith = new ArrayList<>(winsWith);
    }

    public int confront (String computerMove){
        if(winsWith.contains(computerMove)){
            return 1;
        } else if (name.equals(computerMove)) {
            return 2;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public List<String> getWinsWith() {
        return winsWith;
    }
}
