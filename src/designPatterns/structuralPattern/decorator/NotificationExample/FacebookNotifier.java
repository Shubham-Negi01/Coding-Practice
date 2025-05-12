package designPatterns.structuralPattern.decorator.NotificationExample;

public class FacebookNotifier extends NotifierDecorator{

    private Notifier notifier;

    public FacebookNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        System.out.println("Sending Facebook notification...");
        notifier.send();
    }
}
