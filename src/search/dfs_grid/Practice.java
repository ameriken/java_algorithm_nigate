package search.dfs_grid;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {


    static boolean[][] seen;
    static String[][] maze;
    static Integer H;
    static Integer W;

    static int vx[] = {1, -1, 0, 0};
    static int vy[] = {0, 0, 1, -1};

    public static void dfs(Integer[] currentPos) {
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

    }
}
