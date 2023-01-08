import java.util.Scanner;

public class MaxProdSubarray {
    public static void main (String args[]) {
		Scanner ss= new Scanner(System.in);
        int n = ss.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++) {
            p[i] = ss.nextInt();
        }
        System.out.println(ans(p));
        ss.close();
    }
	public static int ans(int[] a) {
		int n = a.length, pp = 1, np =1, max=Integer.MIN_VALUE;
		if(n==1)return a[0];
		boolean hasZero = false, hasPos = false;
		for(int i : a) {
			if(i > 0) {
				hasPos=true;
				pp *= i;
				if(np != 1) np *= i;
			}
			else if(i < 0) {
				int temp = pp;
				pp = Math.max(1,np*i);
				np=temp*i;
			}
			else {
				hasZero=true;
				pp=np=1;
			}
			if(max < pp) max = pp;
		}
		if(max==1) {
			if(hasPos) return max;
			if(hasZero) return 0;
		}
		return max;
	}
}
