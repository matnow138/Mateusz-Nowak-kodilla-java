package com.kodilla.patterns2.observer.homework;

public class MentorUser implements Mentor {
    private final String name;
    private int updateCount;

    public MentorUser(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + ", You got new homework to check");
        updateCount++;

    }

    public int getUpdateCount() {
        return updateCount;
    }


}
