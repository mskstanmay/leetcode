class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastOccurrence = new int[26];
        boolean[] used = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            lastOccurrence[ch - 'a'] = i;
        }

        Stack<Character> res = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';

            if (!used[index]) { // Charachter needs to be added
                while (!res.isEmpty() && res.peek() > c && lastOccurrence[res.peek() - 'a'] > i) {
                    used[res.pop() - 'a'] = false;
                }
                res.push(c);
                used[index] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : res) {
            sb.append(ch);
        }
        return sb.toString();
    }
}