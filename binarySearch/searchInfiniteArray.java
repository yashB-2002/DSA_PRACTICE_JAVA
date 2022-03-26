public class searchInfiniteArray {
    public static void main(String[] args) {
        int[] arr = new int[500];
        for(int i = 0; i < 500; i++) {
            arr[i] = i+3;
        }
        int key = 200;
        int res = ans(arr,key);
        System.out.println("Index of key is : " + res);
    }

    public static int ans(int[] arr, int target) {
        int s = 0, e = 1;
        while(target > arr[e]) {
            int newStart = e + 1;
            e = e + 2 * (e - s + 1);
            s = newStart;
        }
        return binarySearch(arr,target,s,e);
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
}