package com.patterns.creations.abstractfactory.exemple1;

import com.patterns.creations.abstractfactory.exemple1.products.Button;
import com.patterns.creations.abstractfactory.exemple1.products.Checkbox;
import com.patterns.creations.abstractfactory.exemple1.products.WinButton;
import com.patterns.creations.abstractfactory.exemple1.products.WinCheckbox;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton(String color, String size) {
        return new WinButton(color, size);
    }

    @Override
    public Checkbox createCheckbox(String color, String size) {
        return new WinCheckbox(color, size);
    }
}
