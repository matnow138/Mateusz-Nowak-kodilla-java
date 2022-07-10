package com.kodilla.spring.portfolio;

public class Board {
    public TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }
}
