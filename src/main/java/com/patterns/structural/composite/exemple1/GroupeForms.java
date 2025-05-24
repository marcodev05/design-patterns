package com.patterns.structural.composite.exemple1;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite groupe de forme geometrique
 */
public class GroupeForms implements Forme {

    private String name;

    private List<Forme> formes = new ArrayList<>();

    public GroupeForms(String name) {
        this.name = name;
    }

    public void addForme(Forme forme){
        formes.add(forme);
    }

    public void deleteForme(Forme forme){
        formes.remove(forme);
    }

    @Override
    public void afficher() {
        for (Forme forme : formes){
            forme.afficher();
        }
    }

}
