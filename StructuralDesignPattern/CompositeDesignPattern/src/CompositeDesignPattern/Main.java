package CompositeDesignPattern;

import CompositeDesignPattern.SmartComponets.AirConditioner;
import CompositeDesignPattern.SmartComponets.CompositeSmartComponent;
import CompositeDesignPattern.SmartComponets.SmartLight;

public class Main {
    public static void main(String[] args){
        SmartComponent airConditioner = new AirConditioner();
        SmartComponent smartLight = new SmartLight();
        CompositeSmartComponent room1=new CompositeSmartComponent();
        room1.addComponet(airConditioner);
        room1.addComponet(smartLight);
        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room2.addComponet(new AirConditioner());
        room2.addComponet(new SmartLight());
        CompositeSmartComponent floor = new CompositeSmartComponent();
        floor.addComponet(room1);
        floor.addComponet(room2);
        // Create the house and add floors
        CompositeSmartComponent house = new CompositeSmartComponent();
        house.addComponet(floor);
        // Control the entire house
        System.out.println("Turning ON all devices in the house:");
        house.turnOn();
        System.out.println(" Turning OFF all devices in the house:");
        house.turnOf();
        // Control a single floor
        System.out.println(" Turning ON all devices on the first floor:");
        floor.turnOn();
        System.out.println(" Turning OFF all devices on the first floor:");
        floor.turnOf();
        // Control a single room
        System.out.println(" Turning ON all devices in Room 1:");
        room1.turnOn();
        System.out.println(" Turning OFF all devices in Room 1:");
        room1.turnOf();
    }
}
