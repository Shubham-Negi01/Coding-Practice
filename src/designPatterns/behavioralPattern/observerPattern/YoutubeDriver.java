package designPatterns.behavioralPattern.observerPattern;

public class YoutubeDriver {

    public static void main(String[] args) {
        Youtuber youtuber = new Youtuber("Ne0_4Life");
        GoogleSubscriber subscriber1 = new GoogleSubscriber(youtuber);
        FacebookSubscriber subscriber2 = new FacebookSubscriber(youtuber);

        youtuber.subscribe(subscriber1);
        youtuber.notifySubscribers();

        youtuber.subscribe(subscriber2);
        youtuber.notifySubscribers();

        youtuber.unsubscribe(subscriber1);
        youtuber.notifySubscribers();
    }

}
