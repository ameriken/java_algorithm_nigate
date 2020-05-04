package graph.bellman_ford;

public class Practice {

    static void execute(int graph[][], int V, int E, int src)
    {
        int []dis = new int[V];
        for (int i = 0; i < V; i++) {
            dis[i] = Integer.MAX_VALUE;
        }

        // スタート地点
        dis[src] = 0;

        //　ここにコードを記載


        System.out.println("原点からそれぞれの頂点の距離は.....");
        for (int i = 0; i < V; i++)
            System.out.println(i + "\t\t" + dis[i]);
    }
}
