package designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Youtuber {

    private List<Subscriber> subscribers;

    public Youtuber() {
        this.subscribers = new ArrayList<>();
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
