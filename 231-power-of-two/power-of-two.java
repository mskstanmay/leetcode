class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
        if ((n % 10 & 1) != 0 || n % 10 == 0)
            return false;

        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1)
            return true;
        else
            return false;

        // 0,1,2,3,4,5,6,7,8,9
        /*
        2 ,4,8,6,2
        */
        
    }
}