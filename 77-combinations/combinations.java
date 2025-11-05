import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> current = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            current.add(i);
        }

        current.add(n + 1);

        int j = 0;

        while (j < k) {
            result.add(new ArrayList<>(current.subList(0, k)));

            j = 0;
            while (j < k && current.get(j) == current.get(j + 1) - 1)     j++;
            

            if (j < k) {
                current.set(j, current.get(j) + 1);

                for (int i = 0; i < j; i++)  current.set(i, i + 1);
                
            }
        }

        return result;
    }
}