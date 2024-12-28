class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> sim = new ArrayList<>();
        for (int num : nums1) {
            arr.add(num);
        }
        int result = 0;
        boolean found = false;
        for (int num1 : nums2) {
            if (arr.contains(num1)) {
                sim.add(num1);
            }
        }
        if (sim.size() > 0) {
            result = Collections.min(sim);
            return result;
        }
        if (found != true) {
            int min1 = Arrays.stream(nums1).min().getAsInt();
            int min2 = Arrays.stream(nums2).min().getAsInt();
            result = min1 > min2 ? min2 * 10 + min1 : min1 * 10 + min2;
        }
        return result;
    }
}