package dp.typical_stairs;

import java.util.Arrays;


// 問題URL
// https://atcoder.jp/contests/abc129/tasks/abc129_c
// https://drken1215.hatenablog.com/entry/2019/06/10/140000


public class Practice {
    private static int MOD = 1000000007;
    public static void main(String[] args) {
        //コード
        Integer N = 6;
        Integer[] A = {3};

        boolean[] isSafe = new boolean[N];
        Arrays.fill(isSafe, true);
        for(int i = 0; i < A.length; i++) {
            isSafe[A[i]] = false;
        }

        // ここにコードを書いてください。

    }
}

