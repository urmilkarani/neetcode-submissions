class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++) {
            int complement = target - nums[i];
            if(indexMap.containsKey(nums[i])) {
                int indexInMap = indexMap.get(nums[i]);
                int minIndex = Math.min(i, indexInMap);
                int maxIndex = Math.max(i, indexInMap);
                return new int[] {minIndex, maxIndex};
            }
            indexMap.put(complement, i);
        }
        return new int[]{0,0};
    }
}
