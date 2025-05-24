package com.patterns.structural.composite.exemple1;

import com.patterns.structural.composite.exemple1.Forme;

public class FormeGeometrique implements Forme {

    private String name;

    public FormeGeometrique(String name) {
        this.name = name;
    }

    @Override
    public void afficher() {
        System.out.println("Forme : " + name);
    }
}
