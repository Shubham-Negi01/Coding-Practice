package designPatterns.observerPattern;

public class FacebookSubscriber implements Subscriber{

    private Youtuber youtuber;

    public FacebookSubscriber(Youtuber youtuber) {
        this.youtuber = youtuber;
    }

    @Override
    public void notificationAlert() {
        System.out.println("Send message on messenger. " + youtuber.getName() + " has now " + youtuber.getSubscribers().size() + " subscribers!!!");
    }
}
