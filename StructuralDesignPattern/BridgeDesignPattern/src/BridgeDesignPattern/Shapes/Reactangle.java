package BridgeDesignPattern.Shapes;

import BridgeDesignPattern.Renderer;
import BridgeDesignPattern.Shape;

public class Reactangle extends Shape {
    private double width;
    private double height;

    public Reactangle(Renderer renderer,double width, double height){
        super(renderer);
        this.width=width;
        this.height=height;
    }
    public void draw(){
        renderer.renderReactangle(width,height);
    }
}
