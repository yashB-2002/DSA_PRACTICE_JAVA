public class bookAllocation {
    public static void main(String[] args) {
        int[] arr = {5,10,30,20,15};
        int m = 3;
        int ans = allocate(arr,m);
        System.out.println("Min number of max pages alloted to student is : " + ans);
    }

    private static int allocate(int[] arr, int m) {
        int s = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int e = sum;
        int res = 0;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(isValid(arr,m,mid)) {
                res = mid;
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return res;
    }

    private static boolean isValid(int[] arr, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            }
            else {
                studentCount++;
                if(arr[i] > mid || studentCount > m) {
                    return false;
                }
                else {
                    pageSum = arr[i];
                }
            }
        }
        return true;
    }
}