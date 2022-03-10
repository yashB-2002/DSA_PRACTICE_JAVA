import java.util.Arrays;
public class aggresiveCow {
    public static void main(String[] args) {
        int[] arr = {20,15,10,17};
        int k = 3;
        System.out.println(solve(arr,k));
    }
    public static int solve(int[] arr, int k) {
        Arrays.sort(arr);
        int s = 0;
        int max = -1;
        for(int elem : arr) {
            max = Math.max(elem, max);
        }
        int e = max;
        int ans = -1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(isSol(arr,k,mid)) {
                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }
    public static boolean isSol(int[] arr, int k, int mid) {
        int cowCount = 1;
        int pos = arr[0];
        for(int i = 0; i < arr.length; i++ ) {
            if(arr[i] - pos >= mid) {
                cowCount++;
                if(cowCount == k) {
                    return true;
                } 
                pos = arr[i];
            }
        }
        return false;
    }
}