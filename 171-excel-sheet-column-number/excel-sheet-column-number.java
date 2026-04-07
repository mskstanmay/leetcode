class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('A' + i); 
            hm.put(letter, i + 1); 
        }
        char[] chars = columnTitle.toCharArray();
        int res = 0;
        for(int i  = 0; i < chars.length;i++){
            res = res * 26 + hm.get(chars[i]);
        }

        return res;
    }
}