public class majorityElement1 {
    public static void main(String[] args) {
        int[] arr = {3,1,3,3,2};
        int n = 5;
        int ans = majorityElement(arr,n);
        System.out.println(ans);
    }
    public static int majorityElement(int arr[], int n) {
        int maj = arr[0];
        int count = 1;
        for(int i= 1; i < n; i++ ) {
            if(arr[i] == maj ) {
                count++;
            }
            else {
                if(count == 1) {
                    maj = arr[i];
                }
                else {
                    count--;
                }
            }
        }
        count = 0;
        for(int j = 0 ; j < n ; j++ ) {
            if(arr[j] == maj) {
                count++;
            }
        }
        if(count > n/3) {
            return maj;
        }
        return -1;
    }
}