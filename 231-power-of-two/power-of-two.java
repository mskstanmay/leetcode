class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
       
        while ((n & 1) == 0) {
            n >>= 1;
        }
        return n==1;        
    }
}