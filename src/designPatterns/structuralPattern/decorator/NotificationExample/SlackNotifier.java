package designPatterns.structuralPattern.decorator.NotificationExample;

public class SlackNotifier extends NotifierDecorator{

    private Notifier notifier;

    public SlackNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        System.out.println("Sending Slack notification...");
        notifier.send();
    }
}
