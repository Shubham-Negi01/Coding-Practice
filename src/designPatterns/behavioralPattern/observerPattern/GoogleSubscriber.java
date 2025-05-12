package designPatterns.behavioralPattern.observerPattern;

public class GoogleSubscriber implements Subscriber{

    private Youtuber youtuber;

    public GoogleSubscriber(Youtuber youtuber) {
        this.youtuber = youtuber;
    }

    @Override
    public void notificationAlert() {
        System.out.println("Email to the user. " + youtuber.getName() + " has now " + youtuber.getSubscribers().size() + " subscribers!!!");
    }
}
