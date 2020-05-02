package graph.weighted;

public class Practice {
    private static final int STATION_NUMBER = 6;
    private static String[] stations = {"横浜", "武蔵小杉","品川","渋谷","新橋","溜池山王"};

    private static int[][] adjacencyMatrix = {
            new int[]{ 0, 0, 0, 0, 0, 0},
            new int[]{ 0, 0, 0, 0, 0, 0},
            new int[]{ 0, 0, 0, 0, 0, 0},
            new int[]{ 0, 0, 0, 0, 0, 0},
            new int[]{ 0, 0, 0, 0, 0, 0},
            new int[]{ 0, 0, 0, 0, 0, 0}
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
