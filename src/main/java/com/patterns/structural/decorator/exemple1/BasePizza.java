package com.patterns.structural.decorator.exemple1;

public class BasePizza implements Pizza{
    @Override
    public String bake() {
        return "Base pizza";
    }
}
