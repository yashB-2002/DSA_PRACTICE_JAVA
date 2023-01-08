import java.util.Scanner;

public class OverlappingRect {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];
        int[] arr2 = new int[4];
        for(int i = 0; i < 4; i++) {
            arr[i] = s.nextInt();
            arr2[i] = s.nextInt();
        }
        if(cal(arr,arr2)) {
            System.out.println("1");    
        }
        else System.out.println("0");
        s.close();
    }
    public static boolean cal(int[] r1, int[] r2) {
        return !((r1[2]<=r2[0]) || (r1[1]>=r2[3]) || (r1[0]>=r2[2]) || (r1[3]<=r2[1]));
    }
}
