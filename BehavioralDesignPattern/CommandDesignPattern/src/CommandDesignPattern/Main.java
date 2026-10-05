package CommandDesignPattern;

import CommandDesignPattern.ConcreteCommand.*;
import CommandDesignPattern.CoreClasses.RemoteControl;
import CommandDesignPattern.CoreClasses.TV;

public class Main {
    public static void main(String[] args){
        TV tv=new TV();
        Command turnOnCommand=new TurnOnCommand(tv);
        Command turnOffCommand=new TurnOffCommand(tv);
        Command changeChannelCommad=new ChnageChannel(tv,20);
        Command adjustVolumn=new AdjustVolumnCommand(tv, 20);
        RemoteControl remoteControl=new RemoteControl();
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(changeChannelCommad);
        remoteControl.pressButton();
        remoteControl.setCommand(adjustVolumn);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }
}
