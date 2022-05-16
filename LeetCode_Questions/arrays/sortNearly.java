import java.util.PriorityQueue;

// we need to sort nearly sorted array which is sorted k times.
public class sortNearly {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 1, 4, 6, 7, 5, 8, 9 };
    sort(arr, 3);
  }

  public static void sort(int[] a, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i <= k; i++) {
      pq.add(a[i]);
    }
    for (int i = k + 1; i < a.length; i++) {
      System.out.print(pq.remove() + " ");
      pq.add(a[i]);
    }
    while (pq.size() > 0) {
      System.out.print(pq.remove() + " ");
    }
  }
}