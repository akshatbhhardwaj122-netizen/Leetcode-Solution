import java.util.*;

class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(board, 0, n);

        return ans;
    }

    void backtrack(char[][] board, int row, int n) {

        // All queens placed
        if (row == n) {
            saveBoard(board);
            return;
        }

        // Try every column
        for (int col = 0; col < n; col++) {

            // Check safe position
            if (isSafe(board, row, col, n)) {

                // Choose
                board[row][col] = 'Q';

                // Recurse
                backtrack(board, row + 1, n);

                // Undo
                board[row][col] = '.';
            }
        }
    }

    boolean isSafe(char[][] board, int row, int col, int n) {

        // Check upper column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    void saveBoard(char[][] board) {

        List<String> temp = new ArrayList<>();

        for (char[] row : board) {
            temp.add(new String(row));
        }

        ans.add(temp);
    }
}
