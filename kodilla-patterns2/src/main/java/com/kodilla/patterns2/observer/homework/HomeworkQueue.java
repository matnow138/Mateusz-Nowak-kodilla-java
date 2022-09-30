package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observable {
    private final List<String> homeworkList;
    private final String name;
    private final List<Mentor> mentors;

    public HomeworkQueue(String name) {
        this.name = name;
        homeworkList = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public void addHomework(String homework) {
        homeworkList.add(homework);
        notifyMentor();
    }

    @Override
    public void registerMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void removeMentor(Mentor mentor) {
        mentors.remove(mentor);
    }

    @Override
    public void notifyMentor() {
        for (Mentor mentor : mentors) {
            mentor.update(this);
        }

    }
}
