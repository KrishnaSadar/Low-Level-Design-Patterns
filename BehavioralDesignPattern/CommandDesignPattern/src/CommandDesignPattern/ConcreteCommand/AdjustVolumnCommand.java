package CommandDesignPattern.ConcreteCommand;

import CommandDesignPattern.Command;
import CommandDesignPattern.CoreClasses.TV;

public class AdjustVolumnCommand implements Command {
    private TV tv;
    private int volume;

    public AdjustVolumnCommand(TV tv,int volume){
        this.tv=tv;
        this.volume=volume;
    }
    @Override
    public void exucute(){
        tv.adjustVolumns(volume);
    }
}
