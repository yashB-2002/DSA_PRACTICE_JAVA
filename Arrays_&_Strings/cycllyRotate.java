import java.util.Arrays;

// rotate array cyclically by k times
public class cycllyRotate {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 4, 53, 2 };
    // 1st -> 2 53 4 3 1, 2nd -> 4 53 2 1 3
    // 4 53 2 1 3
    int k = 3;
    // rotate1(arr, k);
    rotate4(arr, k);
    System.out.println(Arrays.toString(arr));
  }

  // approach-1
  // t.c -> o(k*n) s.c -> o(1)
  public static void rotate1(int arr[], int k) {
    int n = arr.length;
    for (int j = 0; j < k; j++) {
      int temp = arr[n - 1];
      for (int i = n - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
      }
      arr[0] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
  // approach -2
  // t.c -> o((k%n)*n) technically we don't need to rotate array k times we only
  // need to do it k%n time

  // apporach-3
  // t.c -> o(n) s.c-> O(n)
  // we will take array and traverse ecah element in given array and put them in
  // correct pos in answer array (correct pos is each elemnet is placed k
  // positions ahead of its current index in given array, new index = old index %
  // n).

  // approach-4
  // t.c -> o(n), s.c -> o(1)
  public static void rotate4(int[] nums, int k) {

    int len = nums.length;
    k %= len;

    rotate(nums, 0, len - 1);
    rotate(nums, 0, k - 1);
    rotate(nums, k, len - 1);
  }

  private static void rotate(int[] nums, int start, int end) {

    while (start < end) {
      int temp = nums[start];
      nums[start++] = nums[end];
      nums[end--] = temp;
    }
  }

}
