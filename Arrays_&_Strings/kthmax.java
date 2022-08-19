
import java.util.PriorityQueue;

public class kthmax {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 3, 2, 5 };
    System.out.println(kLargestt(arr, 5, 3));
  }

  // T.C -> O(N) (FOR FILING PQ) + O((K-1) * N*LOGN) (FOR REMOVING ELEMENTS FROM
  // PQ)
  public static int kLargestt(int[] arr, int n, int k) {
    // code here
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int[] ans = new int[k]; // this array will conatain k largest element
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
    return ans[0]; // it will contain kth largest element in 1st position and largest elemnt at
                   // last position
  }
}
