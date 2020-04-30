package palindrome;

public class Main {

    public static int find(String s) {
        for(int i = s.length(); ; i++) {
            boolean flag = true;
            for(int k =0; k < s.length(); k++) {
                // デバックコード
                //System.out.println("k= "+k);
                //System.out.println("i= "+i);
                if( (i - k - 1) < s.length()
                        && s.charAt(k) != s.charAt(i - k -1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return i;

        }

    }
    public static void main(String[] args) {
        //String s = "abdfhdyrbdbsdfghjkllkjihgfds";
        //String s = "abacaba";
        String s = "ywerty";
        System.out.println(find(s));
    }
}
