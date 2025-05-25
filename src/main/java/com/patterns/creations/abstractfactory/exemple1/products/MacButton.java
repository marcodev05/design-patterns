package com.patterns.creations.abstractfactory.exemple1.products;

import com.patterns.creations.abstractfactory.exemple1.products.Button;

public class MacButton extends Button {

    public MacButton(String color, String size) {
        super(color, size);
    }

    @Override
    public void paint() {

    }
}
