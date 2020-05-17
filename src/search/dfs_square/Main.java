package search.dfs_square;

import java.util.*;

import static search.dfs_square.Dfs.getProbability;

public class Main {
    static boolean[][] seen;
    static String[][] maze;
    static Integer H;
    static Integer W;

    static int vx[] = {1, -1, 0, 0};
    static int vy[] = {0, 0, 1, -1};

    public static void dfs(Integer[] isChecked) {
        int y = isChecked[0], x = isChecked[1];
        seen[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nextY = y + vy[i], nextX = x + vx[i];
            if (nextY < 0 || H <= nextY || nextX < 0 || W <= nextX) continue;  // 迷路の外に出るならスルー
            if (maze[nextY][nextX].equals("#")) continue;                     // 障害物があればスルー
            if (seen[nextY][nextX]) continue;                            //探索済みならスルー
            isChecked[0] = nextY;
            isChecked[1] = nextX;
            dfs(isChecked);
        }
    }

    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        H = Integer.parseInt(scanner.next());
        W = Integer.parseInt(scanner.next());
        seen = new boolean[H][W];
        maze = new String[H][W];

        Integer[] isChecked = new Integer[2];
        Integer[] isGoal = new Integer[2];

        for (String[] m: maze) Arrays.fill(m,".");
        for (boolean[] s: seen) Arrays.fill(s,false);


        for (int y = 0; y < H; y++) {
            String tmp = scanner.next();
            for (int x = 0; x < W; x++) {
                maze[y][x] = String.valueOf(tmp.charAt(x));
                if (maze[y][x].equals("s")) {
                    isChecked[0] = y;
                    isChecked[1] = x;
                } else if(maze[y][x].equals("g")) {
                    isGoal[0] = y;
                    isGoal[1] = x;
                }
            }
        }

        dfs(isChecked);
        int f = isGoal[0], y = isGoal[1];
        if (seen[f][y]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        };
    }

}
