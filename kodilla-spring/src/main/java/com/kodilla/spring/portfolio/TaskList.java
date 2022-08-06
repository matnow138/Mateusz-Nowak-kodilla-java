package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class TaskList {
    final List<String> tasks;

    public TaskList(){
        tasks = new ArrayList<>();
    }

    public List<String> getTasks(){
        return tasks;
    }

    public void addTask(String task){
        tasks.add(task);
    }


}
