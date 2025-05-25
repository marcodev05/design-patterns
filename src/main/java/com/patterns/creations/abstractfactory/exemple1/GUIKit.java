package com.patterns.creations.abstractfactory.exemple1;

import com.patterns.creations.abstractfactory.exemple1.products.Button;
import com.patterns.creations.abstractfactory.exemple1.products.Checkbox;

public class GUIKit {

    private Button button;
    private Checkbox checkbox;

    public GUIKit(GUIFactory guiFactory, String color, String size) {
        this.button = guiFactory.createButton(color, size);
        this.checkbox = guiFactory.createCheckbox(color, size);
    }

    // others methods

}
