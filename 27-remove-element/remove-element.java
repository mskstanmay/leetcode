class Solution {
    public int removeElement(int[] nums, int val) {
        //max val given is 50;
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                i++; // keep this element
            }
        }
        return j + 1;
    }
}