package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends  AbstractPizzaOrderDecorator{

    public SalamiDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(7.0));
    }

    @Override
    public String getToppings(){
        return super.getToppings() + ", salami";
    }
}
