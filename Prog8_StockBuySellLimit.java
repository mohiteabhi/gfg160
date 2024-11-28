class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buyPrice) { 
                profit = Math.max(profit, prices[i] - buyPrice); 
            } else {
                buyPrice = prices[i]; 
            }
        }
        return profit;
    }
}