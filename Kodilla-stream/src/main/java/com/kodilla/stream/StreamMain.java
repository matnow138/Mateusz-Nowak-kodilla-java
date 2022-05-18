package com.kodilla.stream;



import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap = forum.getUserList().stream()
                .filter(s -> s.getGender()=='M')
                .filter(s -> (Period.between(s.getBirthDate(), LocalDate.now()).getYears()>=20))
                .filter(s -> s.getPostCount() >=1)
                .collect(Collectors.toMap(ForumUser::getUserId, s ->s));

        forumUserMap.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);




    }
}