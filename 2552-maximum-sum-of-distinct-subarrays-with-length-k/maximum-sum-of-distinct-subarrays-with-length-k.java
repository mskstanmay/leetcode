class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        long windowSum = 0;
        long maxSum = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            // Add the new element
            int num = nums[i];
            windowSum += num;
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            // If window has exceeded size k
            if (i - j + 1 > k) {
                int leftNum = nums[j];
                windowSum -= leftNum;
                freq.put(leftNum, freq.get(leftNum) - 1);
                if (freq.get(leftNum) == 0) {
                    freq.remove(leftNum);
                }
                j++;
            }

            // Window size is k, check distinct
            if (i - j + 1 == k) {
                if (freq.size() == k) {
                    maxSum = Math.max(maxSum, windowSum);
                }
            }
        }

        return maxSum;
    }
}