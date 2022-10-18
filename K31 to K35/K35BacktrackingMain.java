import java.util.Arrays;

public class K35BacktrackingMain {

    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        // AllPaths("", board, 0, 0);

        int[][] path = new int[board.length][board[0].length];

        AllPathsPrint("", board, 0, 0, path, 1);
    }

    static void AllPaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path

        maze[r][c] = false;

        if (r < maze.length - 1) {
            AllPaths(p + 'D', maze, r + 1, c);
        }
        if (c < maze.length - 1) {
            AllPaths(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            AllPaths(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            AllPaths(p + 'L', maze, r, c - 1);
        }

        // this line is where the fn will be over
        // so before fn gets removed also revert the changes that were made by it
        maze[r][c] = true;
    }

    static void AllPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            for (int[] arr : path) {
                path[r][c] = step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            AllPathsPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            AllPathsPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            AllPathsPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            AllPathsPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        // this line is where the fn will be over
        // so before fn gets removed also revert the changes that were made by it
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
