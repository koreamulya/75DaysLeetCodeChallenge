class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minSoFar=prices[0];
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-minSoFar;
            profit=Math.max(profit,cost);
            minSoFar=Math.min(minSoFar,prices[i]);
        }
        return profit;
    }
}
/*int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;*/