
package union_find;

public class Practice {

    int[] uni;

    //-1で初期化
    Practice(int size){
        uni = new int[size];
        for(int i=0;i<size;i++) uni[i] = -1;
    }

    // 頂点aの所属するグループを調べる
    int root(int a) {
        //ここにコードをかく
        return 1;
    }

    boolean connect(int a, int b) {
        //ここにコードをかく
        return true;
    }

    boolean isConnect(int a, int b) {
        return root(a) == root(b);
    }

    int size(int a) {
        return -uni[root(a)];
    }
}
