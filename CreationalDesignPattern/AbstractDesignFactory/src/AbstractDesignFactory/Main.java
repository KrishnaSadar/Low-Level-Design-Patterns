package AbstractDesignFactory;

import AbstractDesignFactory.ConcreteVehicleFactory.HondaFactory;
import AbstractDesignFactory.ConcreteVehicleFactory.ToyotoFactory;
import AbstractDesignFactory.Interfaces.Vehicle;
import AbstractDesignFactory.Interfaces.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle honda = hondaFactory.createVehicle();
        honda.start();
        honda.stop();
        VehicleFactory toyotaFactory = new ToyotoFactory();
        Vehicle toyota = toyotaFactory.createVehicle();
        toyota.start();
        toyota.stop();
    }
}
