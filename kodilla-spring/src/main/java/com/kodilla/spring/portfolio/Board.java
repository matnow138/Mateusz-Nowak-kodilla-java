package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;


public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public void addToDoList(String task){
        toDoList.addTask(task);
    }
    public void addDoneList(String task){
        doneList.addTask(task);
    }
    public void addInProgressList(String task){
        inProgressList.addTask(task);
    }
}
