package com.patterns.structural.decorator.exemple1;

public class JalepanoDecorator extends PizzaDecorator {
    public JalepanoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + addJalepano();
    }

    private String addJalepano() {
        return "Jalepano";
    }
}
