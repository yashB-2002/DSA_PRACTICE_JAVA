import java.util.Scanner;

// The heights of certain Buildings which lie adjacent
//  to each other are given. Light starts falling from left side of the buildings.
//   If there is a building of certain Height, all the buildings to the right side of it having lesser heights cannot see the sun .
//    The task is to find the total number of such buildings that receive light.
public class sunnyBuilding {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0) {
			int n = s.nextInt();
			int ans = 0, maxh = Integer.MIN_VALUE;
			for(int i = 0; i < n; i++) {
				int num = s.nextInt();
				if(num >= maxh ) {
					ans++;
					maxh = num;
				}
			}
			System.out.println(ans);
		}
        s.close();
    }
}
