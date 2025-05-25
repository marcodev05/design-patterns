package com.patterns.creations.abstractfactory.exemple1.products;

public abstract class Checkbox {

    protected String color;
    protected String size;

    public Checkbox(String color, String size) {
        this.color = color;
        this.size = size;
    }
    public abstract void check();
}
