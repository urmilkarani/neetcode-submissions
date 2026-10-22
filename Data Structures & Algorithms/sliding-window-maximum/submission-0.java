class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = nums[0];
        rightMax[n-1] = nums[n-1];

        for(int i = 1; i < n; i++) {
            leftMax[i] = (i % k == 0) ? nums[i] : Math.max(leftMax[i-1], nums[i]);
            rightMax[n-i-1] = ((n-i-1) % k == 0) ? nums[n-i-1] 
                                    : Math.max(nums[n-i-1], rightMax[n - i]);
        }

        int[] output = new int[n-k+1];
        for(int i = 0; i < n-k+1; i++) {
            output[i] = Math.max(rightMax[i], leftMax[i+k-1]);
        }

        return output;
    }
}
