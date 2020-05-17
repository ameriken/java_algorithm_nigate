package search.bfs_graph;


import java.util.*;

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

public class Main {

    static boolean[] seen;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer V = Integer.parseInt(scanner.next());
        Integer E = Integer.parseInt(scanner.next());
        Integer s = Integer.parseInt(scanner.next());
        Integer t = Integer.parseInt(scanner.next());

        seen = new boolean[V];
        Arrays.fill(seen, false);

        LinkedList<Integer>[] graph = new LinkedList[V];
        for (int i=0; i<V; ++i) graph[i] = new LinkedList();

        for (int i = 0; i < E; i++) {
            Integer a = Integer.parseInt(scanner.next());
            graph[a].add(Integer.parseInt(scanner.next()));
        }

        Queue<Integer> que = new LinkedList<>();
        que.add(s);
        seen[s] = true;

        while(que.size() != 0) {
            Integer state = que.poll();
            for (Integer next : graph[state]) {
                if (!seen[next]) {
                    seen[next] = true;
                    que.add(next);
                }
            }
        }
        if (seen[t]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
