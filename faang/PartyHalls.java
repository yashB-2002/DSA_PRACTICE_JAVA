import java.util.Arrays;
import java.util.Scanner;

public class PartyHalls {
    // Given an array of meeting time intervals consisting of start and end times [[S1,E1],[S2,E2],…] (SI < EI), 
    // find the minimum number of party halls required.
    public static void main (String args[]) {
		Scanner ss= new Scanner(System.in);
        int n = ss.nextInt();
        int[] s = new int[n];
		int[] e = new int[n];
        for(int i = 0; i < n; i++) {
            s[i] = ss.nextInt();
			e[i] = ss.nextInt();
        }
        System.out.println(ans(s,e));
        ss.close();
    }
	public  static int ans(int[] s, int[] e) {
		int i = 0, j = 0, c = 0, max = 0;
		Arrays.sort(s);
		Arrays.sort(e);
		while(i < s.length && j < e.length) {
			if(s[i] < e[j]) {
				i++;
				c++;
			}
			else {
				j++;
				c--;
			}
			if(max < c) max = c;
		}
		return max;
	}
}
