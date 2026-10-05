package BridgeDesignPattern.Shapes;

import BridgeDesignPattern.Renderer;
import BridgeDesignPattern.Shape;

public class Circle extends Shape {
    private double radius;
    public Circle(Renderer renderer,double radius) {
        super(renderer);
        this.radius=radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }
}
