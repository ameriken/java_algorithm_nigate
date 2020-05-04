package graph.dijkstra;

import javax.print.DocFlavor;

public class Main {

    private static String[] stations = {"横浜", "武蔵小杉","品川","渋谷","新橋","溜池山王"};
    private static final int STATION_NUMBER = stations.length;
    private static final int START_STATION = 0;

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
        currentCost = new int[STATION_NUMBER];
        fix = new boolean[STATION_NUMBER];

        for(int i = 0; i < STATION_NUMBER; i++){
            currentCost[i] =  -1;
            fix[i] = false;
        }

        currentCost[START_STATION] = 0;

        for(;;) {
            int minStation = -1, minTime = -1;

            for(int i = 0; i < STATION_NUMBER; i++) {
                // 探索済みではない && 現在の費用が初期値と違っている
                if(!fix[i] && currentCost[i] != -1) {
                    // 初期値の場所 or  現在の場所より時間がかかる
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

            for(int i = 0; i < STATION_NUMBER; i++) {
                // 経路未探索であり、今の場所から新しい道が0以上であるか
                if(!fix[i] && adjacencyMatrix[minStation][i] > 0) {
                    // 新しい時間 = 現在の時間 + 現在地点からの目標地点
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
