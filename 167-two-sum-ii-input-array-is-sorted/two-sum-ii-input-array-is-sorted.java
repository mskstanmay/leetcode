class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] ans = new int[2];

        while (i < j) {
            int v = numbers[i] + numbers[j];
            if (v == target) {
                ans[0] = i + 1;
                ans[1] = j + 1;

                return ans;
            } else if (v > target) {
                j--;
            } else {
                i++;
            }

        }
        return ans;
    }
}