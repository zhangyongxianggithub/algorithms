package com.bestzyx.algorithms;

public class SweepMine_529 {
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[1]][click[1]] == 'M') {
            board[click[1]][click[1]] = 'X';
        } else {

        }
        return board;

    }

    private char updateBoard(char[][] board, int rowSize, int colSize, int row, int col) {
        char[] chars = new char[8];
        int size = 0;
        if (row - 1 >= 0 && row - 1 < rowSize && col - 1 >= 0 && col - 1 < colSize) {
            chars[size++] = updateBoard(board, rowSize, colSize, row - 1, col - 1);
        }
        if (row - 1 >= 0 && row - 1 < rowSize && col >= 0 && col < colSize) {
            chars[size++] = updateBoard(board, rowSize, colSize, row - 1, col);
        }
        if (row - 1 >= 0 && row - 1 < rowSize && col + 1 >= 0 && col + 1 < colSize) {
            chars[size++] = updateBoard(board, rowSize, colSize, row - 1, col + 1);
        }
        if (row >= 0 && row < rowSize && col - 1 >= 0 && col - 1 < colSize) {
            chars[size++] = updateBoard(board, rowSize, colSize, row, col - 1);
        }
        if (row >= 0 && row < rowSize && col + 1 >= 0 && col + 1 < colSize) {
            chars[size++] = updateBoard(board, rowSize, colSize, row, col + 1);
        }
        if (row + 1 >= 0 && row + 1 < rowSize && col - 1 >= 0 && col - 1 < colSize) {
            chars[size++] = updateBoard(board, rowSize, colSize, row + 1, col - 1);
        }
        if (row + 1 >= 0 && row + 1 < rowSize && col >= 0 && col < colSize) {
            chars[size++] = updateBoard(board, rowSize, colSize, row + 1, col);
        }
        if (row - 1 >= 0 && row - 1 < rowSize && col - 1 >= 0 && col - 1 < colSize) {
            chars[size++] = updateBoard(board, rowSize, colSize, row - 1, col - 1);
        }
    }
}