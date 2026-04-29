package recursion;

public class Day24_NQueens {
	public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        solve(board, 0);
    }

    static void solve(boolean[][] board, int row) {

        if (row == board.length) {
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {
                board[row][col] = true;

                solve(board, row + 1);

                board[row][col] = false; // backtrack
            }
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // left diagonal
        int leftMax = Math.min(row, col);
        for (int i = 1; i <= leftMax; i++) {
            if (board[row - i][col - i]) return false;
        }

        // right diagonal
        int rightMax = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= rightMax; i++) {
            if (board[row - i][col + i]) return false;
        }

        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "Q " : "X ");
            }
            System.out.println();
        }
    }

}
