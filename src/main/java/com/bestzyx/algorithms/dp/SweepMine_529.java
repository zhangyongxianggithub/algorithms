package com.bestzyx.algorithms.dp;

import com.bestzyx.algorithms.utils.PrintUtils;

/**
 * Created by zhangyongxiang(张永祥) on 2020-08-21 00:55
 * 让我们一起来玩扫雷游戏！
 * 给定一个代表游戏板的二维字符矩阵。 'M' 代表一个未挖出的地雷，'E' 代表一个未挖出的空方块，'B' 代表没有相邻（上，下，左，右，和所有4个对角线）地雷的已挖出的空白方块，数字（'1'
 * 到 '8'）表示有多少地雷与这块已挖出的方块相邻，'X' 则表示一个已挖出的地雷。
 * 现在给出在所有未挖出的方块中（'M'或者'E'）的下一个点击位置（行和列索引），根据以下规则，返回相应位置被点击后对应的面板：
 * 如果一个地雷（'M'）被挖出，游戏就结束了- 把它改为 'X'。
 * 如果一个没有相邻地雷的空方块（'E'）被挖出，修改它为（'B'），并且所有和其相邻的未挖出方块都应该被递归地揭露。
 * 如果一个至少与一个地雷相邻的空方块（'E'）被挖出，修改它为数字（'1'到'8'），表示相邻地雷的数量。
 * 如果在此次点击中，若无更多方块可被揭露，则返回面板。
 *  
 * 示例 1：
 * 输入:
 * [['E', 'E', 'E', 'E', 'E'],
 * ['E', 'E', 'M', 'E', 'E'],
 * ['E', 'E', 'E', 'E', 'E'],
 * ['E', 'E', 'E', 'E', 'E']]
 * Click : [3,0]
 * 输出:
 * [['B', '1', 'E', '1', 'B'],
 * ['B', '1', 'M', '1', 'B'],
 * ['B', '1', '1', '1', 'B'],
 * ['B', 'B', 'B', 'B', 'B']]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minesweeper
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SweepMine_529 {
    public static void main(String[] args) {
        char[][] board = new char[][] { { 'E', 'E', 'E', 'E', 'E' },
                { 'E', 'E', 'M', 'E', 'E' }, { 'E', 'E', 'E', 'E', 'E' },
                { 'E', 'E', 'E', 'E', 'E' } };
        int[] click = new int[] { 3, 0 };
        PrintUtils.printObject(board);
        new SweepMine_529().updateBoard(board, click);
        PrintUtils.printObject(board);
    }
    
    public char[][] updateBoard(char[][] board, int[] click) {
        boolean[][] processStack = new boolean[board.length][board[0].length];
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
        } else {
            boolean[][] processed = new boolean[board.length][board[0].length];
            updateBoard(processed, board, board.length, board[0].length,
                    click[0], click[1]);
        }
        return board;
        
    }
    
    private void updateBoard(boolean[][] processed, char[][] board, int rowSize,
            int colSize, int row, int col) {
        int size = 0;
        for (int rIndex = row - 1; rIndex < row + 2; rIndex++) {
            for (int cIndex = col - 1; rIndex >= 0 && rIndex < rowSize
                    && cIndex < col + 2; cIndex++) {
                if (rIndex == row && cIndex == col) {
                    continue;
                } else if (cIndex >= 0 && cIndex < colSize) {
                    if (board[rIndex][cIndex] == 'M') {
                        size++;
                    }
                }
            }
        }
        processed[row][col] = true;
        if (size > 0) {
            board[row][col] = (char) ('0' + size);
        } else {
            board[row][col] = 'B';
            for (int rIndex = row - 1; rIndex < row + 2; rIndex++) {
                for (int cIndex = col - 1; rIndex >= 0 && rIndex < rowSize
                        && cIndex < col + 2; cIndex++) {
                    if (rIndex == row && cIndex == col) {
                        continue;
                    } else if (cIndex >= 0 && cIndex < colSize
                            && !processed[rIndex][cIndex]) {
                        updateBoard(processed, board, rowSize, colSize, rIndex,
                                cIndex);
                    }
                }
            }
            
        }
    }
}