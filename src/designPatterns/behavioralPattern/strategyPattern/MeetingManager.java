package designPatterns.behavioralPattern.strategyPattern;

public class MeetingManager {

    MeetingStrategy meetingStrategy;

    public MeetingManager(MeetingStrategy meetingStrategy) {
        this.meetingStrategy = meetingStrategy;
    }

    public void startMeet() {
        meetingStrategy.meet();
    }
}
