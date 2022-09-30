package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkQueueTestSuite {

    @Test
    public void homeworkUpdate(){
        //Given
        HomeworkQueue jenny = new FrontEndCourse();
        HomeworkQueue sam = new JavaCourse();
        MentorUser adam = new MentorUser("Adam");
        MentorUser john = new MentorUser("John");

        jenny.registerMentor(adam);
        sam.registerMentor(john);
        //When
        jenny.addHomework("I learned HTML");
        jenny.addHomework("I know JS!");
        sam.addHomework("I know how to code!");
        sam.addHomework("I know what Java is");
        //Then
        assertEquals(2,adam.getUpdateCount());
        assertEquals(2,john.getUpdateCount());
    }
}
