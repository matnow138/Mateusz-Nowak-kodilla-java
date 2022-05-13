package com.kodilla.testing.collection;
import java.util.*;


import org.junit.jupiter.api.*;

@DisplayName("Test of odd numbers exterminator")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){ System.out.println("Test case: start");}
    @AfterEach
    public void after(){System.out.println("Test case: end");}
    @BeforeAll
    public static void beforeAll(){System.out.println("Odd numbers test: begin");}
    @AfterAll
    public static void afterAll(){System.out.println("Odd numbers test: end");}

    @DisplayName("Testing method with empty list")
    @Test
    void testCaseEmptyList () {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumberExterminator list = new OddNumberExterminator();
        //When

        List<Integer> result = list.exterminate(emptyList);
        //Then
        for(Integer temp:result){
            if(temp%2!=0){
                System.out.println("Error");
                break;
            }
        }
        System.out.println("It Works!");
    }
    @DisplayName("Testing method with random int")
    @Test
    void testCaseFilledList () {
        //Given
        List<Integer> filledList = new ArrayList<>();
        OddNumberExterminator list = new OddNumberExterminator();
        Random random = new Random();

        for(int i=0;i<100;i++) {
            filledList.add(random.nextInt(100));
        }

        //When

        List<Integer> result = list.exterminate(filledList);
        //Then
        for(Integer temp:result){

            if(temp%2!=0){
                System.out.println("Error");
                break;
            }

            }
        System.out.println("It works!");

    }

}
