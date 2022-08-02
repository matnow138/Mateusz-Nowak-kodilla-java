package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

public class Triangle implements Shape {
    private final String name;
    private final double a;
    private final double h;

    public Triangle(String name, double a, double h){
        this.name=name;
        this.a=a;
        this.h=h;
    }
    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return a*h/2;
    }
}
