class Solution {
    /*
    A string can be 
     
    1 
    10
    101
    110
    1*N 0ch



    */
    public boolean checkOnesSegment(String s) {
        boolean hasSeen1 = false;
        for(int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(hasSeen1 == false && c == '1') hasSeen1 = true;
            if (c  == '0' && hasSeen1) return false; 
        }
        return true;
    }
}