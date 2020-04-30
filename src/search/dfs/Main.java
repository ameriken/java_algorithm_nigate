package search.dfs;

import static search.dfs.Dfs.getProbability;

public class Main {
    public static void main(String[] args) {
        //コード
        int n =2;
        // マスがそれぞれ進む可能性
        // 100 / 4 = 25
        // 4回動いたら東、西、東、北のどちらかに動く
        int east  = 25;
        int west  = 25;
        int south = 25;
        int north = 25;

        System.out.println(getProbability(n, east, west, south, north));
    }

}
