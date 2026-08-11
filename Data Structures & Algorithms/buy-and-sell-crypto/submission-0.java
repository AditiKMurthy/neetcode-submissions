class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int lft = 0;

        for(int rt=0; rt<prices.length; rt++) {
            if(prices[lft]<prices[rt]) {
                int currProfit = prices[rt]-prices[lft];
                maxProfit = Math.max(maxProfit,currProfit);
            }

            else {
                lft = rt;
            }
        }

        return maxProfit;
    }
}
