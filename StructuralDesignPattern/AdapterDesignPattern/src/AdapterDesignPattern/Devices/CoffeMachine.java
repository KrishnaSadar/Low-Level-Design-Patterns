package AdapterDesignPattern.Devices;

public class CoffeMachine {
    public void initilizeZeegbeConnection(){
        System.out.println("Coffee Machine is Connected Through Zig Bee");
    }
    public void startBrewing(){
        System.out.println("Coffee Machine Started brewing");
    }
    public void stopBrewing(){
        System.out.println("Coffee Machine Stopped brewing");
    }
    public void terminateZeegbeConnection(){
        System.out.println("Coffee Machine is Dis-Connected Through Zig Bee");
    }
}
