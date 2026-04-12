import java.util.ArrayList;
import java.util.List;

class Solution {
    private final char[][] keypad = {
            {}, {},
            { 'a', 'b', 'c' }, // 2
            { 'd', 'e', 'f' }, // 3
            { 'g', 'h', 'i' }, // 4
            { 'j', 'k', 'l' }, // 5
            { 'm', 'n', 'o' }, // 6
            { 'p', 'q', 'r', 's' }, // 7
            { 't', 'u', 'v' }, // 8
            { 'w', 'x', 'y', 'z' } // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        char[] letters = keypad[digit];

        for (char c : letters) {
            current.append(c);
            backtrack(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}