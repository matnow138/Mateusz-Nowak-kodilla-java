package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.AbstractTaxiOrderDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class AbstractPizzaOrderDecorator implements PizzaOrder {

    private PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder){
        this.pizzaOrder=pizzaOrder;
    }

    @Override
    public BigDecimal getCost(){
        return pizzaOrder.getCost();
    }

    @Override
    public String getToppings(){
        return pizzaOrder.getToppings();
    }
}
