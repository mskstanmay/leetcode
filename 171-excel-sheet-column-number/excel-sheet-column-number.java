class Solution {
    public int titleToNumber(String columnTitle) {
       
        char[] chars = columnTitle.toCharArray();
        int res = 0;
        for(int i  = 0; i < chars.length;i++){
            res = res * 26 + (chars[i] - 'A' + 1);
        }

        return res;
    }
}