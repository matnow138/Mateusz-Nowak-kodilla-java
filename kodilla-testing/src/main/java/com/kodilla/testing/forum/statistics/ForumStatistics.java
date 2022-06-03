package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    Statistics statistics;
    int usersCount;
    int postsCount;
    int commentsCount;

    List<String> usersName;
    double averagePostsUsersCount;
    double averageCommentsUserCount;
    double averageCommentsPostsCount;

   public ForumStatistics(Statistics statistics) {
        this.statistics=statistics;

    }




    public void calculateAdvStatistics(Statistics statistics){
      usersName=statistics.usersNames();
      postsCount=statistics.postsCount();
      commentsCount= statistics.commentsCount();
        averagePostsUsersCount = averagePostsUsersCount();
        averageCommentsUserCount = averageCommentsUserCount();
        averageCommentsPostsCount = averageCommentsPostsCount();

    }
    public int userCount (Statistics statistics){

        if(statistics.usersNames().size()!=0){
            return statistics.usersNames().size();
        }
        return 0;
    }

    public int postsCount(Statistics statistics){
        return statistics.postsCount();
    }

    public double averagePostsUsersCount(){

        if(usersCount!=0){
            return postsCount/usersCount;
        }
        return  -1;
    }

    public double averageCommentsUserCount(){
        if(usersCount!=0){
            return commentsCount/usersCount;
        }
        return -1;
    }

    public double averageCommentsPostsCount() {
        if (postsCount != 0) {
            return commentsCount/postsCount;
        }
        return -1;
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
