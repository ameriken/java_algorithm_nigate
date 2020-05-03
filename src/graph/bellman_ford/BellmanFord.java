package graph.bellman_ford;

public class BellmanFord {

    static void execute(int graph[][], int V, int E, int src)
    {
        int []dis = new int[V];
        for (int i = 0; i < V; i++) {
            dis[i] = Integer.MAX_VALUE;
        }

        // スタート地点
        dis[src] = 0;

        // スタートから全ての頂点の最短距離を調べている
        // 値が小さければ更新していく
        // 頂点の数分だけループすると負の重量でも対応できる
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < E; j++) {
                if (dis[graph[j][0]] + graph[j][2] < dis[graph[j][1]]) {
                    dis[graph[j][1]] =
                            dis[graph[j][0]] + graph[j][2];
                }
            }
        }

        // ひとまず暗記不要
        //for (int i = 0; i < E; i++)
        //{
        //    int x = graph[i][0];
        //    int y = graph[i][1];
        //    int weight = graph[i][2];
        //    if (dis[x] != Integer.MAX_VALUE && dis[x] + weight < dis[y]) {
        //        System.out.println("Graph contains negative"
        //                +" weight cycle");
        //    }
        //}

        System.out.println("原点からそれぞれの頂点の距離は.....");
        for (int i = 0; i < V; i++)
            System.out.println(i + "\t\t" + dis[i]);
    }
}
