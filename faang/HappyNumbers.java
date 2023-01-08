import java.util.*;
public class HappyNumbers {
    public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(check(n));
        s.close();
    }
	public static boolean check(int n) {
		Set<Integer> s = new HashSet<>();
		return check(s,n);
	}
	public static boolean check(Set<Integer> s, int n) {
		if(n == 1) return true;
		if(s.contains(n)) return false;
		s.add(n);
		n = update(n);
		return check(s,n);
	}
	public static int update(int n) {
		int newN = 0;
		while(n > 0) {
			int mod = n%10;
			newN = newN + mod*mod;
			n/=10;
		}
		return newN;
	}
}
