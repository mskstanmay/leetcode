class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if (numExchange > numBottles)
            return numBottles;
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remBottels = numBottles % numExchange;

            ans += newBottles;
            numBottles = newBottles + remBottels;
        }

        return ans;
  

    }
}