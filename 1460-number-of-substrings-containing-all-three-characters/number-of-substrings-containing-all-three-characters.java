class Solution {
    public int numberOfSubstrings(String s) {
        int l1= -1;
        int l2= -1;
        int l3= -1;
        //int[] last = { -1, -1, -1 };
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            
            //last[s.charAt(i) - 'a'] = i;
            if(s.charAt(i) == 'a') l1 =i;
            if(s.charAt(i) == 'b') l2 =i;
            if(s.charAt(i) == 'c') l3 =i;

            if (l1 != -1 && l2 != -1 && l3 != -1) {
                count += Math.min(l1, Math.min(l2, l3)) + 1;
            }
        }

        return count;
    }
}