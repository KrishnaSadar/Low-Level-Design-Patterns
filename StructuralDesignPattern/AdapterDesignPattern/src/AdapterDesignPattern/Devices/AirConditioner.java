package AdapterDesignPattern.Devices;

public class AirConditioner {
    public void connectViaBlutooth(){
        System.out.println("Connecting AirConditioner through Blutooth.");
    }
    public void stopCooling(){
        System.out.println("AirConditioner Stopped Cooling.");
    }
    public void startCooling(){
        System.out.println("AirConditioner Started Cooling.");
    }
    public void DisconnectViaBlutooth(){
        System.out.println("DisConnecting AirConditioner through Blutooth.");

    }
}
