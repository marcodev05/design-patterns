package com.patterns.structural.decorator.exemple1;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + addCheese();
    }

    private String addCheese(){
        return "cheese";
    }
}
