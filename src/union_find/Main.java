package union_find;

// https://atc001.contest.atcoder.jp/tasks/unionfind_a

public class Main {

    public static void main(String[] args) {
        int n = 8, q = 9;
        // p=0だったら連結クエリ
        // p=1だったら判定クエリ
        int[][] p_a_b = {
                new int[]{0, 1, 2},
                new int[]{0, 3, 2},
                new int[]{1, 1, 3},
                new int[]{1, 1, 4},
                new int[]{0, 2, 4},
                new int[]{1, 4, 1},
                new int[]{0, 4, 2},
                new int[]{0, 0, 0},
                new int[]{1, 0, 0}
        };

        UnionFind uf = new UnionFind(n);

        for (int i = 0; i < p_a_b.length; i++) {
            if (p_a_b[i][0] == 0) {
                uf.connect(p_a_b[i][1], p_a_b[i][2]);
            } else {
                if(uf.isConnect(p_a_b[i][1], p_a_b[i][2])) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}
