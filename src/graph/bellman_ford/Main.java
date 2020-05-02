package graph.bellman_ford;

import static graph.bellman_ford.BellmanFord.execute;

public class Main {

    public static void main(String[] args)
    {
        // 頂点の数
        int V = 5;
        // 辺の数
        int E = 8;

        // 引数の解説
        // 有向グラフである
        // { 頂点元, 頂点先, 重さ}
        // 0 => A, 1 => B, 2 => C
        // 3 => D, 4 => E
        int graph[][] = {
                //A->B
                { 0, 1,-1 },
                //A->C
                { 0, 2, 4 },
                //B->C
                { 1, 2, 3 },
                //B->D
                { 1, 3, 2 },
                //B->E
                { 1, 4, 2 },
                //D->C
                { 3, 2, 5 },
                //D->B
                { 3, 1, 1 },
                //E->D
                { 4, 3,-3 }
        };

        execute(graph, V, E, 0);
    }
}
