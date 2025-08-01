class Solution {
    public int findDuplicate(int[] nums) {
        int res= 0;
        for(int i = 0 ;i<nums.length;i++){
            int element = nums[i];
            element = Math.abs(element);

            if(nums[element] > 0){
                nums[element] = -nums[element];
            }else {
                res = element;
                break;
            }
        }
        for(int i:nums ){
            i =  Math.abs(i);
        }
        return res;
    }
}