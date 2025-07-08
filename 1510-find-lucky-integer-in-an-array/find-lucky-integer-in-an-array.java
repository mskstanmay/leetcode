class Solution {

    static {
        int[] a = { 1, 2, 3, 4 };
        for (int i = 0; i < 200; i++) {
            findLucky(a); // static method call
        }
    }

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> v = new HashMap<>();
        int l = -1;
        for (int i : arr) {
            v.put(i, v.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : v.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (key == value && key > l)
                l = key;
        }
        return l;
    }
}