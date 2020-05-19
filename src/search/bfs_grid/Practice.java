package search.bfs_grid;

import java.util.*;

public class Practice {

    static Integer[][] dist;
    static String[][] maze;
    static Integer INF = Integer.MAX_VALUE;
    static int vx[] = {1, -1, 0, 0};
    static int vy[] = {0, 0, 1, -1};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // マスの縦横の大きさ R:縦 C:幅
        Integer R = Integer.parseInt(scanner.next());
        Integer C = Integer.parseInt(scanner.next());
        // スタート地点の座標 sy:縦 sx:幅
        Integer sy = Integer.parseInt(scanner.next()) - 1;
        Integer sx = Integer.parseInt(scanner.next()) - 1;
        // ゴールの座標 gy:縦 gx:幅
        Integer gy = Integer.parseInt(scanner.next()) - 1;
        Integer gx = Integer.parseInt(scanner.next()) - 1;

    }
}
