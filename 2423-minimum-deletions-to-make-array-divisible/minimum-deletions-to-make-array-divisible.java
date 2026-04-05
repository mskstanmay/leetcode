import java.util.*;

class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int arraygcd = numsDivide[0];
        for(int x : numsDivide){
            arraygcd = gcd(arraygcd,x);
        }

        Arrays.sort(nums);
        for(int i = 0 ;i < nums.length;i++){
            if(arraygcd % nums[i] == 0) return i;
        }
        return -1;
    }

    public int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        return gcd(b, a % b);
    }
}