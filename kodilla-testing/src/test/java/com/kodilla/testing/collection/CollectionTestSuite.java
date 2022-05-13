package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Test of odd numbers exterminator")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: start");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Odd numbers test: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Odd numbers test: end");
    }

    @DisplayName("Testing method with empty list")
    @Test
    void testCaseEmptyList() {
        //Given
        List<Integer> emptyList = Collections.emptyList();
        OddNumberExterminator exterminator = new OddNumberExterminator();

        //When
        List<Integer> evenList = exterminator.exterminate(emptyList);

        //Then
        assertFalse(evenList.isEmpty());
    }

    @DisplayName("Testing method with int")
    @Test
    void testCaseFilledList() {
        //Given
        List<Integer> filledList = List.of(1, 2, 3, 4, 5);
        OddNumberExterminator exterminator = new OddNumberExterminator();

        //When
        //List<Integer> result = exterminator.exterminate(filledList);
        Integer[] aray = {1,2,3,4};
        List<Integer>listOfInts = Arrays.asList(aray);
        List<Integer> evenNumbers = exterminator.exterminate(listOfInts);
        //Then
        assertEquals(Set.of( 2, 4), new HashSet<>(evenNumbers));
    }

}
