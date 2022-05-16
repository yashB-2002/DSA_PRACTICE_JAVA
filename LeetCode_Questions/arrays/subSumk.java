import java.util.HashMap;

// count subarrays that has sum equals to k
public class subSumk {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 6 };
    System.out.println(count(arr, 5));
  }

  public static int count(int[] a, int k) {
    int ans = 0;
    HashMap<Integer, Integer> hm = new HashMap<>();
    hm.put(0, 1);
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
      if (hm.containsKey(sum - k)) {
        ans += hm.get(sum - k);
      }
      hm.put(sum, hm.getOrDefault(sum, 0) + 1);
    }
    return ans;
  }
}