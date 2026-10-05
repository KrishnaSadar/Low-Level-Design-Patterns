package CommandDesignPattern.CoreClasses;

import CommandDesignPattern.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void pressButton(){
        this.command.exucute();
    }
}
