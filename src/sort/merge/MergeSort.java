package sort.merge;

public class MergeSort {
    public static void merge(int n, int[] x, int offset) {

        if( n <= 1) return;
        int m = n / 2;

        merge(m, x, offset);
        merge(n-m, x, offset+m);

        int[] buffer = new int[m];
        for(int i = 0; i < m; ++i) {
            buffer[i] = x[offset+i];
        }

        int j = m;
        int i = 0;
        int k = 0;
        while(i < m && j < n) {
            if(buffer[i] <= x[offset+j]) {
                x[offset + k++] = buffer[i++];
            } else {
                x[offset + k++] = x[offset + j++];
            }
        }

        while(i < m) {
            x[offset + k++] = buffer[i++];
        }
    }
}
