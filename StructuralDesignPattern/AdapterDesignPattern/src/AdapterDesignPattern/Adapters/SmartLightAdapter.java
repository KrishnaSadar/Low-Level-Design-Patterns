package AdapterDesignPattern.Adapters;

import AdapterDesignPattern.Devices.SmartLight;
import AdapterDesignPattern.SmartDevice;
public class SmartLightAdapter implements SmartDevice {
    private SmartLight smartLight;

    public SmartLightAdapter(SmartLight smartLight){
        this.smartLight=smartLight;
    }
    @Override
    public void turnOn() {
        smartLight.connetToWifi();
        smartLight.switchOn();
    }

    @Override
    public void turnOf() {
        smartLight.switchOf();
        smartLight.disconnetToWifi();
    }
}
