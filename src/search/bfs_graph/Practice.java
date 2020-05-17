package search.bfs_graph;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    static boolean[] isChecked;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer V = Integer.parseInt(scanner.next());
        Integer E = Integer.parseInt(scanner.next());
        Integer s = Integer.parseInt(scanner.next());
        Integer t = Integer.parseInt(scanner.next());

        isChecked = new boolean[V];
        Arrays.fill(isChecked, false);

    }
}
