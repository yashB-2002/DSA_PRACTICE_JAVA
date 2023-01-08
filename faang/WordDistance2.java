import java.util.Scanner;

public class WordDistance2 {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.next();
        }
        String s1 = s.next();
        String s2 = s.next();
        System.out.println(ans(arr,s1,s2));
        s.close();
    }
    public static int ans(String[] a, String a1, String b1) {
		int ans=a.length;
		if(a1.equals(b1)) {
			int p = -1;
			for(int i = 0; i< a.length; i++) {
				if(a[i].equals(a1)) {
					if(p==-1) {
						p=i;
					}
					else{
						ans=Math.min(ans,i-p);
						p=i;
					}
				}
			}
		}
		else{
        int w1 = -1, w2 = -1;
        for(int i = 0; i < a.length; i++) {
            if(a[i].equals(a1)) w1 = i;
            if(a[i].equals(b1)) w2 = i;
            if(w1 != -1 && w2 != -1) ans = Math.min(ans,Math.abs(w1-w2));
        }
		}
		return ans;
    }    
}
