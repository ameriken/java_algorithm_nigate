package search.dfs_graph;

import java.util.Arrays;
import java.util.Scanner;

class Dfs {
    static int time = 1;
    static int[][] graph;
    static int[] d,f,fin;

    public Dfs(Integer n) {
        graph = new int[n][];
        d = new int[n];
        f = new int[n];
        fin = new int[n];
    }

    static void execute(int id){
        d[id] = time++;
        fin[id] = 1;
        for(int i = 0;i < graph[id].length;i++){
            if(fin[graph[id][i]] == 0){
                execute(graph[id][i]);
            }
        }
        f[id] = time++;
    }
}
