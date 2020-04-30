package search.dfs;

import static search.dfs.Dfs.getProbability;

public class Main {
    public static void main(String[] args) {
        //コード
        int n =2;
        int east  = 25;
        int west  = 25;
        int south = 25;
        int north = 25;

        System.out.println(getProbability(n, east, west, south, north));
    }

}
