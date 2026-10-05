package CompositeDesignPattern.SmartComponets;

import CompositeDesignPattern.SmartComponent;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartComponent implements SmartComponent {
    private List<SmartComponent>smartComponents=new ArrayList<>();

    public void addComponet(SmartComponent smartComponent){
        smartComponents.add(smartComponent);
    }
    public void removeComponet(SmartComponent smartComponent){
        smartComponents.remove(smartComponent);
    }
    @Override
    public void turnOn() {
        for(SmartComponent smartComponent:smartComponents){
            smartComponent.turnOn();
        }
    }

    @Override
    public void turnOf() {
        for(SmartComponent smartComponent:smartComponents){
            smartComponent.turnOf();
        }
    }
}
