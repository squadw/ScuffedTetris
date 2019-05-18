package squadw.scuffedms.game.board;

import squadw.scuffedms.game.tile.Mine;
import squadw.scuffedms.game.tile.Tile;

import java.util.Random;

public class Board {
    private int size;
    private int diff;
    private Tile[][] board;

    public Board(int size, int diff) {
        this.size = size;
        this.diff = diff;
        board = new Tile[this.size][this.size];
        initBoard();
    }

    public int getSize() {
        return size;
    }

    public Tile[][] getBoard() {
        return board;
    }

    private void initBoard() {
        Random r = new Random();
        int n = (size * size) * (diff * 2 - 1) / 8;
        int x;
        int y;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Tile();
            }
        }

        for (int i = 0; i < n; i++) {
            x = r.nextInt(size);
            y = r.nextInt(size);

            do {
                x = r.nextInt(size);
                y = r.nextInt(size);
                board[x][y] = new Mine();
            } while (!(board[x][y] instanceof Mine));
        }
    }
}