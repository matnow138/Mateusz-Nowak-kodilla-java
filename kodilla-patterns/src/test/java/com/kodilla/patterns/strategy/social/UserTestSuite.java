package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialMedia.FacebookPublisher;
import com.kodilla.patterns.strategy.social.socialMedia.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.socialMedia.TwitterPublisher;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    public static Millenials millenials;
    public static YGeneration yGeneration;
    public static ZGeneration zGeneration;

    @BeforeEach
    public void setUsers(){
        millenials = new Millenials("Adam");
        yGeneration = new YGeneration("John");
        zGeneration = new ZGeneration("Mary");
    }


    @Test
    void testDefaultSharingStrategies(){
        //Given
        //When
        String millenialsSharePost = millenials.sharePost();
        String yGenerationSharePost = yGeneration.sharePost();
        String zGenerationSharePost = zGeneration.sharePost();

        //Then
        assertEquals(millenialsSharePost, "Facebook");
        assertEquals(yGenerationSharePost, "Snapchat");
        assertEquals(zGenerationSharePost, "Twitter");

    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        //When
        millenials.setSharingMedia(new TwitterPublisher());
        yGeneration.setSharingMedia(new FacebookPublisher());
        zGeneration.setSharingMedia(new SnapchatPublisher());
        String millenialsSharePost = millenials.sharePost();
        String yGenerationSharePost = yGeneration.sharePost();
        String zGenerationSharePost = zGeneration.sharePost();

        //Then
        assertEquals(millenialsSharePost, "Twitter");
        assertEquals(yGenerationSharePost, "Facebook");
        assertEquals(zGenerationSharePost, "Snapchat");

    }

}
