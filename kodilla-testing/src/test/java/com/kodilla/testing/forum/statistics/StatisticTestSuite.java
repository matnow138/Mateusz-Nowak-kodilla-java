package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.mockito.junit.jupiter.*;
import org.junit.jupiter.api.Assertions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {

    private Statistics statisticsMock;



        private int posts0 = 0;
        private int posts1000 = 1000;
        private int comments0 = 0;
        private int users0 = 0;
        private int users100 = 100;



    @Test
  public void testUserCount0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);


        //Then
        when(statisticsMock.usersCount()).thenReturn(users0);
        double userCount = forumStatistics.userCount(statisticsMock);
        //Given
        Assertions.assertEquals(0,userCount);

    }




}
