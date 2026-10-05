package StateDesignPattern;

import StateDesignPattern.ConcreteClasses.RedState;

public class TrafficLightContext {
    private TrafficLightState currentState;

    TrafficLightContext(){
        this.currentState=new RedState();
    }

    public void setState(TrafficLightState newState){
        this.currentState=newState;
    }
    public void next(){
        currentState.next(this);
    }
    public String getColor(){
        return currentState.getColor();
    }
}
