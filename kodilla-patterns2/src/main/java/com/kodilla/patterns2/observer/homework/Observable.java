package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerMentor(Mentor mentor);

    void notifyMentor();

    void removeMentor(Mentor mentor);
}
