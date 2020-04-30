package saiki.power;

public class Main {

    static int power(int a, int n) {
        if(n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 6)); // 1024
    }

}
