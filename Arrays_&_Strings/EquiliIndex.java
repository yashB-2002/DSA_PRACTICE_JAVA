public class EquiliIndex {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 0, 3 };
    int n = 4;
    System.out.println(findEquilibrium(nums, n));
  }

  public static int findEquilibrium(int nums[], int n) {
    // add code here.
    int sum = 0;
    for (int num : nums)
      sum += num;
    int lsum = 0, rsum = sum;
    for (int i = 0; i < nums.length; i++) {
      rsum -= nums[i];
      if (rsum == lsum)
        return i;
      lsum += nums[i];
    }
    return -1;
  }
}
