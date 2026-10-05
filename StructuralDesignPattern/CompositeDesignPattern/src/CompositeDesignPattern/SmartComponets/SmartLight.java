package CompositeDesignPattern.SmartComponets;

import CompositeDesignPattern.SmartComponent;

public class SmartLight implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("Smart Light is now ON.");
    }

    @Override
    public void turnOf() {
        System.out.println("Smart Light is now OFF.");
    }
}
