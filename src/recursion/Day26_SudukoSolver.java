package recursion;

public class Day26_SudukoSolver {
    public static void main(String[] args) {

        int[][] board = {
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };

        solve(board);
        display(board);
    }

    static boolean solve(int[][] board) {

        int n = board.length;

        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) break;
        }

        if (emptyLeft) return true;

        for (int num = 1; num <= 9; num++) {

            if (isSafe(board, row, col, num)) {

                board[row][col] = num;

                if (solve(board)) return true;

                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    static boolean isSafe(int[][] board, int r, int c, int num) {

        for (int i = 0; i < 9; i++) {
            if (board[r][i] == num) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][c] == num) return false;
        }

        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = r - r % sqrt;
        int colStart = c - c % sqrt;

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true;
    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
