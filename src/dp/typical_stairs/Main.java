package dp.typical_stairs;

import java.util.Arrays;
import java.util.Scanner;



// 問題URL
// https://atcoder.jp/contests/abc129/tasks/abc129_c
// https://drken1215.hatenablog.com/entry/2019/06/10/140000

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int MOD = 1000000007;
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = 6;
        Integer[] A = {3};

        boolean[] isSafe = new boolean[N];
        Arrays.fill(isSafe, true);
        for(int i = 0; i < A.length; i++) {
            isSafe[A[i]] = false;
        }

        Integer[] dp = new Integer[N+1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        if(A.length == 0 || isSafe[1]) dp[1] = 1;


        for(int i = 2; i <= N; i++) {
            if (isSafe[i-1]) dp[i] += dp[i-1];
            if (isSafe[i-2]) dp[i] += dp[i-2];
            dp[i] %= MOD; // 1000000007 で割る
        }
        System.out.println(dp[N]);
    }
}

