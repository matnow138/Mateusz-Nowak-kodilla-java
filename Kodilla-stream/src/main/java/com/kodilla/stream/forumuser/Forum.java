package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    final List<ForumUser> forumUsersList = new ArrayList<>();


    public Forum() {
        forumUsersList.add(new ForumUser(0001, "john15", 'M', LocalDate.of(1990,2,15), 0));
        forumUsersList.add(new ForumUser(0002, "Andy67", 'M', LocalDate.of(1985,4,15), 11));
        forumUsersList.add(new ForumUser(0003, "Jane11", 'F', LocalDate.of(1999,1,15), 25));
        forumUsersList.add(new ForumUser(0004, "Rick59", 'M', LocalDate.of(1992,9,15), 1));
        forumUsersList.add(new ForumUser(0005, "Annie", 'F', LocalDate.of(1978,1,15), 13));
        forumUsersList.add(new ForumUser(0006, "Elisabeth2", 'F', LocalDate.of(1956,12,15), 24));
        forumUsersList.add(new ForumUser(0007, "Mike88", 'M', LocalDate.of(1988,11,15), 56));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUsersList);
    }

    }


