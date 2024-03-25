/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    let res = [];
    let n = nums.length;
    for (let i = 0; i < n; i++) {
        let num = Math.abs(nums[i]);
        let idx = num - 1;
        if (nums[idx] < 0) {
            res.push(num);
        }
        nums[idx] *= -1;
    }
    return res;
};
