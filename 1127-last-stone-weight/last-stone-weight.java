class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            pq.add(i);
        }
        while (pq.size() > 1) {
            int i = pq.remove();
            int j = pq.remove();

            int nstone = i - j;

            if (nstone != 0) {
                pq.add(nstone);
            }

        }

        if(pq.size() == 0) return 0;
        return pq.remove();
    }
}