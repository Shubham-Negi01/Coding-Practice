package designPatterns.behavioralPattern.NullObjectPattern;

public class SportsDriver {

    public static void main(String[] args) {
        //if a parameter is passed which doest match with any sport, then NullObject will be returned.
        //Therefore we dont have to handle null check to avoid NPE.
        Sport sport = SportsFactory.createSportInstance("ngbf");

        System.out.println("Number of players: " + sport.getNumberOfPlayers());
        System.out.println("Biggest Tournament: " + sport.getBiggestTournament());
    }

}
