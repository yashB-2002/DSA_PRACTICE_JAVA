import java.util.ArrayList;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] arr = { 3,2,3 };
        ArrayList<Integer> ans = majorityElement(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        int n = nums.length;
        int n1 = -1;
        int n2 = -1;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (n1 == nums[i]) {
                c1++;

            } else if (n2 == nums[i]) {
                c2++;
            } else if (c1 == 0) {
                n1 = nums[i];
                c1 = 1;
            } else if (c2 == 0) {
                n2 = nums[i];
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int i = 0; i < n; i++) {
            if (n1 == nums[i]) {
                c1++;
            } else if (n2 == nums[i]) {
                c2++;
            }
        }
        if (c1 > n / 3) {
            l.add(n1);
        }
        if (c2 > n / 3) {
            l.add(n2);
        }
        return l;

    }
}