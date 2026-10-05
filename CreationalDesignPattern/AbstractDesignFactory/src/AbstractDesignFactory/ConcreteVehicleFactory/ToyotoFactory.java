package AbstractDesignFactory.ConcreteVehicleFactory;

import AbstractDesignFactory.ConcreteVehicle.Toyoto;
import AbstractDesignFactory.Interfaces.Vehicle;
import AbstractDesignFactory.Interfaces.VehicleFactory;

public class ToyotoFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Toyoto();
    }
}
