package saiki.permutation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<String> permutation(String list) {
        List<String> ans = new ArrayList<>();
        if (list.length() == 1) {
            return Collections.singletonList(list);
        }
        for (int i = 0; i < list.length(); i++) {
            char pick = list.charAt(i);
            String rest = list.substring(0, i) + list.substring(i + 1);
            for (String rest_permutation : permutation(rest)) {
                ans.add(pick + rest_permutation);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //コード
        String number = "";
        for(int i = 1; i <= 5; i++) {
            number += i;
        }

        System.out.println(permutation(number));
    }
}
