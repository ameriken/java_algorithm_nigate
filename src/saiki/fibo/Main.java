package saiki.fibo;

public class Main {

    private static int fibo(int n) {

        if(n < 2) {
            return n;
        } else {
            int fibo1 = fibo(n-1);
            int fibo2 = fibo(n-2);
            return fibo1 + fibo2;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibo(3));
    }
}
