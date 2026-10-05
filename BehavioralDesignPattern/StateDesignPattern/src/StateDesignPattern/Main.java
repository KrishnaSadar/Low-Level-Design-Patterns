package StateDesignPattern;

import StateDesignPattern.ConcreteClasses.RedState;

public class Main {
    public static void main(String[] args){
        TrafficLightContext context=new TrafficLightContext();
        System.out.println(context.getColor());
        context.next();
        context.next();
        context.next();
        context.next();
    }
}
