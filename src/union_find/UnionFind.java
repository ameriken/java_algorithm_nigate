package union_find;

public class UnionFind {

    int[] uni;

    //-1で初期化が必要です
    //サイズをコンストラクタで受け取れるようにしましょう（1000決め打ちだと、1000までのデータにしか対応できない）
    UnionFind(int size){
        uni = new int[size];
        for(int i=0;i<size;i++) uni[i] = -1;
    }

    // 頂点aの所属するグループを調べる
    int root(int a) {
        //負の値が入ってれば、それが親
        if(uni[a] < 0) return a;
        //正の値であれば、親のrootを調べ帰り値で直接つなぐ
        return uni[a] = root(uni[a]);
    }

    boolean connect(int a, int b) {
        a = root(a);
        b = root(b);
        if (a == b) return false;
        //aを大きなグループにしたいので、逆であれば入れ替えする
        if(uni[a] > uni[b])  {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        //aとbを結合し、bの親をaとする
        uni[a] = uni[a] + uni[b];
        uni[b] = a;
        return true;
    }

    boolean isConnect(int a, int b) {
        return root(a) == root(b);
    }

    int size(int a) {
        return -uni[root(a)];
    }
}
