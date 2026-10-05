package FactoryDesignPattern.ConcreteVehicles;

import FactoryDesignPattern.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(type.equals("Car")){
            return new Car();
        }else if(type.equals("Bike")){
            return new Bike();
        }else if(type.equals("Truck")){
            return new Truck();
        }else{
            throw new IllegalArgumentException("Unknown Vehicle type");
        }
    }
}
