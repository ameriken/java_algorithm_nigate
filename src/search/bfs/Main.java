package search.bfs;


import static search.bfs.Bfs.longestPath;
//import static search.bfs.Practice.longestPath;

public class Main {

    public static void main(String[] args) {

        //コード
        String[] maze = {
                "...",
                "...",
                "..."
        };

        int startRow= 0;
        int startCol= 1;
        int[] moveRow = {1, 0, -1, 0};
        int[] moveCol = {0, 1, 0, -1};

        System.out.println(longestPath(maze, startRow, startCol, moveRow, moveCol));
    }
}
