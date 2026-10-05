package ObserverDesignPattern;

import ObserverDesignPattern.ConcreteSubscribers.EmailSubscriber;
import ObserverDesignPattern.ConcreteSubscribers.PushNotificationSubscriber;
import ObserverDesignPattern.ConcreteSubscribers.YoutubeSubscriber;
import ObserverDesignPattern.Interfaces.Subscribers;
import ObserverDesignPattern.Interfaces.YoutubeChannel;

public class Main {
    public static void main(String[] args){
        Subscribers emailSubscriber=new EmailSubscriber("krishna.sadar23@vit.edu");
        Subscribers pushNotificationSubscriber = new PushNotificationSubscriber("Narzo60x5g");
        Subscribers youtubeSubscriber = new YoutubeSubscriber("Alex");

        YoutubeChannelImp goodCoding = new YoutubeChannelImp();
        goodCoding.addSubscriber(emailSubscriber);
        goodCoding.addSubscriber(pushNotificationSubscriber);
        goodCoding.addSubscriber(youtubeSubscriber);
        goodCoding.updateVideo("Desgin Pattern Tutorial");

    }
}
