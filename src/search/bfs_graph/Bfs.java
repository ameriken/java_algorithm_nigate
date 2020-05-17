package search.bfs_graph;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    public static int longestPath(String[] maze, int startRow, int startCol,
                                  int[] moveRow, int[] moveCol) {
        int max = 0;
        // width : マスの横の長さ
        // height: マスの縦の長さ
        int width = maze[0].length(), height = maze.length;

        // width * height でマスの全体を作成している
        int[][] board = new int[height][width];

        // boardは全て-1で初期化されている
        for (int i = 0; i < height; i++) {
            for (int k = 0; k < width; k++) {
                board[i][k] = -1;
            }
        }

        // 始点を決めている
        board[startRow][startCol] = 0;

        Queue<Integer> queueX = new LinkedList<Integer>();
        Queue<Integer> queueY = new LinkedList<Integer>();
        queueX.add(startCol);
        queueY.add(startRow);

        while (!queueX.isEmpty()) {
            int x = queueX.poll(), y = queueY.poll();

            // 下、右、上、左の順で動く
            // 6時から逆時計回り
            for (int m = 0; m < moveRow.length; m++) {

                // 始点から動けるマスを追加している
                // moveRowは行なので上か下
                // moveColは列なので右か左
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
            //System.out.println(Arrays.toString(board[0]));
            //System.out.println(Arrays.toString(board[1]));
            //System.out.println(Arrays.toString(board[2]));
            //System.out.println("------");
        }

        for (int m = 0; m < height; m++) {
            for (int l = 0; l < width; l++) {
                if (maze[m].charAt(l) == '.' && board[m][l] == -1) {
                    return -1;
                }
                max = Math.max(max, board[m][l]);
            }
        }
        return max;
    }
}
