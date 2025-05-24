package com.patterns.structural.decorator.exemple1;

public class ApplicationDecoratorService {

    public void test(){
        Pizza pizza = new JalepanoDecorator(new CheeseDecorator(new BasePizza()));
        System.out.println(pizza.bake());
        // base pizza + cheese + jalepano
    }
}
