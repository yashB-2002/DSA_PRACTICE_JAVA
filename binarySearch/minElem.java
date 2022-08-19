public class minElem {
// same question is find rotation count
  public static void main(String[] args) {
    int[] a = { 4, 5, 6, 7, 0, 1, 2 };
    System.out.println("minimum element is : " + findMin(a));
  }

  public static int findMin(int[] nums) {
    int s = 0, e = nums.length - 1;
    while (s <= e) {
      int m = s + (e - s) / 2;
      if (m == 0 || nums[m] < nums[m - 1])
        return nums[m];
      else if (nums[s] > nums[m]) { // left part is unsorted so ans lie in this part
        e = m - 1;
      } else if (nums[e] < nums[m]) { // right part is unsorted so ans lie in this part
        s = m + 1;
      } else {
        return nums[s];
      }
    }
    return -1;
  }
}
