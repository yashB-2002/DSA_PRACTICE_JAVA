public class sqRoot {
    public static int binarySearch( int s, int e, int num) {
        int ans= -1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if((mid * mid )== num ) {
                return mid;
            }
            else if ( mid*mid < num ) {
                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 139;
        int root = binarySearch(0,n,n);
        System.out.println(root);
    }
}