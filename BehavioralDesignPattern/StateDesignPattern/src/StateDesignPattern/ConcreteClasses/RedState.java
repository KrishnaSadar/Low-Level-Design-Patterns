package StateDesignPattern.ConcreteClasses;

import StateDesignPattern.TrafficLightContext;
import StateDesignPattern.TrafficLightState;

public class RedState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context){
        context.setState(new YellowState());
        System.out.println("Changing the state from Red to yellow");
    }
    @Override
    public String getColor(){
        return "Red";
    }
}
