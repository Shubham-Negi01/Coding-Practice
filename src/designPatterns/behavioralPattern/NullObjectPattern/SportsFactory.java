package designPatterns.behavioralPattern.NullObjectPattern;

public class SportsFactory {

    public static Sport createSportInstance(String sportName) {
        return switch (sportName) {
            case "football" -> new Football();
            case "cricket" -> new Cricket();
            default -> new NullObject(); // this will help avoid NPE.
        };
    }

}
