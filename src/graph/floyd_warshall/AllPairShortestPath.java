package graph.floyd_warshall;

public class AllPairShortestPath {

    void execute(int graph[][], int V, int INF) {
        int dist[][] = new int[V][V];

        // ここでdistを初期化する
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        printSolution(dist,V, INF);
    }

    void printSolution(int dist[][], int V, int INF)
    {
        System.out.println("The following matrix shows the shortest "+
                "distances between every pair of vertices");
        for (int i=0; i < V; ++i) {
            for (int j=0; j < V; ++j) {
                if (dist[i][j]==INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j]+"   ");
                }
            }
            System.out.println();
        }
    }
}
