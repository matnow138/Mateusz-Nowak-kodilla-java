package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite \uD83D\uDE31")
class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    void testAddPost(){
        //Given
        ForumUser forumUSer = new ForumUSer("mrsmith", "John Smith");
        //When
        forumUSer.addPost("mrsmith", "Hello everyone, this is my first contributionhere!");
        //Then
        Assertions.assertequals(1, forumUSer.getPostsQuantity());
    }

}