package ObserverDesignPattern.ConcreteSubscribers;

import ObserverDesignPattern.Interfaces.Subscribers;

public class YoutubeSubscriber implements Subscribers {
    private String name;

    public YoutubeSubscriber(String name){
        this.name=name;
    }

    @Override
    public void update(String video){
        System.out.println("Notifying Youtube Subscrier "+name+" about the new Video: "+video);
    }
}
