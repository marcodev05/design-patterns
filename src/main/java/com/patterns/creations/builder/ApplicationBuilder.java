package com.patterns.creations.builder;

/**
 * utilisation
 */
public class ApplicationBuilder {
    public Burger create(){
        return new Burger.BurgerBuilder()
                .egg(true)
                .size("M")
                .lettuce(false)
                .build();
    }
}
