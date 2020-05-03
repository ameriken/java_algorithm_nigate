package sort.merge;

import java.util.Random;

import static sort.merge.MergeSort.merge;

public class Main {

    private static final int N = 5;
    private static int[] sort = new int[N];

    public static void main(String args[]) {
        Random random = new Random();
        System.out.println("ソート準備");
        for(int i = 0; i <N; ++i) {
            sort[i] = random.nextInt(1000);
            System.out.println(sort[i] +  " ");
        }

        System.out.println("¥nソート開始");
        merge(N, sort, 0);
        System.out.println("ソート終了");

        for(int i = 0; i < N; ++i) {
            System.out.println(sort[i] +  " ");
        }
    }
}
