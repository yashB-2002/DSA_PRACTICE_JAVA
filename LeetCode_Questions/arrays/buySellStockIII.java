// we can do atmost 2 transactions
public class buySellStockIII {
  public static void main(String[] args) {
    int[] arr = { 7, 1, 5, 3, 6, 4 };
    int ans = maxProfit(arr);
    System.out.println(ans);
  }

  public static int maxProfit(int[] prices) {
    int maxProfit1 = 0;
    int minSoFar1 = Integer.MAX_VALUE;
    int maxProfit2 = 0;
    int minSoFar2 = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      minSoFar1 = Math.min(minSoFar1, prices[i]);
      maxProfit1 = Math.max(maxProfit1, prices[i] - minSoFar1);
      minSoFar2 = Math.min(minSoFar2, prices[i] - maxProfit1);
      maxProfit2 = Math.max(maxProfit2, prices[i] - minSoFar2);

    }
    return maxProfit2;
  }
}