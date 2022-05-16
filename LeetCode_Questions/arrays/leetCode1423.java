// 1423. Maximum Points You Can Obtain from Cards
public class leetCode1423 {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6, 1 };
    System.out.println(maxScore(a, 3));
  }

  public static int maxScore(int[] cardPoints, int k) {
    int sum = 0;
    int[] leftSum = new int[k + 1];
    int[] rightSum = new int[k + 1];
    leftSum[0] = 0;
    rightSum[0] = 0;
    for (int i = 1; i <= k; i++) {
      leftSum[i] = leftSum[i - 1] + cardPoints[i - 1];
    }
    for (int i = 1; i <= k; i++) {
      rightSum[i] = rightSum[i - 1] + cardPoints[cardPoints.length - i];
    }
    for (int i = 0; i <= k; i++) {
      sum = Math.max(sum, leftSum[i] + rightSum[k - i]);
    }
    return sum;
  }
}