package BridgeDesignPattern;

import BridgeDesignPattern.Renders.RastorRenderer;
import BridgeDesignPattern.Renders.VectorRenderer;
import BridgeDesignPattern.Shapes.Circle;
import BridgeDesignPattern.Shapes.Reactangle;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Renderer rastorRenderer=new RastorRenderer();
        Renderer vectorRenderer=new VectorRenderer();
        Shape rasterCircle =new Circle(rastorRenderer,20);
        Shape vectorCircle = new Circle(vectorRenderer, 5);
        Shape rasterRectangle = new Reactangle(rastorRenderer, 10.0, 5.0);
        Shape vectorRectangle = new Reactangle(vectorRenderer, 10, 5);
        rasterCircle.draw();
        vectorCircle.draw();
        rasterRectangle.draw();
        vectorRectangle.draw();
    }
}
