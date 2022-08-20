import java.util.*;

public class maxSumSubarray {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 34, 5, 6));
    int k = 3;
    System.out.println(maximumSumSubarray(k, arr, 6));
  }

  public static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
    if (N < K) {
      return -1;
    }
    // code here
    long preSubSum = 0;
    for (int i = 0; i < K; i++) {
      preSubSum += Arr.get(i);
    }
    long nextSubSum = preSubSum;
    for (int i = K; i < N; i++) {
      nextSubSum += Arr.get(i) - Arr.get(i - K);
      preSubSum = Math.max(nextSubSum, preSubSum);
    }
    return preSubSum;
  }
}
