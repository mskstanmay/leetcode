import java.util.Arrays;

class Solution {
    /*
    Approach:
    Start by placing queen at r1c1 and solve:
    - Whenever queen is placed go to next column
    - Check left, top left diagonal, bottom left diagonal for any queens
    - If found, next (Dots refer to taken place) 
    - If not found, place queen
    - If n == column, backtrack and Increment result by 1
    */
    private char[][] board;
    private int n;
    private int count;

    public int totalNQueens(int n) {
        this.n = n;
        this.count = 0;
        this.board = new char[n][n];
        
        // Initializing the board with dots
        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');
            
        nQueen(0);
        return count;
    }

    // Removed static to allow access to instance variables (board, count, n)
    private void nQueen(int c) {
        // If n == column, backtrack and Increment result by 1
        if (c == n) {
            count++; // Actually increment the solution counter
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if (isSafe(i, c)) {
                // Backtracking after placing queen 
                board[i][c] = 'Q';
                nQueen(c + 1);
                board[i][c] = '.';
            }
        }
    }

    private boolean isSafe(int row, int column) {
        for (int i = 0; i < column; i++)
            if (board[row][i] == 'Q')
                return false; // Check left to current point
                
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false; // Check top left diagonal 
                
        for (int i = row, j = column; i < n && j >= 0; i++, j--)
            if (board[i][j] == 'Q')
                return false; // Check bottom left diagonal 
                
        return true;
    }
}