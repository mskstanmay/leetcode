class Solution:
    def pivotInteger(self, n: int) -> int:
        if n == 1:
            return 1

        for i in range(2, n + 1):
            sum1 = sum(range(i))
            sum2 = sum(range(i + 1, n + 1))
            if sum1 == sum2:
                return i

        return -1
