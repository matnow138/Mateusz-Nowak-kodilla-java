package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    Statistics statistics;
    int usersCount;
    int postsCount;
    int commentsCount;

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
        usersCount=userCount(statistics);
        postsCount=postsCount(statistics);
        commentsCount= postsCount(statistics);
        averagePostsUsersCount = averagePostsUsersCount();
        averageCommentsUserCount = averageCommentsUserCount();
        averageCommentsPostsCount = averageCommentsPostsCount();

    }
    public int userCount (Statistics statistics){
        return statistics.usersCount();
    }

    public int postsCount(Statistics statistics){
        return statistics.postsCount();
    }

    public double averagePostsUsersCount(){
        return postsCount/usersCount;
    }

    public double averageCommentsUserCount(){
        return commentsCount/usersCount;
    }

    public double averageCommentsPostsCount(){
        return commentsCount/postsCount;
    }

    public void showStatistics(){


    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }



    public double getAveragePostsUsersCount() {
        return averagePostsUsersCount;
    }

    public double getAverageCommentsUserCount() {
        return averageCommentsUserCount;
    }

    public double getAverageCommentsPostsCount() {
        return averageCommentsPostsCount;
    }
}
