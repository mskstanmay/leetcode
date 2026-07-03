import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int n = s.length();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int currentVal = hm.get(s.charAt(i));
            
            if (i < n - 1 && currentVal < hm.get(s.charAt(i + 1))) {
                sum -= currentVal;
            } else {
                sum += currentVal;
            }
        }
        
        return sum;
    }
}