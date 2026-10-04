class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int curr: nums) {
            hs.add(curr);
        }

        return nums.length != hs.size();
    }
}