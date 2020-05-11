package search.all_bit;
// 問題URL
// https://atcoder.jp/contests/abc147/tasks/abc147_c

// 参考になった記事
// https://qiita.com/drken/items/7c6ff2aa4d8fce1c9361
// https://drken1215.hatenablog.com/entry/2019/12/14/171657


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static search.all_bit.Judge.judge;

public class Main {
    private static Integer N;
    private static List<List<List<Integer>>> list = new ArrayList<>();


    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        N = Integer.parseInt(scanner.next());

        // ここで初期化
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(scanner.next());
            List<List<Integer>> xys = new ArrayList<>();

            for (int j = 0; j < A; ++j) {
                List<Integer> xy = new ArrayList<>();
                xy.add(Integer.parseInt(scanner.next()) - 1);
                xy.add(Integer.parseInt(scanner.next()));
                xys.add(xy);
            }
            list.add(xys);
        }

        int res = 0;
        for (int bit = 0; bit < (1 << N); ++bit) {
            if (judge(bit, list, N)) {
                int count = 0;
                for (int i = 0; i < N; ++i) {
                    if ((bit & (1 << i)) != 0) ++count;
                }
                res = Math.max(res, count);
            }
        }
        System.out.println(res);
    }
}
