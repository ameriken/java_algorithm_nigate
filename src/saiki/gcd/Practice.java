package saiki.gcd;

public class Practice {
    public static Long gcd(Long a, Long b) {
        // ここにこーどを書く
        if(a < b) return gcd(b, a);
        if(b == 0) return  1L;
        return gcd(b, a%b);
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
