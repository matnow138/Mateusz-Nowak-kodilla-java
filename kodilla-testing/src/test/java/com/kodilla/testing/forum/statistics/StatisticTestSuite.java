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
    private int posts0;
    private int posts1000;
    private int comments0;
    private int users0;
    private int users100;
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
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);
        //int postsCount = forumStatistics.getPostsCount();


        //Then
        Assertions.assertEquals("Cannot calculate average for 0 posts. \n"+
            "Average number of posts per user: 0.0\n"+
    "Average number of comments per user: 1.0", forumStatistics.showStatistics());

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
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals("Average number of posts per user: 1.0\n"+
                "Average number of comments per user: 0.5\n"+
                "Average number of comments per posts: 0.5", forumStatistics.showStatistics());
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
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals("Average number of posts per user: 5.0\n"+
                "Average number of comments per user: 0.0\n"+
                "Average number of comments per posts: 0.0", forumStatistics.showStatistics());
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
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals("Average number of posts per user: 5.0\n"+
                "Average number of comments per user: 2.2\n"+
                "Average number of comments per posts: 0.44", forumStatistics.showStatistics());
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
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals("Average number of posts per user: 3.0\n"+
                "Average number of comments per user: 5.4\n"+
                "Average number of comments per posts: 1.8", forumStatistics.showStatistics());
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
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals("Cannot calculate average for 0 users. \n"+
                "Average Comments per posts: 1.8", forumStatistics.showStatistics());
    }
    @DisplayName("Test for 0 users")
    @Test
    public void test100Users(){
        //Given
        for(int i=0; i<100;i++){
            usersName.add(Integer.toString(i));
        }
        postsCount=50;
        commentsCount=50;
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals("Average number of posts per user: 0.5\n"+
                "Average number of comments per user: 0.5\n"+
                "Average number of comments per posts: 1.0", forumStatistics.showStatistics());
    }


}
