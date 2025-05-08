package designPatterns.observerPattern;

public class YoutubeDriver {

    public static void main(String[] args) {
        Youtuber youtuber = new Youtuber();
        GoogleSubscriber subscriber1 = new GoogleSubscriber();
        FacebookSubscriber subscriber2 = new FacebookSubscriber();

        youtuber.subscribe(subscriber1);
        youtuber.notifySubscribers();

        youtuber.subscribe(subscriber2);
        youtuber.notifySubscribers();

        youtuber.unsubscribe(subscriber1);
        youtuber.notifySubscribers();
    }

}
