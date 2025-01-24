class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        unordered_set<int> seen;  // To track unique elements
        int writeIndex = 0;       // Index for placing unique elements

        for (int num : nums) {
            if (seen.find(num) == seen.end()) { 
                nums[writeIndex++] = num;  // Place unique number in the current write index
                seen.insert(num);          // Add the number to the set
            }
        }

        return writeIndex;  // Return the new length of the modified array
    }
};
