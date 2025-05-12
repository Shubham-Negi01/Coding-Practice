package designPatterns.structuralPattern.decorator.NotificationExample;

public class SMSNotifier extends NotifierDecorator {

    private Notifier notifier;

    public SMSNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS notification...");
        notifier.send();
    }
}
