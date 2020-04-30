package saiki.factorial;

public class Practice {
    private static long factorial(int number) {
        // コードを書く
        return (Long) 1L;
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i ++) {
            Long value = factorial(i);
            System.out.println(i + "の階乗は " + value);
        }
    }
}
