package graph.weighted;

public class WeightedGraph {
    private static final int STATION_NUMBER = 6;
    private static String[] stations = {"横浜", "武蔵小杉","品川","渋谷","新橋","溜池山王"};

    private static int[][] adjacencyMatrix = {
            new int[]{ 0,12,28, 0, 0, 0}, //横浜
            new int[]{12, 0,10,13, 0, 0}, //武蔵小杉
            new int[]{28,10, 0,11, 7, 0}, //品川
            new int[]{ 0,13,11, 0, 0, 9}, //渋谷
            new int[]{ 0, 0, 7, 0, 0, 4}, //新橋
            new int[]{ 0, 0, 0, 9, 4, 0}  //溜池山王
    };

    public static void main(String[] args) {
        for(int i =0; i < STATION_NUMBER; i++) {
            System.out.println(stations[i] + ":");
            for(int j = 0; j < STATION_NUMBER; j++) {
                if(adjacencyMatrix[i][j] >0) {
                    System.out.println("->" + stations[j] + "(" + adjacencyMatrix[i][j]+"分)" + " ");
                }
            }
            System.out.println();
        }
    }
}
