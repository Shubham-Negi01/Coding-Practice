package designPatterns.behavioralPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Youtuber {

    private String name;
    private List<Subscriber> subscribers;

    public Youtuber(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        if(subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
        }
    }

    public void notifySubscribers() {
        System.out.println("Sending alert to " + subscribers.size() + " subscribers....");
        for(Subscriber s: subscribers) {
            s.notificationAlert();
        }
    }

}
