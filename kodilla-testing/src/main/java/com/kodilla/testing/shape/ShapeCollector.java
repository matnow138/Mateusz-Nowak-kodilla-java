package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private String name;

    private List<Shape> shapes = new ArrayList();

    public void addFigure(Shape shape){

    }
    public int getShapeQuantity(){
        return shapes.size();
    }
    public boolean removeFigure(Shape shape){
        return false;
    }

    public Shape getFigure(int n){
        return null;
    }

    public void showFigures(){

    }

}
