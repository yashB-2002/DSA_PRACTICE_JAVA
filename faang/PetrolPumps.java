import java.util.Scanner;

public class PetrolPumps {
    public static void main (String args[]) {
		Scanner ss= new Scanner(System.in);
        int n = ss.nextInt();
        int[] p = new int[n];
		int[] c = new int[n];
        for(int i = 0; i < n; i++) {
            p[i] = ss.nextInt();
			c[i] = ss.nextInt();
        }
        System.out.println(ans(p,c));
        ss.close();
    }
	public static int ans(int[] p, int[] c) {
		int net=0,cur=0,s=0;
		for(int i = 0;i < p.length; i++) {
			net += p[i]-c[i];
			cur += p[i]-c[i];
			if(cur < 0) {
				cur =0;
				s=i+1;
			}
		}
		if(net < 0) return -1;
		return s;
	}
}
