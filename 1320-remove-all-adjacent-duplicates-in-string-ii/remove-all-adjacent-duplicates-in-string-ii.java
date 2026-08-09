class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stk = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stk.isEmpty() && stk.peek()[0] == c) {
                stk.peek()[1]++;
                if (stk.peek()[1] == k)
                    stk.pop();
            } else {
                stk.push(new int[] { c, 1 });
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] x : stk) {
            char c = (char) x[0];
            int count = x[1];
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}