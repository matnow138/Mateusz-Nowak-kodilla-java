package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);


        //When
        board.addToDoList("Learn Spring boot");
        List<String> toDoList = board.getToDoList().getTasks();
        board.addInProgressList("Learning Spring boot");
        List<String> inProgressList = board.getInProgressList().getTasks();
        board.addDoneList("Nope, long way to go!");
        List<String> doneList = board.getDoneList().getTasks();

        //Then
        assertEquals("Learn Spring boot", toDoList.get(0));
        assertEquals("Learning Spring boot", inProgressList.get(0));
        assertEquals("Nope, long way to go!", doneList.get(0));

    }
}
