// we can do only one transaction
public class buySellStockI {
  public static void main(String[] args) {
    int[] arr = { 1, 5, 1, 2, 9 };
    int ans = maxProfit(arr);
    System.out.println(ans);
  }

  // iterative approach
  public static int maxProfit(int[] prices) {
    int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      minPrice = Math.min(minPrice, prices[i]);
      maxPro = Math.max(maxPro, prices[i] - minPrice);
    }
    return maxPro;
  }
}