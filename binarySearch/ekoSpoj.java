public class ekoSpoj {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {20,15,10,17};
        // Arrays.sort(arr);
        int m = 7;
        int ans = solve(arr,m,n);
        System.out.println(ans);    
    }

    private static int solve(int[] arr, int m, int n) {
        int s = 0;
        int max = -1;
        for(int i = 0; i < n; i++)  {
            max = Math.max(max,arr[i]);
        }
        int e = max;
        int ans = -1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(isPossible(arr,m,n,mid)) {
                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int m, int n, int mid) {
        int woodSum = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > mid) {
                woodSum += arr[i] - mid;
            }
        }
        if(woodSum >= m) {
            return true;
        }
        else {
            return false;
        }
    }
}