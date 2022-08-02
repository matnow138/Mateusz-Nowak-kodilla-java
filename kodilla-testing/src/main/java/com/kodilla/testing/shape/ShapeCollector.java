package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private String name;

    private final List<Shape> shapes = new ArrayList();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public int getShapeQuantity(){
        return shapes.size();
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        if(n>=0 && n <shapes.size()){
            return shapes.get(n);
        }
        return null;
    }

    public String showFigures(){
        String names="";
        for (int i=0;i<shapes.size();i++) {
            names = shapes.get(i).getShapeName();
        }
        return names;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        if (!name.equals(that.name)) return false;
        return shapes.equals(that.shapes);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + shapes.hashCode();
        return result;
    }
}
