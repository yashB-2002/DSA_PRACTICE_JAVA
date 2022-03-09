public class firstOccurence {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5,6,6,7,7,7,7};
        int key = 4;
        int index = search(arr,key);
        System.out.println("key found at : "+ index);
    }

    private static int search(int[] arr, int key) {
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
}