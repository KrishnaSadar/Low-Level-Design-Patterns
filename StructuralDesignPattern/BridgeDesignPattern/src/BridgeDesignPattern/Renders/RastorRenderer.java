package BridgeDesignPattern.Renders;

import BridgeDesignPattern.Renderer;

public class RastorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Raster Rendering: Drawing Circle with radius " + radius);
    }

    @Override
    public void renderReactangle(double width, double height) {
        System.out.println("Raster Rendering: Drawing Rectangle with width " + width + " and height " + height);
    }
}
