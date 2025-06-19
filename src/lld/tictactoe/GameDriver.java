package lld.tictactoe;

import java.io.IOException;

public class GameDriver {


    public static void main(String[] args) throws IOException {
        Game game = new Game(3,2);
        game.startGame();
    }
}
