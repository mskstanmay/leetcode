class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for (char x : s.toCharArray()) {
            if (!stk.isEmpty() && stk.peek() == x) {
                stk.pop();
            } else {
                stk.push(x);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char x : stk)
            sb.append(x);
        return sb.toString();
    }
}