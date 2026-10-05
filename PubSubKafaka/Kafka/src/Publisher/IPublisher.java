package Publisher;

import model.Message;
import model.Topic;

public interface IPublisher {
    String getId();
    void publish(String topicId, Message message) throws IllegalArgumentException;
}
