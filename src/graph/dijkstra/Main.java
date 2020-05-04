package graph.dijkstra;

import javax.print.DocFlavor;

public class Main {

    private static String[] stations = {"横浜", "武蔵小杉","品川","渋谷","新橋","溜池山王"};
    private static final int STATION_NUMBER = stations.length;
    private static final int START_STATION = 0;

    private static int currentTime[];
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
        currentTime = new int[STATION_NUMBER];
        fix = new boolean[STATION_NUMBER];

        for(int i = 0; i < STATION_NUMBER; i++){
            currentTime[i] =  -1;
            fix[i] = false;
        }

        currentTime[START_STATION] = 0;

        for(;;) {

            //minStation = 最短距離が確定していない中で、
            //最も始点からのコストが小さい駅（つまり、次に最短距離を確定させたい駅）
            int minStation = -1;
            //minTime = minStationまでの現在の暫定コスト
            int minTime = -1;

            // 次基点にする駅を調べる
            for(int i = 0; i < STATION_NUMBER; i++) {
                // 探索済みではない && 最短距離を調べてない場所
                if(!fix[i] && currentTime[i] != -1) {
                    // 暫定的に調べたい駅 or 暫定時間が現在のコストよりも大きいか
                    if(minStation == -1 || minTime > currentTime[i]) {
                        minTime = currentTime[i];
                        minStation = i;
                    }
                }
            }

            // 無限ループにならないようにする
            if(minTime == -1) break;

            for(int i = 0; i < STATION_NUMBER; i++) {
                // 経路未探索であり、今の場所から新しい道が0以上であるか
                if(!fix[i] && adjacencyMatrix[minStation][i] > 0) {
                    // 新しい時間 = minStationを基点に隣接の駅のコストを足した時間
                    int newTime = minTime + adjacencyMatrix[minStation][i];
                    // 探索したい or 現在のコスト以下で隣接する駅に行けるか
                    if(currentTime[i] == -1 || currentTime[i] > newTime) {
                        currentTime[i] = newTime;
                    }
                }
            }

            // 経路探索済みとしてtrueにする
            fix[minStation] = true;
        }

        for(int i =0; i < STATION_NUMBER; i++) {
            System.out.println(stations[START_STATION] + "->" + stations[i] + ":" +
                    currentTime[i] + "分");
        }
    }
}
