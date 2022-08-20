// Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
class minSizeSubarray {
  public static void main(String[] args) {
    int[] nums = { 2, 3, 1, 2, 4, 3 };
    int target = 7;
    System.out.println(minSubArrayLen(target, nums));

  }

  public static int minSubArrayLen(int target, int[] nums) {
    int i = 0, j = 0, sum = 0, n = nums.length, ans = Integer.MAX_VALUE;
    while (j < n) {
      while (sum < target && j < n) {
        sum += nums[j++];
      }
      while (sum >= target && i < n) {
        if (j - i < ans) {
          ans = j - i;
        }
        sum -= nums[i++];
      }
    }
    return (ans == Integer.MAX_VALUE) ? 0 : ans;
  }
}