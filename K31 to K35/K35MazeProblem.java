public class K35MazeProblem {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true, false },
                { true, false, true, true },
                { false, true, true, true },
                { true, false, true, true }
        };

        pathRestrict("", board, 0, 0);
    }

    static void pathRestrict(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[r][c] == false) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrict(p + 'D', maze, r + 1, c);
        }
        if (c < maze.length - 1) {
            pathRestrict(p + 'R', maze, r, c + 1);
        }
    }
}
