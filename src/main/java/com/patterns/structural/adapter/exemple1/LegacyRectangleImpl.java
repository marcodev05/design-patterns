package com.patterns.structural.adapter.exemple1;

public class LegacyRectangleImpl implements LegacyRectangle{
    @Override
    public void draw(int x, int y, int width, int height) {
        System.out.println("The old implementation to be reuse");
    }
}
