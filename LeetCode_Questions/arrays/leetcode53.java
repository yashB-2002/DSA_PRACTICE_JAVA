// maximum subarray
public class leetcode53 {
  public static void main(String[] args) {
    int[] arr = { 1, 5, 1, 4, 2, 6, 4 };
    System.out.println(maxSubArray(arr));
  }

  public static int maxSubArray(int[] nums) {
    int size = nums.length;
    int maxSum = Integer.MIN_VALUE, currSum = 0;

    for (int i = 0; i < size; i++) {
      currSum += nums[i];
      if (maxSum < currSum)
        maxSum = currSum;
      if (currSum < 0)
        currSum = 0;
    }
    return maxSum;
  }
}