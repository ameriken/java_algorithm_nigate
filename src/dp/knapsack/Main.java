package dp.knapsack;

// javaプログラマのためのアルゴリズムとデータ構造

public class Main {

    public static void main(String[] args)
    {
        Knapsack knapsack = new Knapsack(
                // 商品の重さ
                new int[] { 2, 3, 5, 7, 9},
                // 商品の価値
                new int[] { 2, 4, 7, 11, 14}
        );

        //Practice kanpsack = new Practice(
        //        new int[] { 2, 3, 5, 7, 9},
        //        new int[] { 2, 4, 7, 11, 14}
        //);



        knapsack.solve(10);
    }
}

