import java.util.*;

class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int arraygcd = numsDivide[0];
        for (int x : numsDivide) {
            arraygcd = gcd(arraygcd, x);
        }

        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     if (arraygcd % nums[i] == 0)
        //         return i;
        // }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (arraygcd % nums[i] == 0) {
                min = Math.min(min, nums[i]);
            }
        }
        if (min == Integer.MAX_VALUE)
            return -1;
        int c = 0;
        for (int i : nums) {

            if (i < min)
                c++;
        }
        return c;
    }

    public int gcd(int a, int b) {
        return (b == 0 ? a : gcd(b, a % b));
    }
}