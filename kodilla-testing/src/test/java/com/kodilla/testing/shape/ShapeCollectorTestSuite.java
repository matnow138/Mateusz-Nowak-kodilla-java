package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;



public class ShapeCollectorTestSuite {


    @Test
    public void addFigureTest(){
        //Given
        ShapeCollector figure = new ShapeCollector();
        Shape circle = new Circle("Circle", 5);
        //When
        figure.addFigure(circle);
        //Then
        Assertions.assertEquals(1,figure.getShapeQuantity());

    }
    @Test
    public void removeFigure() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Shape circle = new Circle("Circle", 5);
        //When
        boolean result = figure.removeFigure(circle);
        //Then
        Assertions.assertFalse(result);


    }
    @Test
    public void getFigure() {
        //When
        ShapeCollector figure = new ShapeCollector();
        int counter = 3;
        Shape circle = new Circle("Circle", 5);
        figure.addFigure(circle);
        //When
        Shape retrievedFigure;
        retrievedFigure = figure.getFigure(0);
        //Then
        Assertions.assertEquals(circle, retrievedFigure);



    }
    @Test
    public void showFigures() {
        //When
        ShapeCollector figure = new ShapeCollector();
        Shape circle = new Circle("Circle", 5);
        //When
        figure.showFigures();
        //Then
        Assertions.assertEquals(figure.showFigures(), circle);


    }
}
