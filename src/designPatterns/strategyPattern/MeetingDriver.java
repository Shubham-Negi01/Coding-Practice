package designPatterns.strategyPattern;

public class MeetingDriver {

    public static void main(String[] args) {
        MeetingManager manager = new MeetingManager(new CallStrategy());
        manager.startMeet();
        manager = new MeetingManager(new ZoomStrategy());
        manager.startMeet();
    }

}
