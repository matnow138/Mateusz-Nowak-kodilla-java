package com.kodilla.stream.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    ArrayAverage arrayAverage = new ArrayAverage();




    //Test for printing - method printList - only for MNO
   /* @Test
    void testPrintOut(){
        //Given
        int[] testList = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        //When
        arrayAverage.printList(testList);
        //Then

    }*/

    @Test
    void testGetAverage(){
        //Given
        int[] testList = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        //When
        double average = ArrayOperations.getAverage(testList);
        //Then
        assertEquals(9.5, average);
    }

}
