package designPatterns.structuralPattern.decorator.NotificationExample;

public class NotificationDriver {

    public static void main(String[] args) {
        Notifier notifier = new NotifierImpl();
        notifier.send();

        notifier = new SlackNotifier(new FacebookNotifier(notifier));
        notifier.send();

        notifier = new SMSNotifier(notifier);
        notifier.send();
    }

}
