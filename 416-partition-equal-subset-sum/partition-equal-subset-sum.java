class Solution {
    int[][] memo;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int x : nums){
            sum+=x;
        }
        if(sum % 2 !=0) return false;
        int halfSum = sum / 2;
        memo = new int[nums.length +1][halfSum +1];
        for(int[] row : memo) Arrays.fill(row,-1);
        return helper(nums,0,halfSum);
    }
    public boolean helper(int[] nums, int index, int sum){
        if(sum == 0) return true;
        if(index >= nums.length) return false;
        if(memo[index][sum] != -1) return memo[index][sum] == 1;


        boolean a1 = false;
        if(sum - nums[index] >= 0){
            a1 = helper(nums,index+1,sum-nums[index]);
        }
        boolean a2 = helper(nums,index+1,sum);


        memo[index][sum] = (a1 || a2 ? 1: 0);
        return a1 || a2;
    }
}