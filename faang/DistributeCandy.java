import java.util.HashSet;
import java.util.Scanner;

// Given an integer array with even length, where different numbers in this array represent different kinds of candies.
// Each number means one candy of the corresponding kind
//  You need to distribute these candies equally in number to brother and sister.
// Print the maximum number of kinds of candies the sister could gain.
public class DistributeCandy {
    public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(cal(arr));
        s.close();
    }
	public static int cal(int[] a) {
		int n = a.length/2;
		HashSet<Integer> s = new HashSet<>();
		for(int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		return Math.min(s.size(),n);
	}
}
