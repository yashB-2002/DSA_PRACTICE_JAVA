public class peakElemnent {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,2,1};
        int element = search(arr);
        System.out.println("peak element is : " + element);
    }

    private static int search(int[] arr) {
        int s = 0, e = arr.length-1;
        while(s < e) {
            int mid = s + (e-s)/2 ;
            if(arr[mid] < arr[mid+1]) {
                s = mid + 1;
            }
            else if(arr[mid] > arr[mid+1]) {
                e = mid;
            }
        }
        return arr[e];
    }
}