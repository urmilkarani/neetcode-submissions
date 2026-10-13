class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int length = prices.length;
        int result = 0;
        int l = 0, r = 1;
        while(l < length & r < length) {
            if(prices[l] < prices[r]) {
                result = Math.max(result, prices[r] - prices[l]);
            } else {
                l = r;
            }
            r++;
        }

        return result;
    }
}
