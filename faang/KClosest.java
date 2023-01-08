import java.util.ArrayList;

public class KClosest {
    public static void main(String[] args) {
        System.out.println(kclosest(new int[]{1,2,3,4,5,6}, 3, 4));
    }
    public static ArrayList<Integer> kclosest(int[] a, int x, int k) {
        int csum = 0, sum = 0, pos = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            csum+=Math.abs(x-a[i]);
        }
        sum=csum;
        for(int i = 1; i <= a.length-k; i++) {
            csum-=Math.abs(x-a[i-1]);
            csum+=Math.abs(x-a[i+k-1]);
            if(csum<sum) {
                sum=csum;
                pos=i;
            }
        }
        for(int i = 0; i < k; i++) {
            ans.add(a[pos+i]);
        }
        return ans;
    }
}
