public class implementation {
    public static int binarySearch(int[] arr, int key) {
        int s = 0, e = arr.length-1;
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
    public static void main(String[] args) {
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++) {
            arr[i] = i;
        }
        int key = 4;
        int index = binarySearch(arr,key);
        System.out.println("Index of " + key + " is " + index);
    }
}