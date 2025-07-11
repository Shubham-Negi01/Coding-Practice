package designPatterns.behavioralPattern.NullObjectPattern;

public class NullObject implements Sport{
    @Override
    public int getNumberOfPlayers() {
        return 0;
    }

    @Override
    public String getBiggestTournament() {
        return "";
    }
}
