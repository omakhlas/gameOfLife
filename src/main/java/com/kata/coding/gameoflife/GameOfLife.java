package com.kata.coding.gameoflife;

public class GameOfLife {

    // initialize neighbours array to find the 8 neighbours
    int liveNeighbours = 0;
    int[] neighbours;
    public GameOfLife() {
        neighbours = new int[]{0, 1, -1};
    }

    public void findNextGen(int[][] board) {
        if(board == null) return;

        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board[0].length; j++) {
                liveNeighbours = getNumberOfLiveNumbers(board, i, j);
                if(ruleOneOrTwo(board, i, j))
                    board[i][j] = 0;
                if(ruleFour(board, i, j))
                    board[i][j] = 1;
                liveNeighbours = 0;
            }
        }
    }

    // return all
    private int getNumberOfLiveNumbers(int[][] board, int r, int c) {
        int liveNeighbours = 0;
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                if(!(neighbours[i] == 0 && neighbours[j] == 0)) {
                    int row = r+neighbours[i];
                    int col = c+neighbours[j];
                    if(row<0 || row == board.length || col<0 || col == board[0].length || board[row][col] == 0)
                        continue;
                    liveNeighbours++;
                }
            }
        }
        return  liveNeighbours;
    }

    public boolean ruleOneOrTwo(int[][] board, int r, int c) {
        return board[r][c] == 1 && (liveNeighbours<2 || liveNeighbours>3);
    }

    /*public boolean ruleThree(int[][] board, int r, int c) {
        return board[r][c] == 1 && (liveNeighbours == 2 || liveNeighbours == 3);
    }*/

    public boolean ruleFour(int[][] board, int r, int c) {
        return board[r][c] == 0 && liveNeighbours == 3;
    }

}
