package ObserverDesignPattern.ConcreteSubscribers;

import ObserverDesignPattern.Interfaces.Subscribers;

public class PushNotificationSubscriber implements Subscribers {
    private String deviceName;
    public PushNotificationSubscriber(String deviceName){
        this.deviceName=deviceName;
    }

    @Override
    public void update(String video){
        System.out.println("Notifying the Push Notification Subscriber "+deviceName+" about the new Video: "+video);
    }
}
