package AdapterDesignPattern.Devices;

public class SmartLight {
    public void connetToWifi(){
        System.out.println("Connecting to SmartLight through wifi");
    }
    public void switchOn(){
        System.out.println("switching on smart light");
    }
    public void switchOf(){
        System.out.println("switching of smart light");
    }
    public void disconnetToWifi(){
        System.out.println("disconnecting to SmartLight through wifi");
    }
}
