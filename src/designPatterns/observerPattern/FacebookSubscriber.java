package designPatterns.observerPattern;

public class FacebookSubscriber implements Subscriber{


    @Override
    public void notificationAlert() {
        System.out.println("Send message on messenger.");
    }
}
