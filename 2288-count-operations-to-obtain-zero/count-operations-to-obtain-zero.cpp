class Solution {
public:
    int countOperations(int num1, int num2, int res = 0) {
        if (num1 == 0 || num2 == 0)
            return res;

        auto [q, r] = div(num1, num2);
        return countOperations(num2, r, res + q);
    }
};