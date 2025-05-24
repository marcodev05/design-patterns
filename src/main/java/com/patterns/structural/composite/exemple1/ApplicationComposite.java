package com.patterns.structural.composite.exemple1;

public class ApplicationComposite {

    public void exemple(){

        FormeGeometrique cercle = new FormeGeometrique("cercle");
        FormeGeometrique carre = new FormeGeometrique("carre");
        FormeGeometrique rectangle = new FormeGeometrique("rectancle");

        GroupeForms groupeForms = new GroupeForms("groupe1");

        groupeForms.addForme(cercle);
        groupeForms.addForme(carre);

        rectangle.afficher(); //Forme: rectangle
        carre.afficher(); // Forme carre
        groupeForms.afficher(); // Forme: cercle, Forme: carre
    }
}
