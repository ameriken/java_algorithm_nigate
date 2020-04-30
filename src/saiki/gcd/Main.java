package saiki.gcd;

public class Main {
    public static Long gcd(Long a, Long b) {
        if(a < b) return gcd(b,a);
        if(b == 0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        //コード
        Long a = 3L;
        Long b = 15L;

        Long sum = gcd(a, b);

        // 最大公倍数
        System.out.println(sum);

        // (与えられた整数 * 与えられた) / 整数最大公倍数 = 最小公倍数
    }
}