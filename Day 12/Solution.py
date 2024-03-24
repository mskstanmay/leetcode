class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        # Using two pointer approach with different speeds
        slow = nums[0]
        fast = nums[0]

        # Move slow by one step and fast by two steps...
        while True:
            slow = nums[slow]
            fast = nums[nums[fast]]
            if slow == fast:
                break

        # Move slow to the start and move both pointers by one step ....
        slow = nums[0]
        while slow != fast:
            slow = nums[slow]
            fast = nums[fast]

        return slow
