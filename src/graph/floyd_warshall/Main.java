package graph.floyd_warshall;

public class Main {

    final static int INF = 99999, V = 4;
    public static void main (String[] args)
    {
        /* Let us create the following weighted graph
              10
        (0)------->(3)
         |         /|\
        5|          |1
         |          |
        \|/         |
        (1)-------->(2)
               3
        */
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
