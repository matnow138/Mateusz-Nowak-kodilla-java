package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "Driving task";
    public static final String PAINTING = "Painting task";
    public static final String SHOPPING = "Shopping task";

    public final Task makeTask(final String task) {
        switch (task) {
            case TaskFactory.DRIVING:
                return new DrivingTask("Driving", "Poznań", "car");
            case TaskFactory.PAINTING:
                return new PaintingTask("Painting", "Blue", "Wall");
            case TaskFactory.SHOPPING:
                return new ShoppingTask("Shopping", "Groceries", 5.0);
            default:
                return null;
        }
    }
}
