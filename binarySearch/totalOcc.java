public class totalOcc {
    private static int lastOcc(int[] arr, int key) {
        int s= 0, e = arr.length-1;
        int idx = -1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(arr[mid] == key ) {
                idx = mid;
                s = mid + 1; 
            }
            else if (arr[mid] < key) {
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return idx;
    }
    private static int firstOcc(int[] arr, int key) {
        int s= 0, e = arr.length-1;
        int idx = -1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(arr[mid] == key ) {
                idx = mid;
                e = mid - 1; 
            }
            else if (arr[mid] < key) {
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5,6,6,7,7,7,7};
        int key = 7;
        int first = firstOcc(arr, key);
        int last = lastOcc(arr, key);
        int totalOcc = (last - first) + 1;
        System.out.println("total occurence of key : " + totalOcc);
    }
}