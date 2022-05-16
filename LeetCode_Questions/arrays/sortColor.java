public class sortColor {
  public static void main(String[] args) {

  }

  // Dutch National Flag Algorithm approach
  public static void sortColors1(int[] nums) {
    int low = 0;
    int mid = 0;
    int high = nums.length - 1;
    while (mid <= high) {
      if (nums[mid] == 0) {
        int temp = nums[low];
        nums[low] = nums[mid];
        nums[mid] = temp;
        low++;
        mid++;
      } else if (nums[mid] == 1) {
        mid++;
      } else if (nums[mid] == 2) {
        int temp = nums[mid];
        nums[mid] = nums[high];
        nums[high] = temp;
        high--;
      }
    }
  }

  // counting approach
  public void sortColors2(int[] nums) {
    int cnt0 = 0;
    int cnt1 = 0;
    int cnt2 = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0)
        cnt0++;
      else if (nums[i] == 1)
        cnt1++;
      else if (nums[i] == 2)
        cnt2++;
    }
    int i = 0;
    while (i < nums.length) {
      while (cnt0 != 0) {
        nums[i] = 0;
        cnt0--;
        i++;
      }
      while (cnt1 != 0) {
        nums[i] = 1;
        cnt1--;
        i++;
      }
      while (cnt2 != 0) {
        nums[i] = 2;
        cnt2--;
        i++;
      }
    }
  }
}