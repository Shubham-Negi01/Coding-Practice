package machine_coding.snakes_and_ladders;

import java.util.HashMap;

public class GameBoard {

    HashMap<Integer,Integer> snakes;
    HashMap<Integer,Integer> ladders;

    public GameBoard(HashMap<Integer, Integer> snakes, HashMap<Integer, Integer> ladders) {
        this.snakes = snakes;
        this.ladders = ladders;
    }

    public HashMap<Integer, Integer> getSnakes() {
        return snakes;
    }

    public void setSnakes(HashMap<Integer, Integer> snakes) {
        this.snakes = snakes;
    }

    public HashMap<Integer, Integer> getLadders() {
        return ladders;
    }

    public void setLadders(HashMap<Integer, Integer> ladders) {
        this.ladders = ladders;
    }
}
