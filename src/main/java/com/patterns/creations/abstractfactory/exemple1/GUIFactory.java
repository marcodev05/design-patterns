package com.patterns.creations.abstractfactory.exemple1;

import com.patterns.creations.abstractfactory.exemple1.products.Button;
import com.patterns.creations.abstractfactory.exemple1.products.Checkbox;

public interface GUIFactory {

    Button createButton(String color, String size);
    Checkbox createCheckbox(String color, String size);
}
