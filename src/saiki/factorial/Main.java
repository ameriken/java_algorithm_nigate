package saiki.factorial;

public class Main {

    private static long factorial(int number) {
        if(number == 1) {
            return 1L;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i ++) {
            long value = factorial(i);
            System.out.println(i + "の階乗は " + value);
        }
    }
}
