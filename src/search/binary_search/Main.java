package search.binary_search;

public class Main {
    // 平均計算量: O(log2 n)
    public static void main(String[] args) {

        int a[] = {1,2,4,5,10};
        int searchValue = 7;
        int findID = -1;


        int left = 0;
        int right = a.length - 1;


        while(left <= right) {
            int middle = (int) ((left + right) / 2);

            if (a[middle] == searchValue) {
                findID = middle;
                break;
            } else if (a[middle] < searchValue) {
                left = middle + 1;

            } else {
                right = middle - 1;
            }


        }

        System.out.println("見つかった番号 = " + findID);
    }
}
