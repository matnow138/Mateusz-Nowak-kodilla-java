package com.kodilla.patterns.singleteon;

import com.kodilla.patterns.singleton.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLog(){
        logger = Logger.INSTANCE;
        logger.log("its alive!");

    }

    @Test
    void testGetLastLog(){
        //Given
        //When
        String log = logger.getLastLog();

        //Then
        assertEquals(log,"its alive!");


    }
}
