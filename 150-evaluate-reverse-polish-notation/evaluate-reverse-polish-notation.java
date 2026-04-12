class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int a = stk.pop();
                int b = stk.pop();
                int x = 1;
                switch (s.charAt(0)) {
                    case '+':
                        x = a + b;
                        break;
                    case '-':
                        x = b - a;
                        break;
                    case '*':
                        x = a * b;
                        break;
                    case '/':
                        x = b / a;
                    break;
                }
                stk.push(x);
            } else {
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.pop();
    }
}