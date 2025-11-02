class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;

        for(char A : s.toCharArray()) c ^=A;
        for(char B : t.toCharArray()) c ^=B;
        
        return c;
    }
}