package graph.dijkstra;

import javax.print.DocFlavor;

public class Dijkstra {
    private static final int STATION_NUMBER = 6;
    private static final int START_STATION = 0;

    private static String[] stations = {"横浜", "武蔵小杉","品川","渋谷","新橋","溜池山王"};
    private static int currentCost[];
    private static boolean fix[];

    private static int[][] adjacencyMatrix = {
            new int[]{ 0,12,28, 0, 0, 0}, //横浜
            new int[]{12, 0,10,13, 0, 0}, //武蔵小杉
            new int[]{28,10, 0,11, 7, 0}, //品川
            new int[]{ 0,13,11, 0, 0, 9}, //渋谷
            new int[]{ 0, 0, 7, 0, 0, 4}, //新橋
            new int[]{ 0, 0, 0, 9, 4, 0}  //溜池山王
    };

    public static void main(String[] args) {
        currentCost = new  int[STATION_NUMBER];
        fix = new boolean[STATION_NUMBER];

        for(int i = 0; i < STATION_NUMBER; i++){
            currentCost[i] =  -1;
            fix[i] = false;
        }

        currentCost[START_STATION] = 0;

        for(;;) {
            int minStation = -1, minTime = -1;

            // ここでどの経路に進むか決める
            // もっとも所要時間の小さい駅を調べる
            for(int i = 0; i < STATION_NUMBER; i++) {
                if(!fix[i] && currentCost[i] != -1) {
                    if(minStation == -1 || minTime > currentCost[i]) {
                        minTime = currentCost[i];
                        minStation = i;
                    }
                }
            }

            // 無限ループにならないようにする
            if(minTime == -1) {
                break;
            }

            // 経路未探索であり、今の場所から新しい道がどれだけ増えているか
            for(int i = 0; i < STATION_NUMBER; i++) {
                if(!fix[i] && adjacencyMatrix[minStation][i] > 0) {
                    int newTime = minTime + adjacencyMatrix[minStation][i];
                    // 経路未開拓 or 新しい道の方が短いか
                    if(currentCost[i] == -1 || currentCost[i] > newTime) {
                        currentCost[i] = newTime;
                    }
                }
            }

            // 経路探索済みとしてtrueにする
            fix[minStation] = true;
        }

        for(int i =0; i < STATION_NUMBER; i++) {
            System.out.println(stations[START_STATION] + "->" + stations[i] + ":" +
                    currentCost[i] + "分");
        }


    }
}
