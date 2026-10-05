package ObserverDesignPattern.Interfaces;

public interface YoutubeChannel {
    void addSubscriber(Subscribers subscribers);
    void removeSubscriber(Subscribers subscribers);
    void notifySubscriber();
}
