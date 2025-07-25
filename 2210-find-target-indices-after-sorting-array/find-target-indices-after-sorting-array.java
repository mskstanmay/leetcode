class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = 0;
        int count = 0;

        for (int i : nums) {
            if (i == target) {
                count++;
            } else if (i < target) {
                n++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (count > 0) {
            ans.add(n);
            n++;
            count--;
        }
        return ans;
    }
}