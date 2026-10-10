class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int leftProduct = 1;
        int rightProduct = 1;

        result[0] = leftProduct;
        for(int i = 1 ; i < length; i++) {
            result[i] = leftProduct * nums[i-1];
            leftProduct = result[i];
        }

        result[length - 1] = result[length - 1] * rightProduct;
        for(int j = length - 2; j >=0; j--) {
            result[j] = nums[j+1] * result[j] * rightProduct;
            rightProduct = rightProduct * nums[j+1];

        }
        return result;
    }
}  
