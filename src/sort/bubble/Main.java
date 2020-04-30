package sort.bubble;

public class Main {
    //平均計算量: O(N^2)
    public static void main(String[] args) {

        int a[] = {1,0,3,1,4,2};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j-1]) {
                    int tmp = a[j];
                    a[j] =  a[j-1];
                    a[j-1] = tmp;
                }
            }
        }

        for (int i: a) {
            System.out.println(i);
        }
    }
}
