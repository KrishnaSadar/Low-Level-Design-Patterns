package CommandDesignPattern.CoreClasses;

public class TV {
    public void turnOn(){
        System.out.println("Turning On TV");
    }
    public void turnOff(){
        System.out.println("Turning off the TV");
    }

    public void changeChannel(int channel){
        System.out.println("Chnaging the channel to: "+channel);
    }

    public void adjustVolumns(int volumn){
        System.out.println("Chnaging Volumn to : "+volumn);
    }
}
