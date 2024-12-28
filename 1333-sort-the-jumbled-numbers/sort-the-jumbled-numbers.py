class Solution(object):
    def sortJumbled(self, mapping, nums):
        """
        :type mapping: List[int]
        :type nums: List[int]
        :rtype: List[int]
        """
        def get_mapped_value(number):
            """
            Convert a number to its mapped value based on the mapping.
            """
            numarray = []
            while number > 0:
                lastdigit = number % 10
                number = number // 10
                numarray.append(mapping[lastdigit])
            if not numarray:
                numarray.append(mapping[0])  # Case 0
            numarray.reverse()  # Original num
            mapped_value = int(''.join(map(str, numarray)))
            return mapped_value
        
        # Create a list of tuples where each tuple is (mapped value, original number)
        mapped_nums = [(get_mapped_value(number), number) for number in nums]
        
        mapped_nums.sort(key=lambda x: x[0])
        
        return [number for _, number in mapped_nums]