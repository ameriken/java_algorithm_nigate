package dp.knapsack;

// javaプログラマのためのアルゴリズムとデータ構造

public class Main {

    public static void main(String[] args)
    {
        Knapsack knapsack = new Knapsack(
                new int[] { 2, 3, 5, 7, 9},
                new int[] { 2, 4, 7, 11, 14}
        );

        //Practice kanpsack = new Practice(
        //        new int[] { 2, 3, 5, 7, 9},
        //        new int[] { 2, 4, 7, 11, 14}
        //);

        int size = 0;
        size = Integer.parseInt(args[0]);


        knapsack.solve(size);
    }
}

