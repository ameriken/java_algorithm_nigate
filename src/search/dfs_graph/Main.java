package search.dfs_graph;

import java.util.Arrays;
import java.util.Scanner;

import static search.dfs_square.Dfs.getProbability;

class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Integer n = input.nextInt();
        Dfs dfs = new Dfs(n);

        for(int i = 0;i < n;i++){
            int u = input.nextInt(),k = input.nextInt();
            dfs.graph[u - 1] = new int[k];
            for(int j = 0;j < k;j++){
                dfs.graph[u - 1][j] = input.nextInt() - 1;
            }
            Arrays.sort(dfs.graph[u - 1]);
        }

        while(true){
            int i;
            for(i = 0; i < n; i++){
                if(dfs.fin[i] != 0) continue;
                dfs.execute(i);
                break;
            }
            if(i == n) break;
        }

        for(int i = 0;i < n;i++){
            System.out.println((i + 1) + " " + dfs.d[i] + " " + dfs.f[i]);
        }
    }
}
