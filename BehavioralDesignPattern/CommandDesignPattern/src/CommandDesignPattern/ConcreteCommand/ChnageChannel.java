package CommandDesignPattern.ConcreteCommand;

import CommandDesignPattern.Command;
import CommandDesignPattern.CoreClasses.TV;

public class ChnageChannel implements Command {
    private TV tv;
    private int channel;

    public ChnageChannel(TV tv,int channel){
        this.tv=tv;
        this.channel=channel;
    }
    @Override
    public void exucute(){
        tv.changeChannel(channel);
    }
}
