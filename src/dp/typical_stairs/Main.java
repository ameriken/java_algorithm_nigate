package dp.typical_stairs;

import java.util.Arrays;



// 問題URL
// https://atcoder.jp/contests/abc129/tasks/abc129_c
// https://drken1215.hatenablog.com/entry/2019/06/10/140000

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int MOD = 1000000007;
    public static void main(String[] args) {
        // 階段の数
        Integer N = 6;
        // 壊れてる階段
        Integer[] A = {3};

        boolean[] isSafe = new boolean[N];
        Arrays.fill(isSafe, true);
        // 壊れてる階段を記録する
        for(int i = 0; i < A.length; i++) {
            isSafe[A[i]] = false;
        }

        Integer[] dp = new Integer[N+1];
        Arrays.fill(dp, 0);
        // 0歩数を1と考える
        dp[0] = 1;
        // １歩で1段か2段登ることができる
        // 壊れてる気団があるか or 1段目が安全であれば1とする
        if(A.length == 0 || isSafe[1]) dp[1] = 1;


        // 2段目まではすでに検証した
        // 0->1,1通り
        // 0->2 2通り
        // 1->2 2通り(0->1で1通り,1->2で1通り: 合計2通り)
        for(int i = 2; i <= N; i++) {
            if (isSafe[i-1]) dp[i] += dp[i-1];
            if (isSafe[i-2]) dp[i] += dp[i-2];
            // 問題の指定えこちらの計算を追加
            dp[i] %= MOD; // 1000000007 で割る
        }
        System.out.println(dp[N]);
    }
}

