package com.patterns.structural.adapter.exemple1;

/**
 * son utilisation dans service
 */
public class ApplicationAdapterService {

    public void calculate(){
        LegacyRectangle legacyRectangle = new LegacyRectangleImpl();
        RectangleVaoVao rectangleVaoVao = new RectangleAdapter(legacyRectangle);
        rectangleVaoVao.drawRectangle(10,20,30,40);
    }

}
