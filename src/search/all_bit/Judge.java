package search.all_bit;
// 問題URL
// https://atcoder.jp/contests/abc147/tasks/abc147_c

// 参考になった記事
// https://qiita.com/drken/items/7c6ff2aa4d8fce1c9361
// https://drken1215.hatenablog.com/entry/2019/12/14/171657


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Judge {
    private static Integer N;
    private static List<List<List<Integer>>> list = new ArrayList<>();

    public static boolean judge(Integer bit, List<List<List<Integer>>> list, Integer N) {

        // 仮定した証言とi人目の発言が矛盾してるか
        for (int i = 0; i < N; ++i) {
            // 仮定した証言のi人目が「不親切」だったら、証言は無意味
            // 不親切な人の発言は矛盾を発見できない
            if ((bit & (1 << i)) == 0) continue;

            // i番目が親切な人と仮定したなら、そのi番目の発言を取り出して調査する
            List<List<Integer>> xys = list.get(i);
            for (List<Integer> xy : xys) {
                int x = xy.get(0); // xが
                int y = xy.get(1); // 1 = 親切, 0= 不親切

                // 前提: x番目の証言(親切or不親切)と仮定した証言(bit)が矛盾したらfalseを返す
                // y==1とは、仮定した証言(bit)との比較においてx番目の人が親切でなければならない
                // xの証言が親切 && x番目の証言(親切)と仮定した証言(bit)とのxが不一致な場合はfalseを返す
                if (y == 1 && ((bit & (1 << x)) == 0)) return false;

                // y==0とは、仮定した証言(bit)との比較においてx番目の人が不親切でなければならない
                // xの証言が不親切 && x番目の証言(不親切)と仮定した証言(bit)のxが一致した場合はfalseを返す
                if (y == 0 && ((bit & (1 << x)) != 0)) return false;
            }
        }
        return true;
    }

}
