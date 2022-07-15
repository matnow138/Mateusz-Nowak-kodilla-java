package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BoardTestSuite {

    @Test
    void testToString() {
        //given
        //creating the TasksList for todos
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number " + n)));

        //creating the TasksList for tasks in progress
        TaskList listInProgress = new TaskList("In Progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task number " + n)));

        //creating the TasksList for done tasks
        TaskList listDone = new TaskList("Done Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task number " + n)));

        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);


        //making a shallow clone of object board
        Board clonedBoard = null;
        try{
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        System.out.println(board);
        System.out.println(clonedBoard);

        //When
        //NEW: removing elements
        board.getLists().remove(listToDo);
        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        assertEquals(3, board.getLists().size());
        assertEquals(3, clonedBoard.getLists().size());
    }
}