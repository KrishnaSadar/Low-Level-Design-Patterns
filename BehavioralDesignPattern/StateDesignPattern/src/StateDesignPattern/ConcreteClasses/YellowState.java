package StateDesignPattern.ConcreteClasses;

import StateDesignPattern.TrafficLightContext;
import StateDesignPattern.TrafficLightState;

public class YellowState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        context.setState(new GreenState());
        System.out.println("Changing the State from Yellow to green");
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}
