public class bitonicPoint {
  public static void main(String[] args) {
    int[] a = { 4, 5, 6, 7, 0, 1, 2 };
    System.out.println("index of element is : " + bitonic(a));
  }

  private static int bitonic(int[] nums) {
    int s = 0, e = nums.length - 1;
    while (s <= e) {
      int m = s + (e - s) / 2;
      if ((m == 0 || nums[m] > nums[m - 1]) && (m == nums.length - 1 || nums[m] > nums[m + 1]))
        return nums[m];
      else if (nums[m] < nums[m - 1]) { // decreasing part
        e = m - 1;
      } else if (nums[m] < nums[m + 1]) { // increasing part
        s = m + 1;
      }
    }
    return -1;
  }
}
