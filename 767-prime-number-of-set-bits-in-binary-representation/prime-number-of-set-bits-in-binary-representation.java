class Solution {
    public int countPrimeSetBits(int left, int right) {
        // 10 ^ 6 in binary is 11000000; therefore max number of 1's is 8 
        // Primes less than 9 are 2,3,5,7;
        int res = 0;
        while (left <= right) {
            if (satisfies(left))
                res++;
            left++;
        }
        return res;
    }

    public boolean satisfies(int value) {
        int n = Integer.bitCount(value);
        if (n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 13 || n == 17 || n == 19)
            return true;
        return false;
    }
}