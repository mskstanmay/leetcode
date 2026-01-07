class Solution {
    public String convertToTitle(int columnNumber) {
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

        while (columnNumber > 0) {
            columnNumber--;
            res.insert(0, (char) ((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }

        return res.toString();
    }

}
