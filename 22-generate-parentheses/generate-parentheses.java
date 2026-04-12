import java.util.*;

class Solution {
    private List<String> res;

    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        // Start the recursive backtracking
        backtrack(0, 0, "", n);
        return res;
    }

    private void backtrack(int openCount, int closeCount, String current, int n) {
        if (current.length() == n * 2) {
            res.add(current);
            return;
        }

        if (openCount < n) {
            backtrack(openCount + 1, closeCount, current + "(", n);
        }

        if (closeCount < openCount) {
            backtrack(openCount, closeCount + 1, current + ")", n);
        }
    }
}