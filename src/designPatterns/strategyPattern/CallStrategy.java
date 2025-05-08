package designPatterns.strategyPattern;

public class CallStrategy implements MeetingStrategy{
    @Override
    public void meet() {
        System.out.println("Call the person");
    }
}
