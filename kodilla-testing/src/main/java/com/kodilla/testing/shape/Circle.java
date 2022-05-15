package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

public class Circle implements Shape {
    private String name;
    private double r;

    public Circle(String name, double r){
        this.name = name;
        this.r = r;
    }
    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return 3.14*r*r;
    }
}
