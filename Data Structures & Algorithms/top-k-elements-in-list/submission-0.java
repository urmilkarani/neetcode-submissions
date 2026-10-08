class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int[] result = new int[k];
        for(int curr: nums) {
            freqMap.put(curr, freqMap.getOrDefault(curr, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
            if(pq.size() > k) {
                pq.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[1];
        }
        return result;
    }
}
