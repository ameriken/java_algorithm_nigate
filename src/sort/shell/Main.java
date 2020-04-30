package sort.shell;

public class Main {
    public static void main(String[] args) {

        int a[] = {10,3,1,9,7,6,8,2,4,5};

        for (int step = a.length / 2; step  > 0; step/=2) {
            // デバックコード
            // System.out.print("step="  + i + " ");
            for (int i = step; i < a.length; i++){
                // デバックコード
                // System.out.print("i="  + i + " ");
                int tmp = a[i];
                int j = i;
                for(j = i; j >= step; j-=step) {
                    // デバックコード
                    // System.out.print("j="  + i + " ");
                    if (a[j-step] > tmp) {
                        a[j] = a[j-step];
                    } else {
                        break;
                    }
                }
                a[j] = tmp;
            }
        }

        for (int i: a) {
            System.out.println(i);
        }
    }
}
