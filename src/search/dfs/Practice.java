package search.dfs;

public class Practice {

    static double[] prob = new double[4];
    static boolean[][] grid = new boolean[100][100];

    // x座標
    // 値を書いてください
    static int vx[] = {};

    // y座標
    // 値を書いてください
    static int vy[] = {};


    // ここにコードを記載
    public static double dfs(int x, int y, int  n) {
        // 便宜上コードを記載した
        return (double) 0.0;
    }


    // nはマスの進む回数
    public static double getProbability(int n, int east, int west, int south, int north) {

        prob[0] = east  / 100.0;
        prob[1] = west  / 100.0;
        prob[2] = south / 100.0;
        prob[3] = north / 100.0;
        return dfs(50,50, n);

    }
}
