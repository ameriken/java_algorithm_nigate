package imos;

// 問題URL
// https://atcoder.jp/contests/abc014/tasks/abc014_3

public class Main {

    public static void main(String[] args) {
        // アンケートの数
        int n = 4;
        // a = 濃さの始点, b = 濃さの終点
        int a_b[][] = { {0, 2}, {2, 3}, {2, 4}, {5, 6}};
        // 0 - 1,000,000通りの濃さがある
        int[] S = new int[1000001];

        // 始点に+1終点-1をいれる
        for (int i = 0; i < a_b.length; i++) {
            S[a_b[i][0]] += 1;
            if(a_b[i][1] != 1000000) {
                S[a_b[i][1] + 1] -= 1;
            }
        }

        int max = S[0];
        for(int i=1; i<=1000000; i++){
            S[i] += S[i - 1];
            max = Math.max(max, S[i]);
        }
        System.out.println(max);
    }

}
