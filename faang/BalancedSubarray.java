import java.util.*;
public class BalancedSubarray {
    // You are given an array which contains elements equal to only 0 or 1.
    // Your task is to find out the maximum length of the subarray which
    // contains equal number of zeroes' and one's
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(calc(arr));
        s.close();
    }
	public static int calc(int[] a) {
		int ans = 0, sum = 0;
		HashMap<Integer,Integer> m= new HashMap<>();
		m.put(0,-1);
		for(int i = 0; i < a.length; i++) {
			int k = a[i];
			if(k == 0) sum++;
			if(k == 1) sum--;
			if(m.containsKey(sum)) ans = Math.max(ans,i-m.get(sum));
			else m.put(sum,i);
		}
		return ans;
	}
}
