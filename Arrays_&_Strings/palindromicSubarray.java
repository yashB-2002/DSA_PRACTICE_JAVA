// import java.util.*;`
// Subarray of length K whose concatenation forms a palindrome
public class palindromicSubarray {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 1, 1, 5 };
    int k = 4;
    // System.out.println("Index at which palindromic subarray starts is: " +
    // findSubArray(arr, k));
    int idx = (findSubArray(arr, k));
    for (int i = idx; i < idx + k; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int findSubArray(int[] arr, int k) {
    int num = 0;
    for (int i = 0; i < k; i++) {
      num = num * 10 + arr[i];
    }
    if (isPalindrome(num)) {
      return 0;
    }
    for (int i = k; i < arr.length; i++) {
      num = (num % (int) Math.pow(10, k - 1)) * 10 + arr[i];
      if (isPalindrome(num)) {
        return i - k + 1;
      }
    }
    return -1;
  }

  private static boolean isPalindrome(int num) {
    int n = num, revNum = 0;
    while (n > 0) {
      revNum = revNum * 10 + n % 10;
      n /= 10;
    }
    if (num == revNum) {
      return true;
    }
    return false;
  }
}
