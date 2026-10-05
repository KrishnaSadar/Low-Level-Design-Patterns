package AbstractDesignFactory.ConcreteVehicleFactory;

import AbstractDesignFactory.ConcreteVehicle.Honda;
import AbstractDesignFactory.Interfaces.Vehicle;
import AbstractDesignFactory.Interfaces.VehicleFactory;

public class HondaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Honda();
    }
}
