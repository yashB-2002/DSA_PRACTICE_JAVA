public class searchInRotated {
    public static void main(String[] args) {
        int[] arr = {7,9,1,2,3};
        int index = -1;
        int pivot = getPivot(arr);
        int key = 1;
        if(arr[pivot] <= key && key <= arr[arr.length-1]) {
            index = binarySearch(arr,key,pivot,arr.length-1);
        }
        else {
            index = binarySearch(arr,key,0,pivot-1);
        }
        System.out.println(index);
    }
    public static int binarySearch(int[] arr, int key, int s, int e) {
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(arr[mid] == key) {
                return mid;
            }
            if(key > arr[mid]) {
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return -1;
    }

    private static int getPivot(int[] arr) {
        int s = 0, e = arr.length-1;
        while(s < e) {
            int m = s + (e-s)/2;
            if(arr[m] >= arr[0]){
                s = m + 1;
            }
            else {
                e = m;
            }
        }
        return s;
    }
}