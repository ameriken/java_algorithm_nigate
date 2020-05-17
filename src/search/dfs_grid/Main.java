package search.dfs_grid;

import java.util.*;
// https://atcoder.jp/contests/atc001/tasks/dfs_a

public class Main {
    static boolean[][] seen;
    static String[][] maze;
    static Integer H;
    static Integer W;

    static int vx[] = {1, -1, 0, 0};
    static int vy[] = {0, 0, 1, -1};

    public static void dfs(Integer[] currentPos) {
        int y = currentPos[0], x = currentPos[1];
        seen[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nextY = y + vy[i], nextX = x + vx[i];
            if (nextY < 0 || H <= nextY || nextX < 0 || W <= nextX) continue;  // 迷路の外に出るならスルー
            if (maze[nextY][nextX].equals("#")) continue;                     // 障害物があればスルー
            if (seen[nextY][nextX]) continue;                            //探索済みならスルー
            currentPos[0] = nextY;
            currentPos[1] = nextX;
            dfs(currentPos);
        }
    }

    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        H = Integer.parseInt(scanner.next());
        W = Integer.parseInt(scanner.next());
        seen = new boolean[H][W];
        maze = new String[H][W];

        Integer[] currentPos = new Integer[2];
        Integer[] isGoal = new Integer[2];

        for (String[] m: maze) Arrays.fill(m,".");
        for (boolean[] s: seen) Arrays.fill(s,false);


        for (int y = 0; y < H; y++) {
            String tmp = scanner.next();
            for (int x = 0; x < W; x++) {
                maze[y][x] = String.valueOf(tmp.charAt(x));
                if (maze[y][x].equals("s")) {
                    currentPos[0] = y;
                    currentPos[1] = x;
                } else if(maze[y][x].equals("g")) {
                    isGoal[0] = y;
                    isGoal[1] = x;
                }
            }
        }

        dfs(currentPos);
        int f = isGoal[0], y = isGoal[1];
        if (seen[f][y]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        };
    }

}
