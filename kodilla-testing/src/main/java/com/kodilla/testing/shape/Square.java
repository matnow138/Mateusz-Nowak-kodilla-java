package com.kodilla.testing.shape;

public class Square implements Shape{
    private String name;
    private double a;

    public Square(String name, double a){
        this.name=name;
        this.a=a;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return a*a;
    }
}
