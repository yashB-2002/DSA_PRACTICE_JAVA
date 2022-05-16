import java.util.Arrays;

public class chocDist {
  public static void main(String[] args) {
    int[] a = { 5, 6, 4, 8, 2, 4, 63 };
    System.out.println(dist(a, 7, 4));
  }

  public static int dist(int[] nums, int n, int m) {
    int res = Integer.MAX_VALUE;
    Arrays.sort(nums);
    for (int i = 0; i <= n - m; i++) {
      int min = nums[i];
      int max = nums[i + m - 1];
      int gap = max - min;
      res = Math.min(gap, res);
    }
    return res;
  }
}