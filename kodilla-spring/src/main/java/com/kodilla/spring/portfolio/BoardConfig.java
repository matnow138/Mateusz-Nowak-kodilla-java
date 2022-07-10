package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    @Scope("Component")
    public TaskList getToDoList(){
        return new TaskList();
    }

    @Bean
    @Scope("Component")
    public TaskList getInProgressList(){
        return new TaskList();
    }

    @Bean
    @Scope("Component")
    public TaskList getDoneList(){
        return new TaskList();
    }
}
