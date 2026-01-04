class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += getDivisorSumIfFour(num);
        }
        return totalSum;
    }

    private int getDivisorSumIfFour(int num) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                sum += i;

                if (i * i != num) {
                    count++;
                    sum += (num / i);
                }
                if (count > 4)
                    return 0;
            }
        }

        return (count == 4) ? sum : 0;
    }
}