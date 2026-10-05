package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topic  {
    private final String topicId;
    private final String topicName;
    private final List<Message> messages;

    public Topic(final String topicName, final String topicId){
        this.topicId=topicId;
        this.topicName=topicName;
        messages=new ArrayList<>();
    }

    public String getTopicId(){
        return topicId;
    }
    public String getTopicName(){
        return topicName;
    }
    public synchronized void addMessage(Message message){
        messages.add(message);
    }

    public synchronized List<Message> getMessages(){
        return Collections.unmodifiableList(messages);
    }
}
