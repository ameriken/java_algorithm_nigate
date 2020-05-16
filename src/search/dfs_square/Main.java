package search.dfs_square;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static search.dfs_square.Dfs.getProbability;

public class Main {
    static boolean[][] seen;
    static String[][] maze;
    static Integer H;
    static Integer W;

    static int vx[] = {1, -1, 0, 0};
    static int vy[] = {0, 0, 1, -1};

    public static void dfs(Map start) {
        int y = (int)start.get("first"), x = (int)start.get("second");
        seen[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nextY = y + vy[i], nextX = x + vx[i];
            if (nextY < 0 || H <= nextY || nextX < 0 || W <= nextX) continue;  // 迷路の外に出るならスルー
            if (maze[nextY][nextX].equals("#")) continue;                     // 障害物があればスルー
            if (seen[nextY][nextX]) continue;                            //探索済みならスルー
            start.put("first", nextY);
            start.put("second", nextX);
            dfs(start);
        }
    }

    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        H = Integer.parseInt(scanner.next());
        W = Integer.parseInt(scanner.next());
        seen = new boolean[H][W];
        maze = new String[H][W];

        Map<String, Integer> start = new HashMap<String, Integer>();
        Map<String, Integer> goal = new HashMap<String, Integer>();

        for (String[] m: maze) Arrays.fill(m,".");
        for (boolean[] s: seen) Arrays.fill(s,false);

        for (int y = 0; y < H; y++) {
            String tmp = scanner.next();
            for (int x = 0; x < W; x++) {
                maze[y][x] = String.valueOf(tmp.charAt(x));
                if (maze[y][x].equals("s")) {
                    start.put("first", y);
                    start.put("second",x);
                } else if(maze[y][x].equals("g")) {
                    goal.put("first", y);
                    goal.put("second",x);
                }
            }
        }

        dfs(start);
        int f = goal.get("first"), y = goal.get("second");

        if (seen[f][y]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        };
    }

}
