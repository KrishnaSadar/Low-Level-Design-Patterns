package AdapterDesignPattern.Adapters;

import AdapterDesignPattern.Devices.CoffeMachine;
import AdapterDesignPattern.SmartDevice;

public class CoffeMachineAdapter implements SmartDevice {
    private CoffeMachine coffeMachine;
    public CoffeMachineAdapter(CoffeMachine coffeMachine){
        this.coffeMachine=coffeMachine;
    }
    @Override
    public void turnOn() {
        coffeMachine.initilizeZeegbeConnection();
        coffeMachine.startBrewing();
    }

    @Override
    public void turnOf() {
        coffeMachine.stopBrewing();
        coffeMachine.terminateZeegbeConnection();
    }
}
