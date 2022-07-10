package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);


        //When
        double addResult = calculator.add(2.0,2.0);
        double subResult = calculator.sub(3.0,1.0);
        double mulResult = calculator.mul(2.0,2.0);
        double divResult = calculator.div(2.0,2.0);
        //Then

        assertEquals(4.0 ,addResult );
        assertEquals(2.0 ,subResult );
        assertEquals(4.0 ,mulResult );
        assertEquals(1.0 ,divResult );

    }
}
