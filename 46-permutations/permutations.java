class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        int n = nums.length;

        // Base case: If there's only one number, return [[nums[0]]]
        if (n == 1) {
            List<Integer> base = new LinkedList<>();
            base.add(nums[0]);
            res.add(base);
            return res;
        }

        for (int i = 0; i < n; i++) {
            int[] smallArray = new int[n - 1];
            int index = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                smallArray[index++] = nums[j];
            }

            List<List<Integer>> subPerms = permute(smallArray);

            for (List<Integer> p : subPerms) {
                List<Integer> bigList = new LinkedList<>(p);
                bigList.add(nums[i]);
                res.add(bigList);
            }
        }

        return res;
    }
}