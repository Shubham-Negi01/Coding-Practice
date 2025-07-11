package designPatterns.behavioralPattern.NullObjectPattern;

public class Football implements Sport{
    @Override
    public int getNumberOfPlayers() {
        return 11;
    }

    @Override
    public String getBiggestTournament() {
        return "FIFA World Cup";
    }
}
