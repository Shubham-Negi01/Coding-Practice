package designPatterns.observerPattern;

public class GoogleSubscriber implements Subscriber{


    @Override
    public void notificationAlert() {
        System.out.println("Email to the user.");
    }
}
