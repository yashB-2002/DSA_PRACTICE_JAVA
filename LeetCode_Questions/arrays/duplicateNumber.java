import java.util.*;

public class duplicateNumber {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 5, 5, 4 };
    int ans = findDuplicate1(arr);
    System.out.println(ans);
  }

  // o(nlogn)
  public static int findDuplicate1(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1])
        return nums[i];
    }

    return -1;
  }

  // t.c o(n) , s.c. o(n)
  public static int findDuplicate2(int[] nums) {
    Set<Integer> set = new HashSet<Integer>();
    for (int num : nums) {
      if (set.contains(num))
        return num;
      set.add(num);
    }
    return -1;
  }

  // t.c. o(n), s.c. o(1) negativeMarking approach
  public static int findDuplicate3(int[] nums) {
    int duplicate = -1;
    for (int i = 0; i < nums.length; i++) {
      int cur = Math.abs(nums[i]);
      if (nums[cur] < 0) {
        duplicate = cur;
        break;
      }
      nums[cur] *= -1;
    }
    for (int i = 0; i < nums.length; i++)
      nums[i] = Math.abs(nums[i]);

    return duplicate;
  }

  // t.c. o(n) , s.c. o(1);
  public static int findDuplicate4(int[] nums) {
    int slow = nums[0], fast = nums[0];
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[nums[fast]];
    }
    slow = nums[0];
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }
    return slow;
  }
}