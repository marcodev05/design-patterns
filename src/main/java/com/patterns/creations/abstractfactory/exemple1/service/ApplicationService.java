package com.patterns.creations.abstractfactory.exemple1.service;

import com.patterns.creations.abstractfactory.exemple1.GUIFactory;
import com.patterns.creations.abstractfactory.exemple1.GUIKit;
import com.patterns.creations.abstractfactory.exemple1.MacFactory;
import com.patterns.creations.abstractfactory.exemple1.WinFactory;

public class ApplicationService {

    public String createAnything(String os){

        final GUIFactory factory = getGuiFactoryInstance(os);

        final GUIKit kit = new GUIKit(factory, "red", "10");
        processCommand(kit);
        return "Created successfully";
    }

    public void processCommand(GUIKit kit) {
        //check stock
        // calculation
        // process payment
    }

    private static GUIFactory getGuiFactoryInstance(String os) {
        return switch (os) {
            case "WINDOWS" -> new WinFactory();
            case "MAC" -> new MacFactory();
            default -> throw new IllegalArgumentException("Invalid os " + os);
        };
    }
}
