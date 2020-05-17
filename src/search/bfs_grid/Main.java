package search.bfs_grid;


import java.util.*;

public class Main {

    static Integer[][] dist;
    static String[][] maze;
    static Integer INF = Integer.MAX_VALUE;
    static int vx[] = {1, -1, 0, 0};
    static int vy[] = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer R = Integer.parseInt(scanner.next());
        Integer C = Integer.parseInt(scanner.next());
        Integer sy = Integer.parseInt(scanner.next()) - 1;
        Integer sx = Integer.parseInt(scanner.next()) - 1;
        Integer gy = Integer.parseInt(scanner.next()) - 1;
        Integer gx = Integer.parseInt(scanner.next()) - 1;

        dist = new Integer[R][C];
        maze = new String[R][C];

        for (String[] m : maze) Arrays.fill(m, ".");
        for (Integer[] d : dist) Arrays.fill(d, INF);

        for (int i = 0; i < R; i++) {
            String tmp = scanner.next();
            for (int j = 0; j < C; j++) {
                maze[i][j] = String.valueOf(tmp.charAt(j));
            }
        }

        Queue<Integer[]> que = new LinkedList<>();
        Integer[] q = new Integer[2];
        q[0] = sy; q[1] = sx; que.add(q);

        dist[sy][sx] = 0;
        while(que.size() != 0) {
            Integer[] now = que.poll();
            Integer y =  now[0], x = now[1];
            if(y == gy && x == gx) break;
            for (int i = 0; i < 4; i++) {
                // 次の探索場所の行番号   // 次の探索場所の列番号
                int nextY = y + vy[i], nextX = x + vx[i];
                // 迷路の外に出るならスルー
                if (nextY < 0 || R <= nextY || nextX < 0 || C <= nextX) continue;
                // 障害物があればスルー
                if (maze[nextY][nextX].equals("#")) continue;
                //探索済みならスルー
                if (dist[nextY][nextX] != INF) continue;
                q[0] = nextY; q[1] = nextX; que.add(q);
                dist[nextY][nextX] = dist[y][x] + 1;
            }
        }
        System.out.println(dist[gy][gx]);
    }
}
