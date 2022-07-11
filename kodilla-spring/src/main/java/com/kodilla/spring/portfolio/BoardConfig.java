package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {




    @Bean
    TaskList toDoList(){
        return new TaskList();
    }
    @Bean
    TaskList inProgressList(){
        return new TaskList();
    }
    @Bean
    TaskList doneList(){
        return new TaskList();
    }
    @Bean
    public Board board(){
        return new Board(toDoList(), inProgressList(),  doneList());
    }


}
