package AdapterDesignPattern.Adapters;

import AdapterDesignPattern.SmartDevice;
import AdapterDesignPattern.Devices.AirConditioner;
public class AirConditionerAdapter implements SmartDevice {
    private AirConditioner airConditioner;

    public AirConditionerAdapter(AirConditioner airConditioner){
        this.airConditioner=airConditioner;
    }
    @Override
    public void turnOn() {
        airConditioner.connectViaBlutooth();
        airConditioner.startCooling();
    }

    @Override
    public void turnOf() {
        airConditioner.stopCooling();
        airConditioner.DisconnectViaBlutooth();
    }
}
