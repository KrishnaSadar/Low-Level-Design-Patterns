package CompositeDesignPattern.SmartComponets;

import CompositeDesignPattern.SmartComponent;

public class AirConditioner implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is now ON.");
    }

    @Override
    public void turnOf() {
        System.out.println("Air Conditioner is now OFF.");
    }
}
