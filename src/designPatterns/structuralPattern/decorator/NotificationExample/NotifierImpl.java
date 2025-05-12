package designPatterns.structuralPattern.decorator.NotificationExample;

public class NotifierImpl implements Notifier{

    @Override
    public void send() {
        System.out.println("Sending notification...");
    }
}
