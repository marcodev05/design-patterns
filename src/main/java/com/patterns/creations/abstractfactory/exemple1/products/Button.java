package com.patterns.creations.abstractfactory.exemple1.products;

public abstract class Button {

    protected String color;
    protected String size;

    public Button(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public abstract void paint();
}
