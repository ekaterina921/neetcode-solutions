package solutions.slidingWindow;

public class BestTimeToBuyAndSellStock {

    public static int findBestTimeToBuyAndSellStock(int[] prices) {
        int leftPointer = 0, rightPointer = 1;
        int maxProfit = 0;
        while(rightPointer < prices.length){
            if(prices[leftPointer] < prices[rightPointer]) {
                int profit = prices[rightPointer] - prices[leftPointer];
                maxProfit = Math.max(maxProfit, profit);
            }
                else {
                    leftPointer = rightPointer;
                }
                rightPointer++;
            }
        return maxProfit;
    }

}
