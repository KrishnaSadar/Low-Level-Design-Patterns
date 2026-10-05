package CommandDesignPattern.ConcreteCommand;

import CommandDesignPattern.Command;
import CommandDesignPattern.CoreClasses.TV;

public class TurnOnCommand implements Command {
    private TV tv;

    public TurnOnCommand(TV tv){
        this.tv=tv;
    }
    @Override
    public void exucute() {
        tv.turnOn();
    }
}
