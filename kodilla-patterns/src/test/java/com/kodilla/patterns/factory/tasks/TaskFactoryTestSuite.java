package com.kodilla.patterns.factory.tasks;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        //Then
        assertEquals("Driving", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());

    }

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals(false, shopping.isTaskExecuted());

    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertEquals(false, painting.isTaskExecuted());

    }
}
