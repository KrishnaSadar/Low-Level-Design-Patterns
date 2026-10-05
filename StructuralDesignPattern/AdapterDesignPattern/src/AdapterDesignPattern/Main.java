package AdapterDesignPattern;

import AdapterDesignPattern.Adapters.AirConditionerAdapter;
import AdapterDesignPattern.Adapters.CoffeMachineAdapter;
import AdapterDesignPattern.Adapters.SmartLightAdapter;
import AdapterDesignPattern.Devices.AirConditioner;
import AdapterDesignPattern.Devices.CoffeMachine;
import AdapterDesignPattern.Devices.SmartLight;
import java.util.List;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        SmartDevice airConditionerAdapter=new AirConditionerAdapter(new AirConditioner());
        SmartDevice coffeMachineAdapter=new CoffeMachineAdapter(new CoffeMachine());
        SmartDevice smartLightAdapter=new SmartLightAdapter(new SmartLight());
        List<SmartDevice> smartDeviceList =
                Arrays.asList(
                        airConditionerAdapter,
                        smartLightAdapter,
                        coffeMachineAdapter
                );
        for(SmartDevice smartDevice:smartDeviceList){
            smartDevice.turnOn();
        }
        for(SmartDevice smartDevice:smartDeviceList){
            smartDevice.turnOf();
        }
    }
}
