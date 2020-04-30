package search.dfs;

public class Dfs {

    static double[] prob = new double[4];
    static boolean[][] grid = new boolean[100][100];
    // x座標
    // +1は右(東)に１マス
    // -1は左(西)に１マス
    static int vx[] = {1, -1, 0, 0};

    // y座標
    // 100 * 100のマスだから真ん中をスタート地点地点としたいため50とする
    // +1は上(北)に１マス
    // -1は下(南)に１マス
    static int vy[] = {0, 0, 1, -1};

    private static double dfs(int x, int y, int n) {
        if(grid[x][y]) return 0;
        if(n ==  0) return 1;

        grid[x][y] = true;
        double ret = 0;
        for (int i =0; i<4; i++) {
            // 1回目右(東)に一マス
            // 51, 50, 0
            // 2回目左(西)に一マス
            // 49, 50, 0
            // 3回目上(北)に一マス
            // 50, 51, 0
            // 4回目下(南)に一マス
            // 50, 49, 0
            ret += dfs(x + vx[i], y + vy[i], n-1) * prob[i];
            System.out.println(ret);
        }
        grid[x][y] = false;
        return ret;
    }

    public static double getProbability(int n, int east, int west,
                                 int south, int north) {
        prob[0] = east  / 100.0;
        prob[1] = west  / 100.0;
        prob[2] = south / 100.0;
        prob[3] = north / 100.0;
        return dfs(50, 50, n);
    }

}
