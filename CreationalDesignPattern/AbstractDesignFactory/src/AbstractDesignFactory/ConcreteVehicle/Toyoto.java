package AbstractDesignFactory.ConcreteVehicle;

import AbstractDesignFactory.Interfaces.Vehicle;

public class Toyoto implements Vehicle {
    @Override
    public void start() {
        System.out.println("Toyoto is starting");
    }

    @Override
    public void stop() {
        System.out.println("Toyoto is stop");
    }
}
