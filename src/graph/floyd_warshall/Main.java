package graph.floyd_warshall;

public class Main {

    final static int INF = 99999;
    public static void main (String[] args)
    {
        /* 図1)
              10
        (0)------->(3)
         |         /|\
        5|          |1
         |          |
        \|/         |
        (1)-------->(2)
               3
        */

        /*
        解説①
        ワーシャルフロイド法とは...
        全てのある点を経由して目的地にいくこと
        例えば0を経由すると考えると
        パターン１   パターン2    パターン3     パターン4
        0 - 0 - 0 | 1 - 0 - 0 | 2 - 0 - 0 | 3 - 0 - 0
        0 - 0 - 1 | 1 - 0 - 1 | 2 - 0 - 1 | 3 - 0 - 1
        0 - 0 - 2 | 1 - 0 - 2 | 2 - 0 - 2 | 3 - 0 - 2
        0 - 0 - 3 | 1 - 0 - 3 | 2 - 0 - 3 | 3 - 0 - 3
        上記のようにして全てのパターンを調べる、この経由地点を0~3調べ尽くす

        変数を当てはめると
        i - k - j
        となる

        解説②
        kを経由することで、暫定のi,j間の最短距離を更新できるか調べています

        解説③
        ある点を経由して目的地についた時の合計値 < 暫定の最短距離
        dist[i][j]の初期値は直接行く時の距離
        調査済みの経由点を調べた時に更新されている可能性があります。
        */

        // 頂点
        int V = 4;
        int graph[][] = {
                {0,   5,  INF, 10}, // 0
                {INF, 0,   3, INF}, // 1
                {INF, INF, 0,   1}, // 2
                {INF, INF, INF, 0}  // 3
        };
        AllPairShortestPath a = new AllPairShortestPath();

        // Print the solution
        a.execute(graph, V, INF);
    }
}
