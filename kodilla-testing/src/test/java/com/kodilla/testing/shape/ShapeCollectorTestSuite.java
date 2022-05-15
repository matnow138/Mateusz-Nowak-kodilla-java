package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shapes Test Suite")
public class ShapeCollectorTestSuite {
    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests(){System.out.println("All tests are finished.");}
    @Nested
    @DisplayName(
            "Tests for adding figures"
    )
    class TestAdd {
        @DisplayName("Adding figure test")
        @Test
        public void addFigureTest() {
            //Given
            ShapeCollector figure = new ShapeCollector();
            Shape circle = new Circle("Circle", 5);
            //When
            figure.addFigure(circle);
            //Then
            Assertions.assertEquals(1, figure.getShapeQuantity());

        }
    }
    @Nested
    @DisplayName("Tests for removing figures")
    class TestRemove {
        @DisplayName("Testing removal of figure")
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
    }
    @Nested
    @DisplayName("Tests for retrieving figure")
    class TestGet {
        @DisplayName("Test Get")
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
    }
    @Nested
    @DisplayName("Tests for display figures")
    class  TestShow {
        @DisplayName("Testing display of figures")
        @Test
        public void showFigures() {
            //When
            ShapeCollector figure = new ShapeCollector();
            Shape circle = new Circle("Circle", 5);
            //When
            figure.addFigure(circle);

            //Then
            Assertions.assertEquals(figure.showFigures(), circle.getShapeName());
        }
    }
}
