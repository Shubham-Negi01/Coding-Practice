package designPatterns.behavioralPattern.strategyPattern;

public class ZoomStrategy implements MeetingStrategy{
    @Override
    public void meet() {
        System.out.println("Create zoom meeting");
    }
}
