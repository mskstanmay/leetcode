class Solution {
    public int minOperations(int[] nums, int k) {
        int s = 0;
        for (int x : nums)
            s += x;
        int rem = s%k;
        if (rem == 0)
            return 0;
        else return rem;
    }
}