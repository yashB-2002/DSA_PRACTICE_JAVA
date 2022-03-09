public class pivot {
    public static void main(String[] args) {
        int[] arr = {7,9,1,2,3};
        int pivot = getPivot(arr);
        System.out.println(pivot);
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