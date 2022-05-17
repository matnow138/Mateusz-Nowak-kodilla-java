package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    Statistics statistics;
    List<String> usersNames;
    int postsCount;
    int commentsCount;
    int usersCount;
    double averagePostsUsersCount;
    double averageCommentsUserCount;
    double averageCommentsPostsCount;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;

    }

    public int getPostsCount() {
        return postsCount;
    }



    public void calculateAdvStatistics(Statistics statistics){
        usersCount=statistics.usersNames().size();
        postsCount=statistics.postsCount();
        commentsCount= statistics.commentsCount();
        averagePostsUsersCount = (double)postsCount/usersCount;
        averageCommentsUserCount = (double)commentsCount/usersCount;
        averageCommentsPostsCount = (double)commentsCount/postsCount;

    }

    public void showStatistics(){


    }
}
