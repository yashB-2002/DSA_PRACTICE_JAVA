import java.util.ArrayList;
// Given an integer array nums, return the length of the longest strictly increasing subsequence.

// A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
public class lis {
  public static void main(String[] args) {
    int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
    System.out.println(lengthOfLIS(nums));
  }

  public static int lengthOfLIS(int[] nums) {
    ArrayList<Integer> l = new ArrayList<>();
    l.add(nums[0]);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > l.get(l.size() - 1))
        l.add(nums[i]);
      else
        l.set(bs(nums[i], l), nums[i]);
    }
    return l.size();
  }

  public static int bs(int num, ArrayList<Integer> l) {
    int s = 0, e = l.size() - 1;
    while (s <= e) {
      int mid = (s + e) / 2;
      if (l.get(mid) == num) // if elem is equal than replace num with that pos only
        return mid;
      if (l.get(mid) > num) // incoming elem is < than curr elem in list so go for more smaller elem than
                            // curr elem
        e = mid - 1;
      else // incoming elem is > than curr elem in list so go for more greater elem than
           // curr elem
        s = mid + 1;
    }
    return s;
  }
}
