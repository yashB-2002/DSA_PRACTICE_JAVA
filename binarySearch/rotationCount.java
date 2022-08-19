// rotation count is basically the index of min element.
public class rotationCount {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6 };
    System.out.println("rotation count is : " + count(a));
  }

  public static int count(int[] nums) {
    int s = 0, e = nums.length - 1;
    while (s <= e) {
      int m = s + (e - s) / 2;
      if (m == 0 || nums[m] < nums[m - 1])
        return m;
      else if (nums[m] < nums[s]) { // left part is unsorted so ans lie in this part
        e = m - 1;
      } else if (nums[m] > nums[e]) { // right part is unsorted so ans lie in this part
        s = m + 1;
      } else {
        return s;
      }
    }
    return -1;
  }
}
