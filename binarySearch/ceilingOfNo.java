public class ceilingOfNo {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
    int target = 19;
    System.out.println("ceiling of number is : " + ceiling(arr, target));
    System.out.println(" floor of target is : " + floor(arr, target));
  }

  // ceiling = smallest numner that is >= target
  private static int ceiling(int[] arr, int target) {
    int s = 0, e = arr.length - 1, ans = -1;
    while (s <= e) {
      int m = s + (e - s) / 2;
      if (arr[m] == target)
        return arr[m];
      if (arr[m] < target) {
        s = m + 1;
      } else {
        ans = arr[m];
        e = m - 1;
      }
    }
    return ans;
  }

  // floor = greatest number <= target
  private static int floor(int[] arr, int target) {
    int s = 0, e = arr.length - 1, ans = -1;
    while (s <= e) {
      int m = s + (e - s) / 2;
      if (arr[m] == target)
        return arr[m];
      else if (arr[m] < target) {
        ans = arr[m];
        s = m + 1;
      } else {
        e = m - 1;
      }
    }
    return ans;
  }
}
