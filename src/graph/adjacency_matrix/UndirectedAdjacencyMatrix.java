package graph.adjacency_matrix;

public class UndirectedAdjacencyMatrix {
    private static final int STATION_NUMBER = 6;
    private static String[] stations = {"鎌倉", "藤沢","横浜","横須賀","茅ヶ崎","東京"};

    private static int[][] adjacencyMatrix = {
            new int[]{0,1,1,1,0,0}, //鎌倉
            new int[]{1,0,1,0,1,0}, //藤沢
            new int[]{1,1,0,0,0,1}, //横浜
            new int[]{1,0,0,0,0,0}, //横須賀
            new int[]{0,1,0,0,0,0}, //茅ヶ崎
            new int[]{0,0,1,0,0,0}  //東京
    };

    public static void main(String[] args) {
        for(int i =0; i < STATION_NUMBER; i++) {
            System.out.println(stations[i] + ":");
            for(int j = 0; j < STATION_NUMBER; j++) {
                if(adjacencyMatrix[i][j] == 1) {
                    System.out.println("->" + stations[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
