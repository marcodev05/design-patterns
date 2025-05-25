package com.patterns.creations.abstractfactory.exemple1.products;

import com.patterns.creations.abstractfactory.exemple1.products.Button;

public class WinButton extends Button {

    public WinButton(String color, String size) {
        super(color, size);
    }

    @Override
    public void paint() {

    }
}
