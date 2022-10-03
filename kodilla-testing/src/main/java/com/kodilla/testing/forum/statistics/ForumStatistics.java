package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    //Statistics statistics;
    int usersCount;
    int postsCount;
    int commentsCount;

    List<String> usersName;
    double averagePostsUsersCount;
    double averageCommentsUserCount;
    double averageCommentsPostsCount;

   /*public ForumStatistics(Statistics statistics) {
        this.statistics=statistics;

    }*/




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

        if(usersName.size()!=0){
            return postsCount/(double)usersName.size();
        }
        return  -1;
    }

    public double averageCommentsUserCount(){
        if(usersName.size()!=0){
            return commentsCount/(double)usersName.size();
        }
        return -1;
    }

    public double averageCommentsPostsCount() {
        if (postsCount != 0) {
            return commentsCount/(double)postsCount;
        }
        return -1;
    }

    public String showStatistics() {

            if (usersName.size() == 0 && postsCount == 0) {
                return "Error: Cannot divide by 0 users and 0 posts";
            } else if (usersName.size() == 0 && postsCount != 0) {
                return "Cannot calculate average for 0 users. \nAverage Comments per posts: " + averageCommentsPostsCount;
            } else if (usersName.size() != 0 && postsCount == 0) {
                return "Cannot calculate average for 0 posts. \nAverage number of posts per user: " + averagePostsUsersCount + "\nAverage number of comments per user: " + averageCommentsUserCount;
            } else {
                return "Average number of posts per user: " + averagePostsUsersCount + "\nAverage number of comments per user: " + averageCommentsUserCount + "\nAverage number of comments per posts: " + averageCommentsPostsCount;
            }


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

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public List<String> getUsersName() {
        return usersName;
    }
}
