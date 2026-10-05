class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++) {
            int complement = target - nums[i];
            if(indexMap.containsKey(complement)) {
                int indexInMap = indexMap.get(complement);
                return new int[] {indexInMap, i};
            }
            indexMap.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
