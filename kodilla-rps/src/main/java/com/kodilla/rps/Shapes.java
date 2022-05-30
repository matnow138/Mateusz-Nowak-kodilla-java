package com.kodilla.rps;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shape {
    private final List<String> winsWith;
    private final String name;


    public Shapes(String name, List<String> winsWith) {
        this.name = name;
        this.winsWith = new ArrayList(winsWith);
    }

    public int confront (String name){  
        //bonus: mozna ewentualnie miec gdzies wszystkie dostepne ksztalty i pierwsza linie all.contains(name) a jak nie to -1 albo exception
        if(winsWith.contains(name)){
            return 1;
        } 
        if (this.name.equals(name)) {
            return 2;
        }
        return 0;
    }
}
