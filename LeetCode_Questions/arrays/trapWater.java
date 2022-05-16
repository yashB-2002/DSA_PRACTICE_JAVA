
// trapping rain water
// import java.util.*;

public class trapWater {
  public static void main(String[] args) {
    int[] a = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    System.out.println(trap(a));
  }

  public static int trap(int[] h) {
    int res = 0, n = h.length;
    int[] l = new int[n];
    int[] r = new int[n];

    l[0] = h[0];
    for (int i = 1; i < n; i++) {
      l[i] = Math.max(l[i - 1], h[i]);
    }
    r[n - 1] = h[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      r[i] = Math.max(r[i + 1], h[i]);
    }
    for (int i = 0; i < n; i++) {
      res += (Math.min(l[i], r[i]) - h[i]);
    }
    return res;
  }

}