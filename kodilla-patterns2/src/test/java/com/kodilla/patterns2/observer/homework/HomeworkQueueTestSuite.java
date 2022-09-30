package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkQueueTestSuite {

    @Test
    public void homeworkUpdate(){
        //Given
        HomeworkQueue frontEndCourse = new FrontEndCourse();
        MentorUser adam = new MentorUser("Adam");
        frontEndCourse.registerMentor(adam);
        //When
        frontEndCourse.addHomework("I learned HTML");
        frontEndCourse.addHomework("I know JS!");
        //Then
        assertEquals(2,adam.getUpdateCount());
    }
}
