package recursion;

public class Day25_NKnights {
	public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, n);
    }

    static void knights(boolean[][] board, int row, int col, int knights) {

        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) return;

        if (col == board.length) {
            knights(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;

            knights(board, row, col + 1, knights - 1);

            board[row][col] = false; // backtrack
        }

        knights(board, row, col + 1, knights);
    }

    static boolean isSafe(boolean[][] board, int r, int c) {

        if (isValid(board, r - 2, c - 1) && board[r - 2][c - 1]) return false;
        if (isValid(board, r - 2, c + 1) && board[r - 2][c + 1]) return false;
        if (isValid(board, r - 1, c - 2) && board[r - 1][c - 2]) return false;
        if (isValid(board, r - 1, c + 2) && board[r - 1][c + 2]) return false;

        return true;
    }

    static boolean isValid(boolean[][] board, int r, int c) {
        return r >= 0 && c >= 0 && r < board.length && c < board.length;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "K " : "X ");
            }
            System.out.println();
        }
    }


}