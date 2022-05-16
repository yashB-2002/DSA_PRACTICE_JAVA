import java.util.Arrays;
import java.util.PriorityQueue;

public class kLargest {
  public static void main(String[] args) {
    int[] a = { 4, 8, 9, 5, 41 };
    System.out.println(kthLargest(a, 5, 3));
  }

  public static int[] kthLargest(int[] arr, int n, int k) {
    int[] ans = new int[k];
    Arrays.sort(arr);
    for (int i = 0; i < k; i++) {
      ans[i] = arr[n - 1 - i];
    }
    return ans;
  }

  public static int[] kLargestt(int[] arr, int n, int k) {
    // code here
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int[] ans = new int[k];
    for (int i = 0; i < n; i++) {
      if (i < k) {
        pq.add(arr[i]);
      } else {
        if (arr[i] > pq.peek()) {
          pq.remove();
          pq.add(arr[i]);
        }
      }
    }
    int j = 0;
    while (pq.size() > 0) {
      ans[j++] = pq.remove();
    }
    return ans;
  }
}