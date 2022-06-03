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

@BeforeEach
    public void testData () {
        posts0 = 0;
        posts1000 = 1000;
        comments0 = 0;
        users0 = 0;
        users100 = 100;
    }

    static List<String> usersName = new ArrayList<>();
    private static int postsCount;
    private static int commentsCount;


@DisplayName("Test for 0 posts")
    @Test
  public void testPostCount0(){
        //Given
        for(int i=0; i<1000;i++){
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
        int postsCount = forumStatistics.postsCount;

        //Then
        Assertions.assertEquals(0,postsCount);
    }/*
    @DisplayName("Test for 1000 posts")
    @Test
    public void testPostCount1000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //Then
        when(forumStatistics.calculateAdvStatistics(statistics())).thenReturn()
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double postCount = forumStatistics.postsCount;

        //Given
        Assertions.assertEquals(1000,postCount);
    }

    @DisplayName("Test for 0 comments")
    @Test
    public void testCommentsCount0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);


        //Then
        when(statisticsMock.commentsCount()).thenReturn(comments0);
        forumStatistics.calculateAdvStatistics(Arrays.asList("John", "adam"), 5, 15);
        double commentsCount = forumStatistics.commentsCount;
        //Given
        Assertions.assertEquals(0,commentsCount);
    }
    @DisplayName("Test for quantity of comments < quantity of posts")
    @Test
    public void testQuantityOfCommentsLessQuantityOfPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);


        //Then
        when(statisticsMock.commentsCount()).thenReturn(comments0);
        when(statisticsMock.postsCount()).thenReturn(posts1000);
        forumStatistics.calculateAdvStatistics(Arrays.asList("John", "adam"), 5, 15);
        double commentsCount = forumStatistics.commentsCount;
        //Given
        Assertions.assertEquals(0,commentsCount);
    }
*/

}
