package search.dfs_graph;

import java.util.*;
//元ネタ: https://algo-logic.info/dfs/
/*
入力：
4 5
0 3
0 1
0 2
1 3
2 1
2 3
出力：
yes
*/


class Main {

    static boolean[] seen;
    public static void dfs(LinkedList<Integer>[] graph, Integer v) {
        seen[v] = true;
        for (Integer next : graph[v]) {
            if(!seen[next]) dfs(graph, next);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer V = Integer.parseInt(scanner.next());
        Integer E = Integer.parseInt(scanner.next());
        Integer s = Integer.parseInt(scanner.next());
        Integer t = Integer.parseInt(scanner.next());

        seen = new boolean[V];
        LinkedList<Integer> graph[] = new LinkedList[V];
        for (int i=0; i<V; ++i) graph[i] = new LinkedList();

        for (int i = 0; i < E; i++) {
            Integer a = Integer.parseInt(scanner.next());
            graph[a].add(Integer.parseInt(scanner.next()));
        }
        Arrays.fill(seen, false);
        dfs(graph, s);

        if (seen[t]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
