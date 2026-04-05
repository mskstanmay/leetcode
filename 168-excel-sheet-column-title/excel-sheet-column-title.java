class Solution {
    public String convertToTitle(int n) {
        /*
        
        number = 88
        88 % 26 = 10;
        88 / 26 = 3;
        
        3 * (26) + 10
        CJ
        
        
        1 -> a 
        26 -> z
        
        */

        StringBuilder res = new StringBuilder();

        while (n > 0) {
            n--;
            res.insert(0, (char) ((n % 26) + 'A'));
            n /= 26;
        }

        return res.toString();
    }

}
