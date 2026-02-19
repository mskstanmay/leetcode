class Solution {
    public int countBinarySubstrings(String s) {
        int res = 0, prev = 0, strk = 1;

/*
Similar to taking all consecutive streaks of 0 and 1 as sticks 
and then taking smaller stick as the basis for calculation 
example
00 111
as 00 is 2 digits combinations = 2
00111
0111  
*/
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) strk++;
            else {
                prev = strk;
                strk = 1;
            }
            if (strk <= prev) res++;
        }
        return res;
    }
}
