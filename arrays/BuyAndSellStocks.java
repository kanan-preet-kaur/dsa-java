public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = findMaxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }

    // Finding Maximum Profit for prices of n days
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int findMaxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            int sellPrice = prices[i];

            // Case 1
            if (buyPrice < sellPrice) {
                int profit = sellPrice - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            // Case 2
            else {
                buyPrice = sellPrice;
            }
        }
        return maxProfit;
    }
}