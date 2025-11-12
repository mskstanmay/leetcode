class Solution {

   private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        int oneCount = 0;
        int overallGcd = 0;

        for (int x : nums) {
            if (x == 1) {
                oneCount++;
            }
            overallGcd = gcd(overallGcd, x);
        }

        if (oneCount > 0) {
            return n - oneCount;
        }

        if (overallGcd != 1) {
            return -1;
        }

        int minSubLen = Integer.MAX_VALUE;

        for (int l = 0; l < n; l++) {
            int currentGcd = 0;
            for (int r = l; r < n; r++) {
                
                if (r - l + 1 >= minSubLen) {
                    break;
                }

                currentGcd = gcd(currentGcd, nums[r]);

                if (currentGcd == 1) {
                    minSubLen = r - l + 1;
                    break; 
                }
            }
        }

       return (minSubLen - 1) + (n - 1);
    }
}