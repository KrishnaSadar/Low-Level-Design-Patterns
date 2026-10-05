package StateDesignPattern.ConcreteClasses;

import StateDesignPattern.TrafficLightContext;
import StateDesignPattern.TrafficLightState;

public class GreenState implements TrafficLightState {

    @Override
    public void next(TrafficLightContext context){
        context.setState(new RedState());
        System.out.println("Changing the state from Green to Red");
    }
    public String getColor(){
        return "Green";
    }
}
