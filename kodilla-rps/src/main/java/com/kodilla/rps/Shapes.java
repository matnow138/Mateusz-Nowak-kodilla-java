package com.kodilla.rps;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shapes {
    private  List<String> winsWith = new ArrayList<>();
    private String shape;


    public Shapes(String shape, List<String> winsWith) {
        this.shape = shape;
        this.winsWith = winsWith;
    }

    public int confront (String computerMove){
        if(winsWith.contains(computerMove)){
            return 1;
        } else if (shape.equals(computerMove)) {
            return 2;
        }
        return 0;
    }
}
