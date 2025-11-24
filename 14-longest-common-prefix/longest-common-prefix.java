class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            int j = 0;

            while (j < prefix.length() && j < current.length() 
                   && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }

            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) return "";
        }

        return prefix;
    }
}
