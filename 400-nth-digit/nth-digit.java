import java.util.*;

class Solution {
    public int findNthDigit(int n) {
        int dl =1;
        long count = 9;
        long start = 1;
        while (n > dl * count) {
            n -= dl * count;
            dl++;
            count *= 10;
            start *= 10;
        }
        long number = start + (n - 1) / dl;
        String numStr = Long.toString(number);
        int pos = (n - 1) % dl;
        return numStr.charAt(pos) - '0';

    }
}