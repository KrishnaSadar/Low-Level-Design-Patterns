package CommandDesignPattern.ConcreteCommand;

import CommandDesignPattern.Command;
import CommandDesignPattern.CoreClasses.TV;

public class TurnOffCommand implements Command {
    private TV tv;
    public TurnOffCommand(TV tv){
        this.tv= tv;
    }
    @Override
    public void exucute(){
        tv.turnOff();
    }
}
