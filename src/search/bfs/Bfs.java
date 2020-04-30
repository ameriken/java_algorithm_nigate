package search.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    public static int longestPath(String[] maze, int startRow, int startCol,
                                  int[] moveRow, int[] moveCol) {
        int max = 0;
        int width = maze[0].length(), height = maze.length;
        int[][] board = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int k = 0; k < width; k++) {
                board[i][k] = -1;

                board[startRow][startCol] = 0;

                Queue<Integer> queueX = new LinkedList<Integer>();
                Queue<Integer> queueY = new LinkedList<Integer>();
                queueX.add(startCol);
                queueY.add(startRow);

                while (!queueX.isEmpty()) {
                    int x = queueX.poll(), y = queueY.poll();

                    for (int m = 0; m < moveRow.length; m++) {

                        int nextX = x + moveCol[m], nextY = y + moveRow[m];

                        if (0 <= nextX && nextX < width
                                && 0 <= nextY && nextY < height
                                && board[nextY][nextX] == -1
                                && maze[nextY].charAt(nextX) == '.') {
                            board[nextY][nextX] = board[y][x] + 1;
                            queueX.add(nextX);
                            queueY.add(nextY);
                        }
                    }
                }

                for (int m = 0; m < height; m++) {
                    for (int l = 0; l < width; l++) {
                        if (maze[m].charAt(l) == '.' && board[m][l] == -1) {
                            return -1;
                        }
                        max = Math.max(max, board[i][k]);
                    }
                }
                return max;
            }
        }
        return max;
    }
}
