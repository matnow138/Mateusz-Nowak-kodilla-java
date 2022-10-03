package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.*;
import org.junit.jupiter.api.Assertions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StatisticTestSuite {

   @Mock
   Statistics statisticsMock;

    private static List<String> usersName;
    private static int postsCount;
    private static int commentsCount;

@BeforeEach
    public void testData () {
        usersName = new ArrayList<>();
        postsCount=0;
        commentsCount=0;
    }




@DisplayName("Test for 0 posts")
    @Test
  public void testPostCount0(){
        //Given
        for(int i=0; i<10;i++){
            usersName.add(Integer.toString(i));
        }
        postsCount=0;
        commentsCount=10;
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(0, forumStatistics.getAveragePostsUsersCount());
        Assertions.assertEquals(1, forumStatistics.getAverageCommentsUserCount());
        Assertions.assertEquals(-1,forumStatistics.getAverageCommentsPostsCount());
        Assertions.assertEquals(0, forumStatistics.getPostsCount());
        Assertions.assertEquals(10,forumStatistics.getCommentsCount());
        Assertions.assertEquals(10,forumStatistics.getUsersName().size());


    }
    @DisplayName("Test for 1000 posts")
    @Test
    public void testPostCount1000(){
        //Given
        for(int i=0; i<1000;i++){
            usersName.add(Integer.toString(i));
        }
        postsCount=1000;
        commentsCount=500;
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(1.0, forumStatistics.getAveragePostsUsersCount());
        Assertions.assertEquals(0.5, forumStatistics.getAverageCommentsUserCount());
        Assertions.assertEquals(0.5,forumStatistics.getAverageCommentsPostsCount());
        Assertions.assertEquals(1000, forumStatistics.getPostsCount());
        Assertions.assertEquals(500,forumStatistics.getCommentsCount());
        Assertions.assertEquals(1000,forumStatistics.getUsersName().size());

    }

    @DisplayName("Test for 0 comments")
    @Test
    public void testCommentsCount0(){
        //Given
        for(int i=0; i<10;i++){
            usersName.add(Integer.toString(i));
        }
        postsCount=50;
        commentsCount=0;
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(5.0, forumStatistics.getAveragePostsUsersCount());
        Assertions.assertEquals(0.0, forumStatistics.getAverageCommentsUserCount());
        Assertions.assertEquals(0.0,forumStatistics.getAverageCommentsPostsCount());
        Assertions.assertEquals(50, forumStatistics.getPostsCount());
        Assertions.assertEquals(0,forumStatistics.getCommentsCount());
        Assertions.assertEquals(10,forumStatistics.getUsersName().size());

    }
    @DisplayName("Test for quantity of comments < quantity of posts")
    @Test
    public void testQuantityOfCommentsLessQuantityOfPosts(){
        //Given
        for(int i=0; i<10;i++){
            usersName.add(Integer.toString(i));
        }
        postsCount=50;
        commentsCount=22;
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(5.0, forumStatistics.getAveragePostsUsersCount());
        Assertions.assertEquals(2.2, forumStatistics.getAverageCommentsUserCount());
        Assertions.assertEquals(0.44,forumStatistics.getAverageCommentsPostsCount());
        Assertions.assertEquals(50, forumStatistics.getPostsCount());
        Assertions.assertEquals(22,forumStatistics.getCommentsCount());
        Assertions.assertEquals(10,forumStatistics.getUsersName().size());

    }
    @DisplayName("Test for quantity of comments > quantity of posts")
    @Test
    public void testQuantityOfCommentsGreaterQuantityOfPosts(){
        //Given
        for(int i=0; i<10;i++){
            usersName.add(Integer.toString(i));
        }
        postsCount=30;
        commentsCount=54;
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(3.0, forumStatistics.getAveragePostsUsersCount());
        Assertions.assertEquals(5.4, forumStatistics.getAverageCommentsUserCount());
        Assertions.assertEquals(1.8,forumStatistics.getAverageCommentsPostsCount());
        Assertions.assertEquals(30, forumStatistics.getPostsCount());
        Assertions.assertEquals(54,forumStatistics.getCommentsCount());
        Assertions.assertEquals(10,forumStatistics.getUsersName().size());

    }
    @DisplayName("Test for 0 users")
    @Test
    public void test0Users(){
        //Given
        for(int i=0; i<0;i++){
            usersName.add(Integer.toString(i));
        }
        postsCount=30;
        commentsCount=54;
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(-1, forumStatistics.getAveragePostsUsersCount());
        Assertions.assertEquals(-1, forumStatistics.getAverageCommentsUserCount());
        Assertions.assertEquals(1.8,forumStatistics.getAverageCommentsPostsCount());
        Assertions.assertEquals(30, forumStatistics.getPostsCount());
        Assertions.assertEquals(54,forumStatistics.getCommentsCount());
        Assertions.assertEquals(0,forumStatistics.getUsersName().size());

    }
    @DisplayName("Test for 100 users")
    @Test
    public void test100Users(){
        //Given
        for(int i=0; i<100;i++){
            usersName.add(Integer.toString(i));
        }
        postsCount=50;
        commentsCount=50;
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(0.5, forumStatistics.getAveragePostsUsersCount());
        Assertions.assertEquals(0.5, forumStatistics.getAverageCommentsUserCount());
        Assertions.assertEquals(1.0,forumStatistics.getAverageCommentsPostsCount());
        Assertions.assertEquals(50, forumStatistics.getPostsCount());
        Assertions.assertEquals(50,forumStatistics.getCommentsCount());
        Assertions.assertEquals(100,forumStatistics.getUsersName().size());

    }


}
