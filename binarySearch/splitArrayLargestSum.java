public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = { 20, 15, 10, 17 };
        int m = 3;
        int ans = splitArray(arr, m);
        System.out.println("The Smallest largest sum among these m subarrays is = " + ans);
    }

    public static int splitArray(int[] nums, int m) {
        int s = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int e = sum;
        int res = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValid(nums, m, mid)) {
                res = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return res;
    }

    private static boolean isValid(int[] arr, int m, int mid) {
        int arrCount = 1;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arrSum + arr[i] <= mid) {
                arrSum += arr[i];
            } else {
                arrCount++;
                if (arr[i] > mid || arrCount > m) {
                    return false;
                } else {
                    arrSum = arr[i];
                }
            }
        }
        return true;
    }
}