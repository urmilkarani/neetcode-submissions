class Solution {
    public int maxArea(int[] heights) {
        int length = heights.length;
        int result = Integer.MIN_VALUE;
        int left = 0, right = length - 1;
        while(left < right) {
            result = Math.max(result, (right - left)*Math.min(heights[left], heights[right]));
            if(heights[left] >= heights[right]) {
                right--;
            } else{
                left++;
            }
        }

        return result;
    }
}
