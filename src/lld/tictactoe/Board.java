package lld.tictactoe;

public class Board {

    private int size;
    private Symbol[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Symbol[size][size];
    }

    public int getSize() {
        return size;
    }

    public Symbol[][] getBoard() {
        return board;
    }

    public boolean addSymbol(int x, int y, SymbolType type) {
        if(x>=size || y>=size) {
            return false;
        }
        if(board[x][y] != null) {
            return false;
        }
        board[x][y] = new Symbol(type);
        return true;
    }

    public void display() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                String symbol = "   ";
                if(board[i][j] != null) {
                    symbol = " " + board[i][j].getType().name() + " ";
                }
                System.out.print(symbol);
                if(j!=size-1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
