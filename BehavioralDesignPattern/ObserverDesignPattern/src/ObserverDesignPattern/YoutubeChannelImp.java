package ObserverDesignPattern;

import ObserverDesignPattern.Interfaces.Subscribers;
import ObserverDesignPattern.Interfaces.YoutubeChannel;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImp implements YoutubeChannel {
    private List<Subscribers> subscribers = new ArrayList<>();
    private String video;
    @Override
    public void addSubscriber(Subscribers subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscribers subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for(Subscribers subscriber:subscribers){
            subscriber.update(video);
        }
    }

    public void updateVideo(String video){
        this.video=video;
        notifySubscriber();
    }
}
