/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let len = nums.length;
    let res = new Array(len);
    let lpdt = 1;

    for (let i = 0; i < len; i++) {
        res[i] = lpdt;
        lpdt *= nums[i];
    }

    let rpdt = 1;
    for (let i = len - 1; i >= 0; i--) {
        res[i] *= rpdt;
        rpdt *= nums[i];
    }

    return res;
};
