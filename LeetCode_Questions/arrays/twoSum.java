import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
  public static void main(String[] args) {
    int[] a = { 5, 4, 9, 8, 1, 2, 36 };
    System.out.println(Arrays.toString(twoSum1(a, 6)));
  }

  public static int[] twoSum1(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] ans = new int[2];

    for (int i = 0; i < nums.length; i++) {

      if (map.containsKey(target - nums[i])) {
        ans[0] = map.get(target - nums[i]);
        ans[1] = i;
        return ans;
      }
      map.put(nums[i], i);
    }
    return ans;
  }
}