class Solution {
    public String reverseWords(String s) {
        String[] ar = s.split("\\s+");

        StringBuilder res = new StringBuilder("");
        for(int i = ar.length-1;i>=0;i--) res.append(ar[i] + " ");
        return res.toString().trim();
    }
}