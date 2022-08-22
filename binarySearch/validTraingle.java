import java.util.*;

public class validTraingle {
  public static void main(String[] args) {
    int[] nums = { 2, 2, 3, 4 };
    System.out.println(triangleNumber(nums));
  }

  public static int triangleNumber(int[] nums) {
    Arrays.sort(nums);
    int count = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
      int j = i - 1, k = 0;
      while (k < j) {
        if (nums[k] + nums[j] > nums[i]) {
          count += (j - k);
          j--;
        } else {
          k++;
        }
      }
    }
    return count;
  }
}
