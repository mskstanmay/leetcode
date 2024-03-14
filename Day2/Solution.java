import java.util.*;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int c = 0;
        int sum = 0;
        HashMap<Integer, Integer> pSum = new HashMap<>();
        pSum.put(0, 1);  

        for (int num : nums) {
            sum += num;
            c += pSum.getOrDefault(sum - goal, 0);

            pSum.put(sum, pSum.getOrDefault(sum, 0) + 1);
        }

        return c;
    }
}
