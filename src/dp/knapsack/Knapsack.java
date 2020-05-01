package dp.knapsack;

import java.util.Arrays;

public class Knapsack {

    private final int N;
    private final int[] size;
    private final int[] value;


    public Knapsack(int[] size, int[] value) {
        this.N = size.length;
        this.size = (int[])size.clone();
        this.value = (int[])value.clone();
    }

    public void solve(int m) {
        int[] total = new int[m + 1];
        int[] choice = new int[m + 1];
        Arrays.fill(choice, -1);

        int repackTotal;

        System.out.printf("ナップザックの大きさは%d%n", m);

        for (int i = 0; i < N; i++) {
            for (int j = size[i]; j <= m; j++) {
                repackTotal = total[j - size[i]] + value[i];
                if (repackTotal > total[j]) {
                    // 何もない状態から商品1を足した時の合計
                    // 商品1を足した時の合計から商品2を足した合計~繰り返し
                    total[j] = repackTotal;
                    // 選択した商品
                    choice[j] = i;
                }
            }
        }

        for (int i = m; choice[i] >= 0; i -= size[choice[i]]) {
            System.out.printf("品物 %d (価値 %d)を詰め込む %n", choice[i], value[choice[i]]);
        }
    }
}
