package search.bfs_graph;

// 元ネタ: https://algo-logic.info/bfs/

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

    static boolean[] isChecked;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer V = Integer.parseInt(scanner.next());
        Integer E = Integer.parseInt(scanner.next());
        Integer s = Integer.parseInt(scanner.next());
        Integer t = Integer.parseInt(scanner.next());

        isChecked = new boolean[V];
        Arrays.fill(isChecked, false);

        LinkedList<Integer>[] graph = new LinkedList[V];
        for (int i=0; i < V; i++) graph[i] = new LinkedList();

        for (int i = 0; i < E; i++) {
            Integer a = Integer.parseInt(scanner.next());
            graph[a].add(Integer.parseInt(scanner.next()));
        }

        Queue<Integer> que = new LinkedList<>();
        que.add(s);

        isChecked[s] = true;
        while(que.size() != 0) {
            Integer state = que.poll();
            for (Integer next : graph[state]) {
                if (isChecked[next])  continue;;
                isChecked[next] = true;
                que.add(next);
            }
        }
        if (isChecked[t]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
