package designPatterns.behavioralPattern.NullObjectPattern;

public class Cricket implements Sport{
    @Override
    public int getNumberOfPlayers() {
        return 11;
    }

    @Override
    public String getBiggestTournament() {
        return "ICC World Cup";
    }
}
