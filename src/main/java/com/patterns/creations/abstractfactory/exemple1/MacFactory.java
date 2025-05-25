package com.patterns.creations.abstractfactory.exemple1;

import com.patterns.creations.abstractfactory.exemple1.products.Button;
import com.patterns.creations.abstractfactory.exemple1.products.Checkbox;
import com.patterns.creations.abstractfactory.exemple1.products.MacButton;
import com.patterns.creations.abstractfactory.exemple1.products.MacCheckbox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton(String color, String size) {
        return new MacButton(color, size);
    }

    @Override
    public Checkbox createCheckbox(String color, String size) {
        return new MacCheckbox(color, size);
    }
}
