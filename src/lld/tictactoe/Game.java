package lld.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private Queue<Player> players;
    private Board board;

    Game(int size, int noOfPlayers) {
        this.board = new Board(size);
        this.players = new LinkedList<>();
        for (int i=1;i<=noOfPlayers;i++) {
            String name = "Player-" + i;
            this.players.add(new Player(name, new Symbol(SymbolType.values()[i-1])));
        }
    }

    public void startGame() throws IOException {
        boolean isWinner = false;
        String winner = "tie";
        int count = board.getSize() * board.getSize();
        while(count > 0) {
            board.display();
            Player p = players.remove();
            System.out.print(p.getName() + "'s turn. Enter position to fill: ");
            String[] coord = getInput();
            int x = Integer.parseInt(coord[0]), y = Integer.parseInt(coord[1]);
            boolean isValidMove = board.addSymbol(x,y,p.getSymbol().getType());
            while(!isValidMove) {
                System.out.println("Position already filled. Try again.");
                coord = getInput();
                x = Integer.parseInt(coord[0]);
                y = Integer.parseInt(coord[1]);
                isValidMove = board.addSymbol(x,y,p.getSymbol().getType());
            }
            isWinner = checkWinner(x,y,p.getSymbol().getType());
            if(isWinner) {
                winner = p.getName();
                break;
            }
            players.add(p);
            count--;
        }
        System.out.println("Winner is: " + winner);

    }

    private boolean checkWinner(int x, int y, SymbolType symbol) {
        boolean hasWon = true;
        for(int i=0;i<board.getSize();i++) {
            if(board.getBoard()[i][y] == null || board.getBoard()[i][y].getType() != symbol) {
                hasWon = false;
                break;
            }
        }
        if(hasWon) return true;
        hasWon = true;
        for(int i=0;i<board.getSize();i++) {
            if(board.getBoard()[x][i] == null || board.getBoard()[x][i].getType() != symbol) {
                hasWon = false;
                break;
            }
        }
        return hasWon;
    }

    private String[] getInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String coordinates = br.readLine();
        String[] coord = coordinates.split(" ");
        return coord;
    }

}
