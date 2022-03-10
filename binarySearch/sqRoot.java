public class sqRoot {
    public static int binarySearch(int s, int e, int num) {
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if ((mid * mid) == num) {
                return mid;
            } else if (mid * mid < num) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static double precision(int temp, int num, int precision) {
        double factor = 1;
        double ans = temp;

        for (int i = 0; i < precision; i++) {
            factor = factor / 10;

            for (double j = ans; j * j < num; j = j + factor) {
                ans = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 37;
        int root = binarySearch(0, n, n);
        double ans = precision(root, n, 2);
        System.out.println(ans);
    }
}