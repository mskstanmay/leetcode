class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        StringBuilder prefix = new StringBuilder("");
        StringBuilder suffix = new StringBuilder("");
        String res = "";
        for (int i = 0; i < n - 1; i++) {
            prefix.append(s.charAt(i));
            suffix.insert(0, s.charAt(n - 1 - i));
            if(prefix.compareTo(suffix) == 0) res = prefix.toString();
        }
       // if(prefix.compareTo(suffix) == 0) return prefix.toString();
        return res;
    }
}