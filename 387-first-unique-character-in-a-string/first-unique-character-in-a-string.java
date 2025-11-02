import java.util.HashMap;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();

        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0) +1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}