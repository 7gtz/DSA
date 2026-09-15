class Solution {
    public int maxProfit(int[] prices) {

        int lowest = 100,highest = 0,profit = 0;

        for (int i = 0; i < prices.length; i++) {
            lowest = Math.min(prices[i],lowest);
            profit = Math.max(prices[i]-lowest,profit);
        }
        return profit;
        

    }
}
