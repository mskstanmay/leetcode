class Solution {
    boolean[] visited = new boolean[7]; //  1 <= nums.length <= 6
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        backtrack(nums, new Integer[n], 0);
        return result;
    }

    void backtrack(int[] nums, Integer[] crr, int idx) {
        if (idx == crr.length) {
            List<Integer> list = new ArrayList<>();
            for (int c : crr) {
                list.add(c);
            }
            result.add(list);
        }
        for (int i = 0; i < nums.length; ++i) {
            if (visited[i])
                continue;
            
            // Backtracking logic
            visited[i] = true;
            crr[idx] = nums[i];
            backtrack(nums, crr, idx + 1);
            visited[i] = false;
        }
    }
}