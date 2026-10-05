package AbstractDesignFactory.ConcreteVehicleFactory;

import AbstractDesignFactory.ConcreteVehicle.BMW;
import AbstractDesignFactory.Interfaces.Vehicle;
import AbstractDesignFactory.Interfaces.VehicleFactory;

public class BMWFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new BMW();
    }
}
