package ObserverDesignPattern.ConcreteSubscribers;

import ObserverDesignPattern.Interfaces.Subscribers;

public class EmailSubscriber implements Subscribers {
    private String email;

    public EmailSubscriber(String email){
        this.email=email;
    }

    @Override
    public void update(String video){
        System.out.println("Notifying Email Subscriber with mail id: "+email+" about the new video: "+video);
    }
}
