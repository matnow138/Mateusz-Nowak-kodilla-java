package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaDecoratorTestSuite {


    @Test
    public void salamiCostTest(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new CheeseDecorator(order);
        order = new SalamiDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        //Then

        assertEquals(new BigDecimal(27), cost);
    }

    public void salamiToppingTest(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new CheeseDecorator(order);
        order = new SalamiDecorator(order);
        //When

        //Then

        assertEquals("Pizza dough, tomato sauce, cheese, salami", order.getToppings());
    }
}
